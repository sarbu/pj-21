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
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



public class Spa2 {

    /**
     * @param args the command line arguments
     */
    
    public static Scanner scan = new Scanner(System.in);
    
    public static void getID(){
//        System.out.println("\nPlease enter the ID of the customer: ");
//        String ID = ID();
        ID();
        ReadCVS obj = new ReadCVS();
        obj.run();
        //ID();
//        boolean loggedIn = false;
//         try {
//        loggedIn = obj.equals(obj);
//}   catch(Exception ex) {
//    ex.printStackTrace();
//}
//        return ID;

        
        }
    
     public static String ID() {
        System.out.print("\nPlease enter the ID of the customer:\n ");
        return scan.nextLine();
    }
  
    public static void main(String[] args) {
        
//        String option;
        //String option2;
//        getID();
        
//        option = getOption();
        System.out.println("\n******Welcome To out SPA******");
        getID();
        Services.getservicesProvided();
//        option = getOption();
//        do {
//            getID();
            //getservicesProvided();
//            option = getOption();
//            if (option.equalsIgnoreCase("MB")) {
//                miniralBath();
////                System.out.print("******You Have selected Miniral Bath!!!******\n");
////                String mB = scan.nextLine();
//            }
//            else if (option.equalsIgnoreCase("ST")) {
//                specialityTreatement();
//                option2 = Opt();  
////                System.out.print("******You Have selected Speciality Treatement!!!******\n");
////                String sT = scan.nextLine();
//            }
//           else if (option.equalsIgnoreCase("M")) {
//               massage();
//               option2 = Opt();
////                System.out.print("******You Have selected Massage!!!******\n");
////                String mA = scan.nextLine();
//            }
//            else if (option.equalsIgnoreCase("FT")) {
//                option2 = Opt();
////                option = getOption();
////                System.out.print("******You Have selected Facial Treatement!!!******\n");
////                String fT = scan.nextLine();
//            }
//            else if (option.equalsIgnoreCase("Q")) {
//                System.exit(0);
////                option = getOption();
////                System.out.print("******You Have selected Facial Treatement!!!******\n");
////                String fT = scan.nextLine();
//            }
////        }    
////        while(!option.equalsIgnoreCase("Q"));
    }

    
    
//    private static void getservicesProvided() {
//        System.out.println("******Choose One from the list of services below******\n");
//        System.out.println("MB: Miniral Bath: ");
//        System.out.println("ST: Speciality Treatement: ");
//        System.out.println("M: Massage: ");
//        System.out.println("FT: Facial Treatement: ");
//        System.out.println("Q: quit program: ");
//    }

//    private static void menu() {
//        System.out.println("Options are ...");
//        System.out.println("SB: Book stone bath: ");
//        System.out.println("O2: Option 2: ");
//        System.out.println("O3: Option 3: ");
//        System.out.println("Q: quit program: ");
//    }
        
        
}
    
