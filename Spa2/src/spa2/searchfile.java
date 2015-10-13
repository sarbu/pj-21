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
// Import io so we can use file objects
import java.util.*;
import java.io.*;
    public class searchfile
    {
        public void Runner()
        {
            String cvsSplitBy = ",";
//            BufferedReader br = null;
            
        File file =new File("MOCK_DATA.csv");
        Scanner in = null;
        try {
//            FileInputStream fs= new FileInputStream("MOCK_DATA.csv");
//            br = new BufferedReader(new InputStreamReader(fs));
            in = new Scanner(file);
            while(in.hasNext())
            {
                
                String line=in.nextLine();
                String[] customer = line.split(cvsSplitBy);
                //System.out.println(customer[0]);
//                if(line.contains(Spa2.ID())){}
//                System.out.println("poop ");
//                    if(Spa2.ID().contentEquals("1")){
//                System.out.println(customer);
                customer.toString();
                
//                        if(customer.equals(Spa2.ID())){
                            
                    System.out.println(customer);
                    
                    System.out.println("ID = " + customer[0] 
                                + " , First Name = " + customer[1] 
                                + " , Last Name = " + customer[2] 
                                + " , Check In Date = " + customer[3]
                                + " , Check Out Date = " + customer[4]);
                    Services.getservicesProvided();
//        }
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            System.out.println(e);
        }

    }}