/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spa2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author alex
 */
public class CVSWriter {
   //Delimiter used in CSV file
	private static final String COMMA_DELIMITER = ",";
	private static final String NEW_LINE_SEPARATOR = "\n";
//        private static DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        
                private static Date check_in;
                private static Date check_out;
//                private static String cin = df.format(check_in);
//                private static String cout = df.format(check_out);
	
	//CSV file header
	private static final String FILE_HEADER = "id,first_name,last_name,check_in,";

	public static void writeCsvFile(String fileName) {

		//Create new users objects
		User user1 = new User(1, "Ahmed", "Mohamed", check_in, check_out);
		User user2 = new User(2, "Sara", "Said", check_in, check_out);
		User user3 = new User(3, "Ali", "Hassan", check_in, check_out);
		User user4 = new User(4, "Sama", "Karim",check_in, check_out);
		User user5 = new User(5, "Khaled", "Mohamed", check_in, check_out);
		User user6 = new User(6, "Ghada", "Sarhan", check_in, check_out);
		
		//Create a new list of user objects
		List users = new ArrayList();
		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);
		users.add(user5);
		users.add(user6);
		
		FileWriter fileWriter = null;
				
		try {
			fileWriter = new FileWriter(fileName);

			//Write the CSV file header
			fileWriter.append(FILE_HEADER.toString());
			
			//Add a new line separator after the header
			fileWriter.append(NEW_LINE_SEPARATOR);
			
			//Write a new user object list to the CSV file
			for (User user : users) {
				fileWriter.append(String.valueOf(user.getId()));
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(user.getFirstName());
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(user.getLastName());
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(String.valueOf(user.getcheckIn()));
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(String.valueOf(user.getcheckOut()));
				fileWriter.append(NEW_LINE_SEPARATOR);
			}

			
			
			System.out.println("CSV file was created successfully !!!");
			
		} catch (Exception e) {
			System.out.println("Error in CsvFileWriter !!!");
			e.printStackTrace();
		} finally {
			
			try {
				fileWriter.flush();
				fileWriter.close();
			} catch (IOException e) {
				System.out.println("Error while flushing/closing fileWriter !!!");
                e.printStackTrace();
			}
			
		}
	}
}
