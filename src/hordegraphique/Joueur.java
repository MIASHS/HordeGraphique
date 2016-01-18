package hordegraphique;



import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Valère,Sebastien,Gabriel
 */
public class Joueur {
    //attributs de la class
    //Nom du joueur 
    private String nom; // indique le nom

    // Points de vie du joueur
    private int pdv; // indique les points de vie

    // Points d'action du joueur
    private int pa; // indique les PA

    //Affiche le tour courant
    private int nbTours;// indique le nombre de tours

    // Affiche le jour courant
    private int nbJours;// indique le nombre de jours

    // nb de gourdes par jour
    //private int gourde;
    private int ordonneeActuelle; //indique la position du joueurs
    private int absysseActuelle; //indique la position du joueurs
    private int indiceCase; // indique les coordonnées de la case
    private boolean dejaBu; // si la gourde est déja bu
    private boolean dejaMange; // si c'est déja mangé
    private boolean dependant=false;
    private int nbJourDependant=0;
    Scanner sc=new Scanner(System.in);
  
    //Tableau de 10 objets
    private ArrayList<Item> sac = new ArrayList<>(10);
    private ArrayList carteJoueur = new ArrayList<>();
   
    //Debut Getter Setter de la class
    public int getOrdonneeActuelle() {
        return ordonneeActuelle;
    }

    public void setOrdonneeActuelle(int ordonneeActuelle) {
        this.ordonneeActuelle = ordonneeActuelle;
    }

    public int getAbsysseActuelle() {
        return absysseActuelle;
    }

    public void setAbsysseActuelle(int absysseActuelle) {
        this.absysseActuelle = absysseActuelle;
    }

    public void setCoordonneeActuelle(int absysseActuelle, int ordonneeActuelle) {
        this.ordonneeActuelle = ordonneeActuelle;
        this.absysseActuelle = absysseActuelle;
    }
    // Fin Getter et Setter
    // Constructeur de la class
    public Joueur(Jeu partie, String nom) {
        this.nom = nom;
        this.pdv = 100;
        this.pa = 6;
        absysseActuelle = partie.getGrille().getxVille();
        ordonneeActuelle = partie.getGrille().getyVille();
        this.sac = new ArrayList<>();
        this.carteJoueur = new ArrayList<>();
        this.indiceCase =338;
        this.dejaBu=false;
        this.dejaMange=false;
    }
    
    //Getter Setter de la class
    public int getIndiceCase(){
        return indiceCase;
    }
    
    public void setIndiceCase(int indice){
        indiceCase=indice;
    }
    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the pdv
     */
    public int getPdv() {
        return pdv;
    }

    /**
     * @param pdv the pdv to set
     * @return changement si le joueur passe de la vie au trépas.
     */
    public boolean setPdv(int pdv,Jeu partie) {
        this.pdv = pdv;
        partie.getMonInterface().getLifeProgressBar().setValue(this.pdv);
        boolean changement=false;
        if(this.pdv<=0){
            changement=true;
        }
        return changement;
    }

    /**
     * @return the pa
     */
    public int getPa() {
        if(this.pa>10){
            this.pa=10;
        }
        return pa;
    }

    /**
     * @param pa the pa to set
     */
    // getter et setter
    public void setPa(int pa,Jeu partie) {
        if(pa<10){
            this.pa = pa;
            partie.getMonInterface().getPAProgressBar().setValue(this.pa);
        }else{
            this.pa=11;
            partie.getMonInterface().getPAProgressBar().setValue(10);
        }
    }
    
    public void setNbJourDependant(int jour){
        nbJourDependant=jour;
    }
    
    public int getNbJourDependant(){
        return nbJourDependant;
    }

    /**
     * @return the nbTours
     */
    public int getNbTours() {
        return nbTours;
    }

    /**
     * @param nbTours the nbTours to set
     */
    public void setNbTours(int nbTours) {
        this.nbTours = nbTours;
    }

    /**
     * @return the nbJours
     */
    public int getNbJours() {
        return nbJours;
    }

    /**
     * @param nbJours the nbJours to set
     */
    public void setNbJours(int nbJours) {
        this.nbJours = nbJours;
    }

    public ArrayList<Item> getSac() {
        return sac;
    }

    public void setSac(ArrayList<Item> sac) {
        this.sac = sac;
    }
    
    public ArrayList<String> getCarteJoueur() {
        return carteJoueur;
    }

    public void setCarteJoueur(ArrayList<String> carteJoueur) {
        this.carteJoueur = carteJoueur;
    }
    
    public boolean getDejaBu(){
        return dejaBu;
    }
    public boolean getDejaMange(){
        return dejaMange;
    }
    
    public void setNouveauJour(Jeu partie,int k){
        dejaBu=false;
        dejaMange=false;
        if(dependant){nbJourDependant+=1;if(nbJourDependant>=3){if(setPdv(pdv-5,partie)){if(partie.dernierJoueur(this,k,false)){partie.finDePartie();}}}}
    }
    //fin getter et setter
    // ---------------DEBUT DES METHODES---------------------
    
    public String renvoyerCoordonnees(){
        // méthode de renvoie des coordonnees de la carte ou se trouve le joueurs
        return "("+this.absysseActuelle+";"+this.ordonneeActuelle+")";
    }
    // Permet au joueur de boire de l'eau
    /**
     * @return changement to know if a change was made
     */
    public boolean boire(Jeu partie) {
        // Methode qui permet au joueur de boire
        int i=0;
        boolean changement=false;
        if(!sac.isEmpty()){
            while(!(this.sac.get(i).getNom().equals(Journal.consulterDescription(52))) && i < this.sac.size()){
                i++;
            }
            if(this.sac.get(i).getNom().equals(Journal.consulterDescription(52))){
                this.setPa(this.getPa() + 6,partie);
                this.sac.remove(i);
                Outils.affichage(Journal.consulterDescription(64),partie.getMonInterface());
                changement=true;
                dejaBu=true;
            }else{
                if(i == this.sac.size()){
                    Outils.affichage(Journal.consulterDescription(63),partie.getMonInterface());
                }
            }
        }else{
            Outils.affichage(Journal.consulterDescription(63),partie.getMonInterface());
        }   
        return changement;
    }
    //Permet au joueur de manger une ration s'il en dispose
    public boolean manger(Jeu partie) {
        // permet au joueur de manger
        int i=0;
        boolean changement=false;
        if(!sac.isEmpty()){
            while(!(this.sac.get(i).getNom().equals(Journal.consulterDescription(51))) && i < this.sac.size()-1){
                i++;
            }
            if(this.sac.get(i).getNom().equals(Journal.consulterDescription(51))){
                this.setPa(this.getPa() + 6,partie);
                this.sac.remove(i);
                Outils.affichage(Journal.consulterDescription(64),partie.getMonInterface());
                changement=true;
                dejaMange=true;
            }else{
                if(i == this.sac.size()){
                    Outils.affichage(Journal.consulterDescription(65),partie.getMonInterface());
                }
            }
        }else{
            Outils.affichage(Journal.consulterDescription(65),partie.getMonInterface());
        }
        return changement;
    }

    public int boireBoisson(Jeu partieActuelle){
        
        int i=0;
        
        while(!sac.get(i).getNom().equals(Journal.consulterDescription(53))&&i<sac.size()){
            i++;
        }
        
        if(sac.get(i).getNom().equals(Journal.consulterDescription(53))){
            if(Outils.affichage(Journal.consulterDescription(66),0,partieActuelle.getMonInterface())==0){
                actionBoireBoisson(partieActuelle,i);
            }
            
            
        }else{
            Outils.affichage(Journal.consulterDescription(68),partieActuelle.getMonInterface());
        }
        return i;
    }
    
    public boolean actionBoireBoisson(Jeu partieActuelle,int i){
        
                
                setPa(pa+4,partieActuelle);
                if(dependant){
                    nbJourDependant=0;
                }
                dependant=true;
                sac.remove(i);
                partieActuelle.getMonInterface().getNbRation().setText(""+(Integer.parseInt(partieActuelle.getMonInterface().getNbRation().getText())-1));
                                partieActuelle.getMonInterface().getNbObjet().setText(""+(Integer.parseInt(partieActuelle.getMonInterface().getNbObjet().getText())-1));
                Outils.affichage(Journal.consulterDescription(67),partieActuelle.getMonInterface());
                return true;
            
    }

    // Permet au joueur de remplir son sac
    public void remplirSac() {

    }

    // Permet au joueur de vider son sac
    public boolean viderSac(Jeu partieActuelle) {
        if(!sac.isEmpty()){
            partieActuelle.getMenuPartie().getMonInterface().setCpt(partieActuelle.getMenuPartie().getMonInterface().getCpt()+5);
            Outils.affichage(Journal.consulterDescription(28),partieActuelle.getMonInterface());
            Outils.affichage(Journal.afficherContenuSac(partieActuelle.getJoueurActuel()),partieActuelle.getMonInterface());
            Outils.affichage(Journal.consulterDescription(36),partieActuelle.getMonInterface());
            if(indiceCase!=338){
                return true;
            
            }else{
                return false;
            
            }
        
    }else{
        Outils.affichage(Journal.consulterDescription(34),partieActuelle.getMonInterface());
        Outils.afficher(4, partieActuelle);
        return false;
        }
    }
    public void outilViderSac(boolean b,int num, Jeu partieActuelle){
        //Permet au joueur de vider des items de son sac
        if(b){
        //int num=0;//Outils.donnerReponseChiffre(sac.size()-1,partieActuelle);
            
            
                if(!sac.get(num).getNom().equals(Journal.consulterDescription(51))&&!sac.get(num).getNom().equals(Journal.consulterDescription(52))){
                    if(sac.get(num).getNom().equals(Journal.consulterDescription(54))){
                        partieActuelle.getGrille().getTabCase().get(indiceCase).getItem().get(0).setQuantite(partieActuelle.getGrille().getTabCase().get(indiceCase).getItem().get(0).getQuantite()+1);
                    }else{
                        if(sac.get(num).getNom().equals(Journal.consulterDescription(55))){
                        partieActuelle.getGrille().getTabCase().get(indiceCase).getItem().get(1).setQuantite(partieActuelle.getGrille().getTabCase().get(indiceCase).getItem().get(1).getQuantite()+1);    
                        }else{  
                            partieActuelle.getGrille().getTabCase().get(indiceCase).getItem().get(2).setQuantite(partieActuelle.getGrille().getTabCase().get(indiceCase).getItem().get(2).getQuantite()+1);
                        }
                    }
                }
                Outils.affichage(Journal.consulterDescription(31)+sac.get(num).getNom()+Journal.consulterDescription(111),partieActuelle.getMonInterface());
                partieActuelle.getMenuPartie().getMonInterface().getNbObjet().setText(""+(Integer.parseInt(partieActuelle.getMenuPartie().getMonInterface().getNbObjet().getText())-1));
                sac.remove(num);
        }else{
            //int num=0;//Outils.donnerReponseChiffre(sac.size()-1,partieActuelle);
                if(!sac.get(num).getNom().equals(Journal.consulterDescription(52))){
                    Outils.affichage(Journal.consulterDescription(31)+sac.get(num).getNom()+Journal.consulterDescription(32),partieActuelle.getMonInterface());
                    if(sac.get(num).getNom().equals(Journal.consulterDescription(51))){
                        partieActuelle.getMaVille().getEntrepot()[0].setQuantite(partieActuelle.getMaVille().getEntrepot()[0].getQuantite()+1);
                    }else{
                        if(sac.get(num).getNom().equals(Journal.consulterDescription(54))){
                            partieActuelle.getMaVille().getEntrepot()[1].setQuantite(partieActuelle.getMaVille().getEntrepot()[1].getQuantite()+1);
                        }else{
                            if(sac.get(num).getNom().equals(Journal.consulterDescription(55))){
                                partieActuelle.getMaVille().getEntrepot()[2].setQuantite(partieActuelle.getMaVille().getEntrepot()[2].getQuantite()+1);
                            }else{  
                                partieActuelle.getMaVille().getEntrepot()[3].setQuantite(partieActuelle.getMaVille().getEntrepot()[3].getQuantite()+1);
                            }
                        }
                    }    
                    
                }else{
                    Outils.affichage(Journal.consulterDescription(31)+sac.get(num).getNom()+Journal.consulterDescription(33),partieActuelle.getMonInterface());
                      
                }
                Outils.affichage(Journal.consulterDescription(31)+sac.get(num).getNom()+Journal.consulterDescription(111),partieActuelle.getMonInterface());
                partieActuelle.getMenuPartie().getMonInterface().getNbObjet().setText(""+(Integer.parseInt(partieActuelle.getMenuPartie().getMonInterface().getNbObjet().getText())-1));
                sac.remove(num);  
            }
        
    }
}