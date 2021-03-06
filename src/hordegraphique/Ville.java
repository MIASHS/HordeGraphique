/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hordegraphique;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Valère,Sebastien,Gabriel
 */
public class Ville extends Case {
    
    Scanner sc=new Scanner(System.in);
    private Item[] entrepot= new Item[4]; // tableau d'entrepot//
    private int tauxDefense; // indique le taux de defence
    ArrayList<Construction> batiment = new ArrayList<Construction>(7); // liste de construction//
    ArrayList<Construction> batimentEnCours = new ArrayList<Construction>(7); // liste de construction//
    private boolean ouverturePorte = true; // indique si porte ouverte ou non
    
    public int getTauxDefense() {return tauxDefense;}
    public void setTauxDefense(int tauxDefense) {this.tauxDefense = tauxDefense;}

    public Ville(Jeu partie) {
        super(13, -13);
        int i = ((26*26)/2);
        //entrepot={50,0,0,0}; //ration, planche,clou,boisson
        partie.getGrille().setTabCase(i, this);
        super.laVille = true;
        partie.getGrille().setxyVille(13, -13);
        entrepot[0]=new Item(Journal.consulterDescription(51),50,Journal.consulterDescription(1));
        entrepot[1]=new Item(Journal.consulterDescription(54),0,Journal.consulterDescription(2));
        entrepot[2]=new Item("Plaques de métal",0,Journal.consulterDescription(3));
        entrepot[3]=new Item(Journal.consulterDescription(53),0,Journal.consulterDescription(4));
        /*
        entrepot.add(0,new Item(Journal.consulterDescription(51),50,Journal.consulterDescription(1)));
        entrepot.add(1,new Item(Journal.consulterDescription(54),0,Journal.consulterDescription(2)));
        entrepot.add(2,new Item("Plaques de métal",0,Journal.consulterDescription(3)));
        entrepot.add(3,new Item(Journal.consulterDescription(53),0,Journal.consulterDescription(4)));
        */
    }

    public Ville(Jeu partie, int absysse, int ordonnee) {
        super(absysse, ordonnee);
        int i = ((absysse + 1) * (-1 * ordonnee));
        partie.getGrille().setTabCase(i, this);
        super.laVille = true;
        partie.getGrille().setxyVille(absysse, ordonnee);
    }

    public ArrayList<Construction> afficherConstruction(Journal Journal){return Journal.getTabConstruction();}
    public Item[] getEntrepot() {return entrepot;}
    public void setEntrepot(Item[] entrepot) {this.entrepot = entrepot;}
    public ArrayList<Construction> getBatiment() {return batiment;}
    public ArrayList<Construction> getBatimentEnCours() {return batimentEnCours;}
    public void setBatiment(ArrayList<Construction> construction) {this.batiment = construction;}
    public void setNouveauBatiment(Construction construction){this.batiment.add(construction);}
    public boolean getOuverturePorte(){return ouverturePorte;}
    
    public void construire(Jeu partie,int choix) {
        Outils.affichage(Journal.consulterDescription(71),partie.getMonInterface());
        boolean batimentDejaFait=false;
        for(int i=0;i<batiment.size();i++){
            if(partie.getMonJournal().getConstruction(choix).getNom().equals(batimentEnCours.get(i).getNom())||partie.getMonJournal().getConstruction(choix).getNom().equals(batiment.get(i).getNom())){
                batimentDejaFait=true;
            }
        }
        if(!batimentDejaFait){
            if (this.entrepot[1].getQuantite() >=partie.getMonJournal().getTabConstruction().get(choix).getRessources_necessaire().get(0)  && this.entrepot[2].getQuantite() >= partie.getMonJournal().getTabConstruction().get(choix).getRessources_necessaire().get(1) && partie.getJoueurActuel().getPa() >= 1) {
                partie.getJoueurActuel().setPa(partie.getJoueurActuel().getPa()-1,partie);
                batimentEnCours.add(partie.getMonJournal().getConstruction(choix));
            } else {
                Outils.affichage(Journal.consulterDescription(72),partie.getMonInterface());
                partie.getMonInterface().setCpt(partie.getMonInterface().getCpt()-9);
                partie.getMenuPartie().menuNiveauUn('I');
                
            }
        }else{
            Outils.affichage(Journal.consulterDescription(72),partie.getMonInterface());
            partie.getMonInterface().setCpt(partie.getMonInterface().getCpt()-9);
                partie.getMenuPartie().menuNiveauUn('I');
        }    
    }
    
    public void accederAuChantier(Jeu partieActuelle,int num){
        //Outils.donnerReponseChiffre(batimentEnCours.size()-1,partieActuelle);
        Outils.affichage(Journal.consulterDescription(74)+batimentEnCours.get(num).getConso_pa()+Journal.consulterDescription(75),partieActuelle.getMonInterface());
        if(Outils.affichage(Journal.consulterDescription(76),0,partieActuelle.getMonInterface())==0){
            participerAuChantier(partieActuelle,Outils.donnerReponseChiffre(partieActuelle.getJoueurActuel().getPa(), partieActuelle, JOptionPane.showInputDialog(Journal.consulterDescription(76))),num);
        }
    }
    
    public void participerAuChantier(Jeu partieActuelle, int num,int choix){
        
       int pointUse;
        Joueur ceJoueur=partieActuelle.getJoueurActuel();
        pointUse=batimentEnCours.get(choix).getConso_pa();
            if(batimentEnCours.get(choix).setConso_pa((batimentEnCours.get(choix).getConso_pa()-num))){
                partieActuelle.getMaVille().setNouveauBatiment(partieActuelle.getMonJournal().getConstruction(batimentEnCours.get(choix).getNom()));
                ceJoueur.setPa(ceJoueur.getPa()-pointUse,partieActuelle);
            }else{
                ceJoueur.setPa(ceJoueur.getPa()-num,partieActuelle);
            }
    }
    
    public String consulterEntrepot(){
         String tabEntrepot="\n";
        for(int i=0;i<entrepot.length;i++){
            tabEntrepot+=i+" | "+entrepot[i].getNom()+" | "+entrepot[i].getQuantite()+'\n';
        }
        return tabEntrepot;
    }

    public int defenseVille() {
        this.tauxDefense = 0;
        if (!ouverturePorte) {
            this.tauxDefense = 20;
            if(!batiment.isEmpty())
            {
                for(int i=0;i<batiment.size();i++){
                    this.tauxDefense+=batiment.get(i).getResistance();
                }
            }
        }
        return this.tauxDefense;
    }

    public String consulterDefense(){
        String afficherTauxDefense = " Nom des batiments "+afficherConstruction()+"\n Taux de défense est de "+this.defenseVille()+"";
        return afficherTauxDefense;
    }
    
    public boolean ouverturePorte(Jeu partieActuelle) {
        //bool ouverte -> 1 sinon 0
        //afficher si les portes sont ouvertes ou non
        if (ouverturePorte == true) {
            Outils.affichage(Journal.consulterDescription(78),1,partieActuelle.getMonInterface());
            if(Outils.affichage(Journal.consulterDescription(79),0,partieActuelle.getMonInterface())==0){
                return actionnerPorte(true);}else{ //retoune vrai l'ouverture de la porte
            return false;
            }
                    
        } else {
            Outils.affichage(Journal.consulterDescription(80),1,partieActuelle.getMonInterface());
            if(Outils.affichage(Journal.consulterDescription(81),0,partieActuelle.getMonInterface())==0){
                
            return actionnerPorte(false);}else{ // retoune faux l'ouverture de la porte
        }
            return false;
    }
    }
    public boolean actionnerPorte(boolean b){
        // Fonction d'ouverture et de fermeture des portes de la ville
        if(b){
            ouverturePorte=false;
        }else{
            ouverturePorte=true;
        }
        return true;    
    }

    public String afficherConstruction() {
        String tabNom=Journal.consulterDescription(82);
        for(int i=0;i<batiment.size();i++){
            tabNom+=i+" - "+batiment.get(i).getNom()+" - "+batiment.get(i).getResistance()+"\n";
        }
        return tabNom;
    }
    
    public String afficherConstructionEnCours() {
        String tabNom=Journal.consulterDescription(83);
        for(int i=0;i<batimentEnCours.size();i++){
            tabNom+=i+" - "+batimentEnCours.get(i).getNom()+" - "+batimentEnCours.get(i).getConso_pa()+" - "+batimentEnCours.get(i).getResistance()+"\n";
        }
        return tabNom;
    }
    
    public Item remplirGourde(Jeu partieActuelle){
        Item gourde = new Item(Journal.consulterDescription(52),Journal.consulterDescription(0));
        Outils.affichage(Journal.consulterDescription(31)+Journal.consulterDescription(52)+Journal.consulterDescription(110),partieActuelle.getMonInterface());
        return gourde;
    }
    

    public Item prendreRation(Jeu partieActuelle) {
        Item ration;
        if (this.entrepot[0].getQuantite()>0) {
            this.entrepot[0].setQuantite(this.entrepot[0].getQuantite() - 1);
            ration = new Item(Journal.consulterDescription(51),Journal.consulterDescription(1));
            Outils.affichage(Journal.consulterDescription(31)+Journal.consulterDescription(51)+Journal.consulterDescription(110),partieActuelle.getMonInterface());
        }else{ration = null;Outils.affichage(Journal.consulterDescription(84),partieActuelle.getMonInterface());}
        return ration;
    }

    public Item prendreBoisson(Jeu partieActuelle) {
        Item boisson;
        if (this.entrepot[3].getQuantite()>0) {
            this.entrepot[3].setQuantite(this.entrepot[3].getQuantite() - 1);
            boisson = new Item(Journal.consulterDescription(53),Journal.consulterDescription(4));
            Outils.affichage(Journal.consulterDescription(31)+Journal.consulterDescription(51)+Journal.consulterDescription(110),partieActuelle.getMonInterface());
        }else{boisson = null;Outils.affichage(Journal.consulterDescription(85),partieActuelle.getMonInterface());}
        return boisson;
    }

    
}
