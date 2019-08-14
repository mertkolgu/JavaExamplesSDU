/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _04week;

/**
 *
 * @author Mert
 */
public class Example12 {

    public static int buyukBul(int sayi1, int sayi2) {

        int sonuc;
        if (sayi1 > sayi2) {
            sonuc = sayi1;
        } else {
            sonuc = sayi2;
        }
        return sonuc;
    }

    public static void main(String[] args) {

        System.out.println(buyukBul(2, 8));

        int sonuc = buyukBul(2, 8);
        System.out.println(sonuc);
    }
}
