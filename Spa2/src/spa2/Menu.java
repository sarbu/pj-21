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
public class Menu {
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    
    public static Scanner scan = new Scanner(System.in);
    public static String option2;
    public static String option;
    
    public static void getservicesProvided() {
        System.out.println("\n******Choose One from the list of services below******\n");
        System.out.println("MB: Miniral Bath");
        System.out.println("MS: Massage Services");
        System.out.println("FS: Facial Services");
        System.out.println("ST: Specialty Treatment Services");
        System.out.println("Q: quit program");
        
        option = getOption();
        if (option.equalsIgnoreCase("MS")) {
            massageServices();
        }
            else if (option.equalsIgnoreCase("FT")) {
                facialTreatment(); 
            }
            else if (option.equalsIgnoreCase("MB")) {
                miniralBath(); 
            }
            else if (option.equalsIgnoreCase("ST")) {
                specialityTreatement(); 
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
    
    public static void massageServices(){
        System.out.print("\n******You Have selected Massage Services!!!******\n");
        System.out.print("******Select One of the services******\n");
        System.out.print("******How long would you like it?******\n");
        System.out.println("S: Sweedish: "); 
        System.out.println("SH: Shiatsu: "); 
        System.out.println("DT: Deep Tissue: "); 
        System.out.println("B: Back: ");
        
        
        option2 = Opt();
            if (option2.equalsIgnoreCase("S")){
                swedish();
            }
                else if (option2.equalsIgnoreCase("SH")) {
                    shiatsu();
                } 
                else if (option2.equalsIgnoreCase("DT")) {
                    shiatsu();
                } 
                else if (option2.equalsIgnoreCase("B")) {
                    getservicesProvided();
                } 
            else {
                System.out.println("\nPlease enter a valid option");
                massageServices();
            } 
    }
   
    public static void swedish(){
        System.out.print("\n******You Have selected Swedish Massage!!!******\n");
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
                    massageServices();
                } 
            else {
                System.out.println("\nPlease enter a valid option");
               swedish();
            } 
    }
      public static void shiatsu(){
        System.out.print("\n******You Have selected Shiatsu Massage!!!******\n");
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
                    massageServices();
                } 
            else {
                System.out.println("\nPlease enter a valid option");
               shiatsu();
            } 
    }
      public static void deepTissue(){
        System.out.print("\n******You Have selected Deep Tissue Massage!!!******\n");
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
                    massageServices();
                } 
            else {
                System.out.println("\nPlease enter a valid option");
               deepTissue();
            } 
    }
      
       public static void facialTreatment(){
        System.out.print("\n******You Have selected Facial Treatment!!!******\n");
        System.out.print("******Select One of the services******\n");
        System.out.print("******How long would you like it?******\n");
        System.out.println("N: Normal: ");
        System.out.println("C: Collagen: "); 
        System.out.println("B: Back: ");
        
        option2 = Opt();
            if (option2.equalsIgnoreCase("N")){
                normal();
            }
                else if (option2.equalsIgnoreCase("C")) {
                    collagen();
                } 
                else if (option2.equalsIgnoreCase("B")) {
                     getservicesProvided();
                } 
            else {
                System.out.println("\nPlease enter a valid option");
                facialTreatment();
            } 
    }
      
      public static void normal(){
        System.out.print("\n******You Have selected Normal Facial!!!******\n");
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
                    facialTreatment();
                } 
            else {
                System.out.println("\nPlease enter a valid option");
                normal();
            } 
    }
      
      public static void collagen(){
        System.out.print("\n******You Have selected Collagen Facial!!!******\n");
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
                    facialTreatment();
                } 
            else {
                System.out.println("\nPlease enter a valid option");
                collagen();
            } 
    }
      
    public static void specialityTreatement(){
        System.out.print("\n******You Have selected Speciality Treatement!!!******\n");
        System.out.print("******Select One of the services******\n");
        System.out.print("******How long would you like it?******\n");
        System.out.println("HS: Hot Stone: ");
        System.out.println("SS: Sugar Scrub: "); 
        System.out.println("BW: Herbal Body Wrap: "); 
        System.out.println("MW: Botanical Mud Wrap: "); 
        System.out.println("B: Back: ");
        
        option2 = Opt();
            if (option2.equalsIgnoreCase("HS")){
                hotStone();
            }
                else if (option2.equalsIgnoreCase("SS")) {
                   sugarScrub();
                } 
                else if (option2.equalsIgnoreCase("BW")) {
                    herbalBodyWrap();
                } 
                else if (option2.equalsIgnoreCase("MW")) {
                    botanicalMudWrap();
                } 
                else if (option2.equalsIgnoreCase("B")) {
                     getservicesProvided();
                } 
            else {
                System.out.println("\nPlease enter a valid option");
                specialityTreatement();
            } 
    }
        public static void hotStone(){
            System.out.print("\n******You Have selected Hot Stone!!!******\n");
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
                    specialityTreatement();
                } 
            else {
                System.out.println("\nPlease enter a valid option");
                hotStone();
            } 
    }
        public static void sugarScrub(){
            System.out.print("\n******You Have selected Sugar Scrub!!!******\n");
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
                    specialityTreatement();
                } 
            else {
                System.out.println("\nPlease enter a valid option");
                sugarScrub();
            } 
    }
       public static void herbalBodyWrap(){
            System.out.print("\n******You Have selected Herbal Body Wrap!!!******\n");
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
                    specialityTreatement();
                } 
            else {
                System.out.println("\nPlease enter a valid option");
                herbalBodyWrap();
            } 
    } 
       public static void botanicalMudWrap(){
            System.out.print("\n******You Have selected Botanical Mud Wrap!!!******\n");
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
                    specialityTreatement();
                } 
            else {
                System.out.println("\nPlease enter a valid option");
                botanicalMudWrap();
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

