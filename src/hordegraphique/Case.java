/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hordegraphique;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class Case {
    // attribut de la class Case
    protected int longitude;
    protected int latitude;
    protected int nbZombiesRestants;
    private ArrayList<Item> items= new ArrayList<Item>(); // valeur par défault//
    private boolean fouillee;
    private boolean caseTrouve;
    protected boolean laVille = false;
    private Zombies zomb=new Zombies();
    private char fond='B';
    Scanner sc= new Scanner(System.in);
    Random ra=new Random();

    public Case(int longitude, int latitude) {
        //Constructeur de la class
        this.longitude = longitude;
        this.latitude = latitude;
        this.nbZombiesRestants = 0;
        this.fouillee = false;
        this.caseTrouve = false;
        this.items.add(0,new Item(Journal.consulterDescription(54),0,Journal.consulterDescription(2)));
        this.items.add(1,new Item(Journal.consulterDescription(55),0,Journal.consulterDescription(3)));
        this.items.add(2,new Item(Journal.consulterDescription(53),0,Journal.consulterDescription(4)));
    }
    // getter et setter de la class
    public char getFond() {
        return fond;
    }

    public void setFond(char fond) {
        this.fond = fond;
    }
    
    public Zombies getZombies(){
        return zomb;
    }
    
    public String afficherItems(){
        // afficher les items sur la case
        String tabItem="\n";
        for(int i=0;i<items.size();i++){
            tabItem+=i+"|"+items.get(i).getNom()+"|"+items.get(i).getQuantite()+'\n';
        }
   
        return tabItem;
    }
    
    public String itemCarte(){
        //retourne une chaine de caractère
        return "P"+this.items.get(0).getQuantite()+"M"+this.items.get(1).getQuantite()+"B"+this.items.get(2).getQuantite();
    }
    //Getter et Setter
    public boolean getFouillee(){
        return fouillee;
    }
    public int getNbZombiesRestants(){
        return nbZombiesRestants;
    }
    
    public ArrayList<Item> getItem(){
        return items;
    }    
    public boolean fouiller(Jeu partieActuelle, boolean b){ // Méthode qui donne le choix au joueur de fouiller la case ou non
        boolean changement=false;
        
        
        if(b){
            nbZombiesRestants=Zombies.nbZombiesCase();
            Outils.affichage(Journal.consulterDescription(22)+nbZombiesRestants+Journal.consulterDescription(23),2,partieActuelle.getMonInterface());
            fouillee=true;
            changement=true;
        }
        return changement;
  }

    public boolean attaquer(Joueur ceJoueur,Jeu partie){
        // méthode qui permet d'attaquer le/les zombies dans la case
        int pourcentage;
        boolean changement=false;
        if(ceJoueur.getPa()>=nbZombiesRestants){
            for(int i=0; i<nbZombiesRestants;i++){
                ceJoueur.setPa(ceJoueur.getPa()-1,partie);
                pourcentage = ra.nextInt(100); // numéro aléatoire en 0 et 100
                    if(pourcentage <=10){ // conditon pour les 10% de chances de perdre de la vie
                        changement=ceJoueur.setPdv(ceJoueur.getPdv()-10,partie);
                    }
            }
            nbZombiesRestants=0;
        }else{
              for(int i=0; i<ceJoueur.getPa();i++){
                nbZombiesRestants-=1;
                pourcentage = ra.nextInt(100); // numéro aléatoire en 0 et 100
                    if(pourcentage <=10){ // conditon pour les 10% de chances de perdre de la vie
                        changement=ceJoueur.setPdv(ceJoueur.getPdv()-10,partie);
                    }
            }
            ceJoueur.setPa(0,partie);
        }
        return changement;
    }
    
  }
