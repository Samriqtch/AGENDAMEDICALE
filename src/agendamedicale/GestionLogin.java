/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agendamedicale;

/**
 *
 * @author kloug
 */
public class GestionLogin {
  
    public boolean authentifier(String username,String password){
    
        if((username.equals("username"))&&password.equals("password")){
            
            return true;
        }
        return false;
    }
}
