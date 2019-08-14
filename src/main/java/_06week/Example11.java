/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _06week;

import java.util.Random;

/**
 *
 * @author Mert
 */
public class Example11 {

    public static void main(String[] args) {
        // diziyi rastgele sıralama

        Random rnd = new Random();
        int[] dizi = new int[6];
        int rSayi, j;

        for (int i = 0; i < dizi.length; i++) {
            while (true) {
                rSayi = 1 + rnd.nextInt(49);
                for (j = 0; j < dizi.length; j++) {
                    if (dizi[j] == rSayi) {
                        break;
                    }
                }
                if (j == dizi.length) {
                    dizi[i] = rSayi;
                    break;
                }
            }
        }

        for (int elm : dizi) {
            System.out.printf("%d \t", elm);
        }
    }
}
