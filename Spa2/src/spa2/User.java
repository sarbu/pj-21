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
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;


public class User {
    
     public static void main(String[] args) throws Exception {
//    public void userCompare() throws Exception {
        File file = new File("MOCK_DATA.csv");
        BufferedReader br = new BufferedReader(new FileReader(file));
        List<String> lines = new ArrayList<String>();
        String line = br.readLine();
        while(line != null) {
            
            lines.add(line.replace(",", ""));
            line = br.readLine();
        }
        for(String l : lines) {
            System.out.println(l);
        }
    }
}
