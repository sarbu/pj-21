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

public class ReadCVS {

//  public static void main(String[] args) {
//
//	ReadCVS obj = new ReadCVS();
//	obj.run();
//
//  }


  public void run(){
	String csvFile = "MOCK_DATA.csv";
//        csvFile = "/Users/sarbu_192/Documents/NetBeansProjects/Spa2/MOCK_DATA.csv";
	BufferedReader br = null;
//	String line = "";
        String line;
	String cvsSplitBy = ",";

	try {
            FileInputStream fs= new FileInputStream(csvFile);
            br = new BufferedReader(new InputStreamReader(fs));
//		br = new BufferedReader(new FileReader(csvFile));
                while ((line = br.readLine()) != null) {

		        // use comma as separator
			String[] customer = line.trim().split(cvsSplitBy);
//                        Spa2 id = new Spa2();
//                        System.out.println(line);
//                        line.charAt(1);
//                       if (Spa2.ID()= br.equals()){
			System.out.println("ID = " + customer[0] 
                                + " , First Name = " + customer[1] 
                                + " , Last Name = " + customer[2] 
                                + " , Check In Date = " + customer[3]
                                + " , Check Out Date = " + customer[4]);
//                        }
                        
//                       else {System.out.println("OH OH OH !!!");}
//
                        
		}

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

}
