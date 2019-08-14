/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _09week;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Mert
 */
public class Example03 {

    public static void main(String[] args) {

        try {
            FileWriter fw = new FileWriter("D:/1.Sınıf/BIL-104 Programlama Dilleri I/ders.txt");
            
            for (int i = 1; i <= 10; i++) {
                fw.write(String.valueOf(i) + "\n");
            }
            
            fw.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
