/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agendamedicale;

/**
 *
 * @author kloug
 */
import java.time.LocalDate;

public class patient {
    
    private String nom;
    private String prenom;
    private String telephone;
    private LocalDate datenaissance;
    private String email;
    private String adresse;
    
    // contructeur 
    public  patient(String nom, String prenom,String telephone,String email,String adresse,LocalDate datenaissance) {
        //initialisation des attributs 
        this.nom=nom;
        this.prenom=prenom;
        this.telephone=telephone;
        this.adresse=adresse;
        this.email=email;
        this.datenaissance=datenaissance;
        
    }
    //Méthode getters pour récuperer les valeurs des attributs 
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
    public LocalDate getdatenaissance(){
        return datenaissance;
    }
    
    //Méthode setters pou accéder au valeurs des attributs et faire une mise à jour
    public void  setprenom(){
        this.prenom= prenom;
    }
    
    public void setnom(){
        this.nom=nom;
    }
    public void setadresse(){
        this.adresse=adresse;
    }
    
    public void settelephone(){
        this.telephone=telephone;
    }
    public void setemail(){
        this.email=email;
    }
    
    public void setdatenaissance(){
        this.datenaissance=datenaissance;
    }
    
    
    
    
}
