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
import java.io.IOException;
import java.io.*;
import static java.lang.Boolean.parseBoolean;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import spa2.User;
import spa2.Service;

public class CVSReader {
    
  public static ArrayList<User> userfile() throws ParseException{
      ArrayList<User> userList = new ArrayList();
       String line = null;

	String csvFile = "users.csv";
	BufferedReader br = null;
	String cvsSplitBy = ",";
        DateFormat format = new SimpleDateFormat("M/dd/yyyy", Locale.ENGLISH);
        Boolean isColumn = true;
        
	try {
            FileInputStream fs= new FileInputStream(csvFile);
            br = new BufferedReader(new InputStreamReader(fs));
                while ((line = br.readLine()) != null) {
                    if(!isColumn) {
			String[] customerFields = line.split(cvsSplitBy);
                             
                        userList.add(
                           new User(
                                parseInt(customerFields[0]),
                                customerFields[1],
                                customerFields[2],
                                format.parse(customerFields[3]),
                                format.parse(customerFields[4])
                             )
                        );   
                    }
                    
                    isColumn = false;
		}
        }
        catch (FileNotFoundException e) {
                System.out.println(e);
                System.exit(0);
	} catch (IOException e) {
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
        
        return userList;
  }
  
  public static ArrayList<Service> servicefile() throws ParseException{
      ArrayList<Service> serviceList = new ArrayList();
       String line = null;

	String csvFile = "services.csv";
	BufferedReader br = null;
	String cvsSplitBy = ",";
        Boolean isColumn = true;
        
	try {
            FileInputStream fs= new FileInputStream(csvFile);
            br = new BufferedReader(new InputStreamReader(fs));
                while ((line = br.readLine()) != null) {
                    if(!isColumn) {
			String[] serviceFields = line.split(cvsSplitBy);
                        ArrayList<Integer> durations = new ArrayList();
                        
                        for(int i = 3; i < serviceFields.length; i++) {
                            if(!serviceFields[i].isEmpty())
                               durations.add(parseInt(serviceFields[i]));
                        }
                  
                             
                        serviceList.add(
                           new Service(
                                serviceFields[0],
                                parseDouble(serviceFields[1]),
                                parseBoolean(serviceFields[2]),
                                durations
                             )
                        );   
                    }
                    
                    isColumn = false;
		}
        }
        catch (FileNotFoundException e) {
                System.out.println(e);
                System.exit(0);
	} catch (IOException e) {
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
        
        return serviceList;
  }
}
