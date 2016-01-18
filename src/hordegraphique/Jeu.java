/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hordegraphique;

import java.awt.event.MouseListener;
import java.util.Scanner;
import java.util.ArrayList;
import javax.swing.ImageIcon;
/**
 *
 * @author Valère,Sebastien,Gabriel
 */
public class Jeu {
    private HordeInterface monInterface; // indique l'interface
    
    private int nombreJoueur; // indique le nombre de joueur
    private int indexJoueurActuel; // indique le joueur actuel
    private Joueur joueurActuel; // indique le joueur actuel
    private Temps tempsPartie; // indique le temps de la partie
    private Menu menuPartie;   // indique de le menu de la partie
    private ArrayList<Joueur> tabJoueur=new ArrayList<>(); //liste de joueur
    private boolean partieDemarree=false; // indique si la partie est en route ou non 
    private Carte grille; // indique la carte
    private Ville maVille; // indique ma ville
    private Journal monJournal; // indique le journal

    // Getter et Setter de la class
    public HordeInterface getMonInterface() {return monInterface;}
    public Journal getMonJournal() {return monJournal;}
    public void setMonJournal(Journal monJournal) {this.monJournal = monJournal;}
    public Ville getMaVille() {return maVille;}
    public void setMaVille(Ville maVille) {this.maVille = maVille;}
    public Menu getMenuPartie() {return menuPartie;}
    public void setMenuPartie(Menu menuPartie) {this.menuPartie = menuPartie;}
    public void setTempsPartie(Temps tempsPartie) {this.tempsPartie = tempsPartie;}
    public Temps getTempsPartie() {return tempsPartie;}
    public Joueur getJoueur(int i){return tabJoueur.get(i);}
    public ArrayList<Joueur> getTabJoueur(){return tabJoueur;}
    public void setTabJoueur(ArrayList<Joueur> t){tabJoueur.addAll(t);}
    public void setJoueur(Joueur citoyen, int i){tabJoueur.add(i, citoyen);}    
    public int getNombreJoueur(){return nombreJoueur;}   
    public void setNombreJoueur(int i){nombreJoueur=i;}
    public void setIndexJoueurActuel(int i){indexJoueurActuel=i;}    
    public int getIndexJoueurActuel(){return indexJoueurActuel;}
    // fait appel a tout les informations dont à besoin la class pour permettre le mon déroulement du jeux
    public void setJoueurActuel(int i){if(nombreJoueur==1){finDePartie();}else{joueurActuel=tabJoueur.get(i);this.monInterface.getNomJoueur().setText(joueurActuel.getNom());monInterface.getTour().setText(""+this.getTempsPartie().getNumTour());
        monInterface.getJour().setText(""+this.getTempsPartie().getNbJour());
        this.monInterface.getLifeProgressBar().setValue(this.getJoueurActuel().getPdv());
        this.monInterface.getPAProgressBar().setValue(this.getJoueurActuel().getPa());
        this.getMonInterface().getFondMini().setIcon(new ImageIcon(getClass().getResource("/hordegraphique/images/"+this.getGrille().getTabCase().get(this.getJoueurActuel().getIndiceCase()).getFond()+".jpg")));
        this.getMonInterface().getPosition().setText(this.getJoueurActuel().renvoyerCoordonnees());
        if(this.getJoueurActuel().getIndiceCase()==338){this.getMonInterface().getButCarte().setText(" | VILLE | ");this.getMonInterface().getExterieur().setVisible(false);this.getMonInterface().getInterieur().setVisible(true);}else{if(!this.grille.getTabCase().get(this.joueurActuel.getIndiceCase()).getFouillee()){this.getMonInterface().getButCarte().setText(" |          | ");}else{this.getMonInterface().getButCarte().setText("|"+this.getGrille().getTabCase().get(this.getJoueurActuel().getIndiceCase()).itemCarte()+"|");}this.getMonInterface().getExterieur().setVisible(true);this.getMonInterface().getInterieur().setVisible(false);}
        this.monInterface.accederObjetCase(0);

        this.monInterface.setCptCase(0);
        Outils.affichage(Journal.afficherPosition(this, this.getJoueurActuel()), 1, monInterface);
        //this.monInterface.getButCarte().setText(this.grille.getTabCase().get(this.getJoueurActuel().getIndiceCase()).itemCarte());
        this.monInterface.getDefense().setText(""+0);
        
            this.getMonInterface().getNbClou().setText("0");
            this.getMonInterface().getNbEnergie().setText("0");
            this.getMonInterface().getNbGourde().setText("0");
            this.getMonInterface().getNbObjet().setText("0");
            this.getMonInterface().getNbPlanche().setText("0");
            this.getMonInterface().getNbRation().setText("0");
        if(!this.getJoueurActuel().getSac().isEmpty()){
            this.monInterface.accederObjetSac(0);
            this.monInterface.setCptSac(0);
            String[] str={Journal.consulterDescription(51),Journal.consulterDescription(52),Journal.consulterDescription(53),Journal.consulterDescription(54),Journal.consulterDescription(55)};
            for(int index=0;index<joueurActuel.getSac().size();index++){
                for(int j=0;j<str.length;j++){
                    if(joueurActuel.getSac().get(index).getNom().equals(str[j])){
                        switch(j){
                            case 0:
                                monInterface.getNbRation().setText(""+(Integer.parseInt(monInterface.getNbRation().getText())+1));
                                monInterface.getNbObjet().setText(""+(Integer.parseInt(monInterface.getNbObjet().getText())+1));
                                break;
                            case 1:
                                monInterface.getNbGourde().setText(""+(Integer.parseInt(monInterface.getNbGourde().getText())+1));
                            monInterface.getNbObjet().setText(""+(Integer.parseInt(monInterface.getNbObjet().getText())+1));
                                break;
                            case 2:
                                monInterface.getNbEnergie().setText(""+(Integer.parseInt(monInterface.getNbEnergie().getText())+1));
                            monInterface.getNbObjet().setText(""+(Integer.parseInt(monInterface.getNbObjet().getText())+1));
                                break;
                            case 3:
                                monInterface.getNbPlanche().setText(""+(Integer.parseInt(monInterface.getNbPlanche().getText())+1));
                            monInterface.getNbObjet().setText(""+(Integer.parseInt(monInterface.getNbObjet().getText())+1));
                                break;
                            case 4:monInterface.getNbClou().setText(""+(Integer.parseInt(monInterface.getNbClou().getText())+1));
                            monInterface.getNbObjet().setText(""+(Integer.parseInt(monInterface.getNbObjet().getText())+1));
                                break;
                        }
                    }
                }
            }
        }}}
    
    public Joueur getJoueurActuel(){return joueurActuel;}
    public boolean getPartie(){return partieDemarree;}
    public void setPartie(boolean demarree){
        this.partieDemarree = demarree;
        if(!this.partieDemarree){
        lancerJeu(monInterface);
        }
    }
    public Carte getGrille() {return grille;}
    public void setGrille(Carte grille) {this.grille = grille;}
   // Fin Getter Setter
    public Jeu(){
    }
    
    //Constructeur de la class
    public void lancerJeu(HordeInterface uneInterface){
        if(!uneInterface.isPartieDemarree()){
            tempsPartie= new Temps();
            grille=new Carte(this);
            maVille=new Ville(this);
            monJournal=new Journal();
            menuPartie=new Menu(uneInterface,this);
            monInterface=uneInterface;
            monInterface.setPartieDemarree(true);
            
        }
        
        //Outils.affichage(Journal.consulterDescription(56),this.getMonInterface());
        //Scanner sc = new Scanner(System.in);        
        //for(int i=0;i<monInterface.getComponents().length;i++){
        //    monInterface.getComponent(i).setVisible(false);
        //}
//       monInterface.getjLabel2().setText(Journal.consulterDescription(57));
        //for(int i=0;i<monInterface.getjPanel2().getComponentCount();i++){
//    monInterface.getjLabel2().getComponent(i).setVisible(true);
        //}
        
        //this.getMenuPartie().demarrer(this,monInterface);   
    }
    
    public void initialisation(){
        // on initialise la partie
        //boolean finInitialisation = true;
        setPartie(true);
        //Outils.affichage(Journal.consulterDescription(59),this.getMonInterface());
        //this.getMonInterface().pack();
        //this.getMonInterface().validate();
    }
    
    public boolean dernierJoueur(){
        String str="";
        if(!tempsPartie.getNuit()){
            Outils.affichage(Journal.consulterDescription(60),this.getMonInterface());
            Journal.afficherMort(this, !tempsPartie.getNuit(), true);
        }else{
            Journal.afficherMort(this, tempsPartie.getNuit(), true);
        }
            monJournal.ajouterListeDeMorts(str);
            nombreJoueur-=1;
            for(int i=0;i<joueurActuel.getSac().size();i++){
                joueurActuel.outilViderSac(joueurActuel.viderSac(this),i,this);
            }
            getTabJoueur().remove(getIndexJoueurActuel());
            if(getNombreJoueur()<=1){return true;}else{return false;}
    }
    
    public boolean dernierJoueur(Joueur joueur,int i,boolean k){
        // méthode qui permet de gérer le dernier joueur
        String str="";
        if(!tempsPartie.getNuit()){
            if(k){
            Outils.affichage(Journal.consulterDescription(60),this.getMonInterface());
            Journal.afficherMort(this, !tempsPartie.getNuit(), k);
            }else{
            Journal.afficherMort(this, !tempsPartie.getNuit(), !k);
            }
        }else{
            Journal.afficherMort(this, tempsPartie.getNuit(), false);
        }
            monJournal.ajouterListeDeMorts(str);
            nombreJoueur-=1;
            getTabJoueur().remove(i);
            if(getNombreJoueur()<=1){return true;}else{return false;}
    }

    public void finDePartie(){
        // Méthode de mettre la fin de parti
        boolean continuerPartie = false;
        Scanner sc=new Scanner(System.in);
        Outils.affichage("\n"+this.tabJoueur.get(0).getNom()+Journal.consulterDescription(61),this.getMonInterface());
        sc.next();
        Outils.affichage(Journal.consulterDescription(62),this.getMonInterface());
        if(Outils.conversionBoolean(sc.next(),this)){
            setPartie(continuerPartie);
        }else{
            menuPartie.menuNiveauZero('Q');
        }
    }
}
