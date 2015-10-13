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
import static java.lang.Integer.parseInt;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;
import spa2.User;

public class CVSReader {
    
  public static ArrayList<User> userfile() throws ParseException{
      ArrayList<User> userList = new ArrayList();
       String line = null;

	String csvFile = "MOCK_DATA.csv";
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
}
