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
public class Example16 {
    // sayının rakamlarını toplama

    public static int sumDigit(int sayi) {

        int sonuc = 0;

        while (sayi > 0) {
            sonuc += sayi % 10;
            sayi /= 10;
        }
        return sonuc;
    }

    public static void main(String[] args) {

        System.out.println(sumDigit(1936));
    }
}
