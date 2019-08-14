/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _05week;

/**
 *
 * @author Mert
 */
public class Example07 {
    // e sayısını hesaplama

    public static double faktoriyel(double sayi) {

        double sonuc = 1.0;
        for (double i = sayi; i > 0; i--) {
            sonuc *= i;
        }
        return sonuc;
    }

    public static void main(String[] args) {
        
        double e = 1.0;
        for (int i = 1; i <= 10000; i++) {
            e += 1 / faktoriyel(i);
        }
        System.out.println("e = " + e);
    }
}
