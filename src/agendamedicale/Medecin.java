/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agendamedicale;

/**
 *
 * @author kloug
 */
public class Medecin {
    private String nom;
    private String prenom;
    private String telephone;
    private String email;
    private String adresse;
    
    //Initialisation des attributs avec un constructeur 
    public Medecin(String nom, String prenom, String telephone, String email,String adresse){
        this.nom=nom;
        this.prenom = prenom;
        this.telephone=telephone;
        this.adresse=adresse;
        this.email=email;
    }
    // Méthode getters pour accéder aux valeurs des attributs 
    public String getnom(){
        return nom;
    }
    
    public String getprenom(){
        return prenom;
    }
    public String gettelephone(){
        return telephone;
    }
    public String getemail(){
        return email;
    }
    public String getadresse(){
        return adresse;
    }
    //Méthode setters pour la mise à jour des données 
    public void setnom(){
        this.nom= nom;
    }
     public void setprenom(){
        this.nom= prenom;
    }
    public void settelephone(){
        this.telephone= telephone;
    }
     public void setemail(){
        this.email= email;
    }
     public void setadresse(){
         this.adresse=adresse;
     }
    
}
