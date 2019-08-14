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
public class Example08 {

    public static double fonksiyon(int n) {

        double sonuc = 0.0;
        for (int i = 1; i <= n; i++) {
            sonuc += (Math.pow(2, i) + (5.0 / i));
        }
        return sonuc;
    }

    public static void main(String[] args) {

        System.out.println("Toplam = " + fonksiyon(10));
    }
}
