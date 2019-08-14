/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _07week;

/**
 *
 * @author Mert
 */
public class Example02 {

    public static int bul(int[] gelen, int aranan) {

        for (int i = 0; i < gelen.length; i++) {
            if (gelen[i] == aranan) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] dizi = {45, 32, 26, 14, 85, 12, 24};
        System.out.println(bul(dizi, 66));
    }
}
