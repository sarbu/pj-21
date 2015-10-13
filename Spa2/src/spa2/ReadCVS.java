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
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;
import java.util.Scanner;

public class ReadCVS {
//public static Scanner scan = new Scanner(System.in);
//public static String ID;
//public static void main(String[] args) {
////System.out.print("\nPlease enter the ID of the customer:\n ");
////ID();
//	ReadCVS obj = new ReadCVS();
//	obj.run();
//
//  }
public static String line = null;


  public void run(){
	String csvFile = "MOCK_DATA.csv";
//        csvFile = "/Users/sarbu_192/Documents/NetBeansProjects/Spa2/MOCK_DATA.csv";
	BufferedReader br = null;
//	String line = "";
//        public String line;
	String cvsSplitBy = ",";
        StringBuffer sb = new StringBuffer();

	try {
            FileInputStream fs= new FileInputStream(csvFile);
            br = new BufferedReader(new InputStreamReader(fs));
//		br = new BufferedReader(new FileReader(csvFile));
                while ((line = br.readLine()) != null) {
                        sb.append(line);
//                        System.out.println(line.toString());
		        // use comma as separator
//                        String[] customer = line.trim().split(cvsSplitBy);
			String[] customer = line.split(cvsSplitBy);
//                        Spa2 id = new Spa2();
//                        System.out.println(line.charAt(0));
//                        if(customer.equals(Spa2.ID())){
//                        System.out.println(customer);
//                        line.charAt(1);
                        
                        Spa2 obj = new Spa2();
                        obj.getID(null);
//                        
//                       if (line.toString()==obj.getID(line)){
//                           String[] customer = line.trim().split(cvsSplitBy);
			System.out.println("ID = " + customer[0] 
                                + " , First Name = " + customer[1] 
                                + " , Last Name = " + customer[2] 
                                + " , Check In Date = " + customer[3]
                                + " , Check Out Date = " + customer[4]);
                        
//                        Services.getservicesProvided();
//                        }
//                }
//                       Services.getservicesProvided();
//                        
//                       else {System.out.println("OH OH OH !!!");}
//
                        
		}
//                Services.getservicesProvided();

        }
        catch (FileNotFoundException e) {
		//e.printStackTrace();
                System.out.println(e);
                System.exit(0);
	} catch (IOException e) {
		//e.printStackTrace();
                System.out.println(e);
                System.exit(0);
	} finally {
		if (br != null) {
			try {
				br.close();
			} catch (IOException e) {
				System.out.println(e);
			}
		}
	}
	System.out.println("Done");
//        return 1;
  }
  
//    public static String ID() {
////        System.out.print("\nPlease enter the ID of the customer:\n ");
//        return scan.nextLine();
//    }
  

}
