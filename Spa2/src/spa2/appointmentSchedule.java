/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spa2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sarbu_192
 */
public class appointmentSchedule {
     public static void main(String[] args) throws Exception {
        File file = new File("test.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        List<String> lines = new ArrayList<String>();
        String line = br.readLine();
        while(line != null) {
            
            lines.add(line.replace(",", "\\")
                    .replace(" ", "")
                    .replace("30min:", "")
                    .replace("60min:", "")
                    .replace("90min:", ""));
            line = br.readLine();
        }
        for(String l : lines) {
            System.out.println(l);
        }
    }
}
