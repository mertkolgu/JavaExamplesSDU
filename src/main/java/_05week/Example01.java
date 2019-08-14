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
public class Example01 {

    public static int toplamBul(int sayi1, int sayi2) {

        if (sayi1 > sayi2) {
            return -1;
        } else {
            int toplam = 0;
            for (int i = sayi1; i <= sayi2; i++) {
                toplam += i;
            }
            return toplam;
        }
    }

    public static void main(String[] args) {

        System.out.println("Toplam = " + toplamBul(5, 8));
    }
}
