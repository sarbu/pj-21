/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spa2;

/**
 *
 * @author sarbu_192
 */
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Spa2{

    public static void main(String[] args) { 
        
        try {
            ArrayList<User> userList = CVSReader.userfile();
            ArrayList<Service> serviceList = CVSReader.servicefile();
            System.out.println(userList);
            System.out.println(serviceList);
            
            System.out.println("\n******Welcome To out SPA******");
            System.out.println("Write CSV file:");
            CVSWriter.writeCsvFile("WriterTest.csv");

        } catch (ParseException ex) {
            Logger.getLogger(Spa2.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
}
    
