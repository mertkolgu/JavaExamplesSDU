/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _09week;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Mert
 */
public class Example04 {

    public static void main(String[] args) {

        try {
            File fl = new File("D:/1.Sınıf/BIL-104 Programlama Dilleri I/ders.txt");

            BufferedReader br = new BufferedReader(new FileReader(fl));
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            
            br.close();

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
