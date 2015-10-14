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
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.System.console;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Spa2{
    
    public static Service selectActivity(ArrayList<Service> services) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(inputStreamReader);
        Service selectedService = null;
    
        System.out.println("\nSelect an activity:");
        
        for(int i = 0; i < services.size();i ++) {
            Service service = services.get(i);
            System.out.println("For " +  service.getName() + " :" + "(" + service.getMenuKey() + ")");
        }
        
        Boolean isValidOption = false;
        
        while(!isValidOption) {
            String input = reader.readLine();

            for(int i = 0; i < services.size();i ++) {
               Service service = services.get(i);
               if(service.getMenuKey().equals(input)) {
                   selectedService = service;
                   isValidOption = true;
               }
           }
        }
        
        return selectedService;
    }
    
    public static void main(String[] args) throws IOException { 
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(inputStreamReader);
            
        try {
            ArrayList<User> userList = CVSReader.userfile();
            ArrayList<Service> serviceList = CVSReader.servicefile();
            System.out.println(userList);
            System.out.println(serviceList);
            
            System.out.println("\n******Welcome To out SPA******");
            
            Boolean hasMoreOperations = true;
            
            while(hasMoreOperations) {  
                System.out.println("Please insert the User ID:");
                String input = reader.readLine();

                long userID = parseLong(input);
                User currentUser = null;
                
                for(int i = 0; i < userList.size();i ++) {
                    if(userList.get(i).getId() == userID) {
                        currentUser = userList.get(i);
                        System.out.println("Found");
                    }
                }
                
                if(currentUser == null) {
                    System.out.println("Could not find a user with the provided ID");
                    return;
                }
                    
                Boolean isOptionValid = false;
                while(!isOptionValid) {
                    System.out.println("What action would you like to perform?");
                    
                    System.out.println("Perform a booking? (b) ");
                    System.out.println("Change a booking (x)");
                    System.out.println("Cancel a booking (c)");
                    
                    System.out.println("Calculate expenses for the user (e)");
                    String option = reader.readLine();
                    
                    if(option.equals("b") || option.equals("x") || option.equals("c") || option.equals("e")) {
                        isOptionValid = true;
                        
                        switch(option) {
                            case "b":
                                Service selection = selectActivity(serviceList);
                                break;
                                
                            case "x":
                                
                                break;
                                
                            case "c":
                                
                                break;
                                
                            case "e":
                                
                                break;
                        }
                    } else
                       System.out.println("Invalid option.");
                }
                
                System.out.println("Existing...");
                // The classes should be saved to disk before halting
                //CVSWriter.userfile(userList);
                //CVSWriter.servicefile(serviceList);
            }
            
            
            //System.out.println("Write CSV file:");
            //

        } catch (ParseException ex) {
            Logger.getLogger(Spa2.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
}
    
