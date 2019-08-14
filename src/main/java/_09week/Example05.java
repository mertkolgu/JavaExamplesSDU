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
public class Example05 {

    public static int getCityCount(String path) throws IOException {

        int say = 0;

        try {

            File fl = new File(path);
            BufferedReader br = new BufferedReader(new FileReader(fl));
            String line;

            while ((line = br.readLine()) != null) {
                say++;
            }
            br.close();

        } catch (FileNotFoundException ex) {
            say = - 1;
        } catch (IOException ex) {
            say = - 1;
        }
        return say;
    }

    public static String selectCity(String path) throws IOException {

        String sonuc = "";
        int sehirSayisi = getCityCount(path);
        int rastSayi = (int) (Math.random() * sehirSayisi) + 1;
        int sayac = 0;

        try {

            File fl = new File(path);
            BufferedReader br = new BufferedReader(new FileReader(fl));

            while (sayac != rastSayi) {
                sonuc = br.readLine();
                sayac++;
            }
            br.close();

        } catch (FileNotFoundException ex) {
            sonuc = null;
        } catch (IOException ex) {
            sonuc = null;
        }
        return sonuc;
    }

    public static void main(String[] args) throws IOException {

        String selectedCity = selectCity("D:/1.Sınıf/BIL-104 Programlama Dilleri I/ders.txt");
    }
}
