/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package audio_authentication_system;

import java.util.ArrayList;

/**
 *
 * @author acer
 */
public class User {
    private String name;
    private String password;
    //private ArrayList<long[]> keyPressedTime=new ArrayList<>();
    private ArrayList<String> keypressedtime;
   
    
    
    public User (String Name, String Password, ArrayList<String> key){   
        //this.keyPressedTime = new ArrayList<long>();
        this.name=Name;
        this.password=Password;
        this.keypressedtime=key;
        
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
    
     */
    public ArrayList<String> getKeypressedtime() {
        return keypressedtime;
    }
  
    
}
