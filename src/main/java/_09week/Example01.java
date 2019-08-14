/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _09week;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Mert
 */
public class Example01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String path, devam;
        File dosya;

        while (true) {
            System.out.print("Dizin yolunu giriniz : ");
            path = sc.next();

            dosya = new File(path);

            String[] liste = dosya.list();

            for (String dosyaAdi : liste) {
                System.out.println(dosyaAdi);
            }

            System.out.print("Devam etmek istiyor musunuz (E/H)? : ");
            devam = sc.next();
            
            if (devam.equalsIgnoreCase("H")) {
                break;
            }
        }
    }
}
