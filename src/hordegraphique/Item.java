/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hordegraphique;

/**
 *
 * @author Seb
 */
public class Item {
    //Attribut de la class
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    // constructeur de la class
    public Item(String nom, int quantite, String description) {
        //Constructeur de la class
        this.nom = nom;
        this.quantite = quantite;
        this.description = description;
        
    }
    
    // constructeur de la class
    public Item(String nom, String description) {
        //Constructeur de la class
        this.nom = nom;
        this.description = description;
    }
    //attribut de la class
    private String nom;
    private int quantite;
    private String description;
    
}
