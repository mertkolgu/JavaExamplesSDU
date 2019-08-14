/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _07week;

import java.util.Random;

/**
 *
 * @author Mert
 */
public class Example01 {

    public static void main(String[] args) {
        // rastgele 100 tane küçük harf oluşturup hepsinden kaç tane olduğunu ekrana yazar

        Random rnd = new Random();

        char[] karakterler = new char[100];
        int[] krtSay = new int[26];

        for (int i = 0; i < 100; i++) {
            karakterler[i] = (char) (97 + rnd.nextInt(26));
        }

        for (char ch : karakterler) {
            krtSay[ch - 97]++;
        }

        for (int i = 0; i < krtSay.length; i++) {
            System.out.printf("%c : %d \n", (char) (97 + i), krtSay[i]);
        }
    }
}
