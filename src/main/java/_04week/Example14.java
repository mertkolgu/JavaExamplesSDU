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
public class Example14 {

    public static int faktoriyel(int sayi) {

        int sonuc = 1;
        for (int i = sayi; i >= 1; i--) {
            sonuc *= i;
        }
        return sonuc;
    }

    public static void main(String[] args) {

        System.out.println(faktoriyel(5));
        
        int sonuc = faktoriyel(5);
        System.out.println(sonuc);
        // iki kullanım da aynı işi görür
    }
}
