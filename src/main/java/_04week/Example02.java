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
public class Example02 {

    public static void main(String[] args) {
        // 1'den 10'a kadar olan sayıların toplamını ekrana bas

        int toplam = 0;

        for (int i = 1; i <= 10; i++) {
            toplam += i;
            System.out.println("Toplam = " + toplam);
        }
    }
}
