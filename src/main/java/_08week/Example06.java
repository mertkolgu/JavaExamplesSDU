/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _08week;

import java.io.File;

/**
 *
 * @author Mert
 */
public class Example06 {

    public static void main(String[] args) {

        File dosya = new File("D:/1.Sınıf/BIL-104 Programlama Dilleri I/deneme.txt");

        dosya.mkdir(); // yeni dosya oluşturma

        System.err.println(dosya.canExecute());
        // çalıştırılabilir mi

        System.err.println(dosya.canRead());
        // okunabilir mi

        System.err.println(dosya.canWrite());
        // yazılabilir mi

        System.err.println(dosya.delete());
        // silme
        
        System.err.println(dosya.getAbsolutePath());
        // dizini buluyor

        System.err.println(dosya.isFile());
        // dosya olup olmadığını sorguluyor

        System.err.println(dosya.lastModified());
        // son değiştirilme

        System.err.println(dosya.length());
        // dosyanın kaç kb olduğunu

        String[] liste = dosya.list();

        for (String ad : liste) {
            System.out.println(ad);
        }

        //File[] liste = dosya.listFiles();
        //for (File bilgi : liste) {
        //    System.out.println(bilgi.getName());
        //}
    }
}
