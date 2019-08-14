/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _10week;

import java.util.ArrayList;

/**
 *
 * @author Mert
 */
public class Example01 {

    public static void main(String[] args) {

        ArrayList<Integer> liste = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            liste.add(i);
        }
        
        System.out.println(liste);

        liste.add(2, 5);    // 2.indekse 5'i ekleme
        System.out.println(liste);

        System.out.println(liste.contains(5));  // içerisinde 5'in geçerli olup olmadığını söyler true/false

        System.out.println(liste.indexOf(15));  // 15 varsa kaçıncı sırada olduğunu gösterir yoksa -1 döndürür

        System.out.println(liste.lastIndexOf(15));  // aynısını sondan yapar

        System.out.println(liste.isEmpty());    // listenin boş olup olmadığı gösterir true/false

        liste.remove(2);    // ikinci indeksi siler
        System.out.println(liste);

        liste.remove(new Integer(2));   // değer olan 2'yi siler
        System.out.println(liste);

        int sayi = 2;
        liste.remove(sayi); // sayıyı siler
        System.out.println(liste);

        liste.set(2, 15);   // 2.elemanı 15 ile değiştirir
        System.out.println(liste);

        liste.toArray();    // bir diziye çevirirsin
        System.out.println(liste);

        for (int i = 0; i < liste.size(); i++) {
            System.out.println(liste.get(i));
        }

        liste.clear();      // içeriğini temizler
        System.out.println(liste);
    }
}
