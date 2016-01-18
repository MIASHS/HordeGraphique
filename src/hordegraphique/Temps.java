/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hordegraphique;

import java.util.Random;

/**
 *
 * @author Valère,Sebastien,Gabriel
 */
public class Temps {
    // attributs de la class
    private int numTour;// indique le numéro de tour
    private int nbJours; // nombre de jours
    private boolean nuit; // indique si il fait nuit
    // getters&setter
    public void setNumTour(int i){}
    public int getNumTour(){return numTour;}
    public int getNbJour(){return nbJours;}
    public void setNuit(boolean i){}
    public boolean getNuit(){return nuit;}
    Random ra=new Random();
    public Temps(){
     numTour=0;
     nbJours=0;
     nuit=false;
     
    }
    
    public void incrementerTour(Jeu partie){
        // ajout de tour à chaque fin de tours
        if(partie.getIndexJoueurActuel()<partie.getNombreJoueur()-1){
            partie.setIndexJoueurActuel(partie.getIndexJoueurActuel()+1);
            
        }else{
            partie.setIndexJoueurActuel(0);
            numTour+=1;
            for(int i=0;i<partie.getNombreJoueur();i++){
                    partie.getJoueur(i).setPa(partie.getJoueur(i).getPa()+4,partie);
                }
            if(numTour==1){
                nuit=true;
                deroulementNuit(partie);
                nuit=false;
                numTour=0;
                for(int i=0;i<partie.getNombreJoueur();i++){
                    partie.getJoueur(i).setNouveauJour(partie,i);
                }
                incrementerNbJour();
            }
        }
        partie.setJoueurActuel(partie.getIndexJoueurActuel());    
        this.debuterTour(partie);
    }
    private void incrementerNbJour()
    // on ajoute de jours à chaque fin de tours
    {nbJours+=1;}
    public void deroulementNuit(Jeu partie){
        nuit=true;
        for(int i=0;i<partie.getNombreJoueur();i++){
            if(partie.getJoueur(i).getIndiceCase()!=338){
               if(partie.getJoueur(i).setPdv(0,partie)){
                   if(partie.dernierJoueur(partie.getJoueur(i),i,true)){partie.finDePartie();}
               }
            }
            if(partie.getMaVille().defenseVille()<Zombies.attaqueNuitZombies(this)){
                int nbATue= (int)(partie.getNombreJoueur()/2);
                for(int j=1; j<nbATue;j++){
                    int k=ra.nextInt(partie.getNombreJoueur()-1);
                    Joueur ceJoueur=partie.getJoueur(k);
                    ceJoueur.setPdv(0,partie);
                    if(partie.dernierJoueur(ceJoueur,k,true)){partie.finDePartie();}
                }
            }
        }
    }
    public void debuterTour(Jeu partie){
        // début des tours
        //partie.getMonInterface().setCpt(1);
        Outils.afficher(1,partie);
        Outils.affichage(partie.getMonJournal().afficherListeDeMort(),1,partie.getMonInterface());
    }
}
