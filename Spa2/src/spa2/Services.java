/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spa2;

import java.util.Scanner;

/**
 *
 * @author sarbu_192
 */
public class Services {
    
    public static Scanner scan = new Scanner(System.in);
    public static String option2;
    public static String option;
    
    public static void getservicesProvided() {
        System.out.println("\n******Choose One from the list of services below******\n");
        System.out.println("MB: Miniral Bath");
        System.out.println("ST: Speciality Treatement");
        System.out.println("M: Massage");
        System.out.println("FT: Facial Treatement");
        System.out.println("Q: quit program");
        
        option = getOption();
        if (option.equalsIgnoreCase("MB")) {
            miniralBath();
        }
            else if (option.equalsIgnoreCase("ST")) {
                specialityTreatement(); 
            }
            else if (option.equalsIgnoreCase("M")) {
               massage();
            }
            else if (option.equalsIgnoreCase("FT")) {
            }
            else if (option.equalsIgnoreCase("Q")) {
                System.exit(0);
            }
        else {
                System.out.println("\nPlease enter a valid option");
                getservicesProvided();
            }       
        
    }
    
    @SuppressWarnings("empty-statement")
    public static void miniralBath(){
        System.out.print("\n******You Have selected Miniral Bath!!!******\n");
        System.out.print("******Available Time******\n");
        System.out.print("******How long would you like it?******\n");
        System.out.println("60: Select 60 min: ");
        System.out.println("90: Select 90 min: ");
        System.out.println("B: Back: ");
        
        option2 = Opt();
            if (option2.equalsIgnoreCase("60")){
                sixtyMin();
            }
                else if (option2.equalsIgnoreCase("90")) {
                    ninetyMin();
                } 
                else if (option2.equalsIgnoreCase("B")) {
                    getservicesProvided();
                } 
            else {
                System.out.println("\nPlease enter a valid option");
                miniralBath();
            } 
    }
    public static void specialityTreatement(){
        System.out.print("\n******You Have selected Speciality Treatement!!!******\n");
        System.out.print("******Available Time******\n");
        System.out.print("******How long would you like it?******\n");
        System.out.println("60: Select 60 min: ");
        System.out.println("90: Select 90 min: ");
        System.out.println("B: Back: ");
        option2 = Opt();
            if (option2.equalsIgnoreCase("60")){
                sixtyMin();
            }
                else if (option2.equalsIgnoreCase("90")) {
                    ninetyMin();
                } 
                else if (option2.equalsIgnoreCase("B")) {
                    getservicesProvided();
                }
            else {
                System.out.println("\nPlease enter a valid option");
                specialityTreatement();
            } 
    }
    public static void massage(){
        System.out.print("\n******You Have selected Massage!!!******\n");
        System.out.print("******Available Time******\n");
        System.out.print("******How long would you like it?******\n");
        System.out.println("30: Select 30 min: ");
        System.out.println("60: Select 60 min: ");
        System.out.println("B: Back: ");
        option2 = Opt();
            if (option2.equalsIgnoreCase("30")){
                thirtyMin();
            }
                else if (option2.equalsIgnoreCase("60")) {
                    sixtyMin();
                } 
                else if (option2.equalsIgnoreCase("B")) {
                    getservicesProvided();
                }
            else {
                System.out.println("\nPlease enter a valid option");
                massage();
            } 
    }
    
    public static void facialTreatement(){
        System.out.print("\n******You Have selected Facial Treatement!!!******\n");
        System.out.print("******Available Time******\n");
        System.out.print("******How long would you like it?******\n");
        System.out.println("30: Select 30 min: ");
        System.out.println("60: Select 60 min: ");
        System.out.println("B: Back: ");
        option2 = Opt();
            if (option2.equalsIgnoreCase("30")){              
                thirtyMin();
            }
                else if (option2.equalsIgnoreCase("60")) {
                    sixtyMin();
                } 
                else if (option2.equalsIgnoreCase("B")) {
                    getservicesProvided();
                }
            else {
                System.out.println("\nPlease enter a valid option");
                facialTreatement();
            } 
    }
    
    public static String getOption() {
        System.out.print("\nYour selection\n");
        return scan.nextLine();
    }
    public static String Opt() {
        System.out.print("\nPlease select from one of the option\n ");
        return scan.nextLine();
    }
    
//     public static String ID() {
//        System.out.print("\nPlease enter the ID of the customer:\n ");
//        return scan.nextLine();
//    }
    
    public static void thirtyMin(){
         System.out.print("\n******You Have selected 30 min!!!******\n");
    }
    public static void sixtyMin(){
         System.out.print("\n******You Have selected 60 min!!!******\n");
    }
    
    public static void ninetyMin(){
         System.out.print("\n******You Have selected 90 min!!!******\n");
    }
    
}
