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
public class Main_module_Container {

    /**
     * @param args the command line arguments
     */
    public static ArrayList<User> users = new ArrayList<User>();
    
    public static void main(String[] args) {
        ArrayList <String> a = new ArrayList<>();
        a.add("125");
        a.add("100");
        a.add("125");
        a.add("125");
        a.add("109");
        users.add(new User("ashan","ashan",a));
        new GUI().setVisible(true);
    }
    
}
