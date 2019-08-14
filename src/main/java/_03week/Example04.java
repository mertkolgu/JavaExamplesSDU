/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _03week;

/**
 *
 * @author Mert
 */
public class Example04 {

    public static void main(String[] args) {
        
        int sayi = 5;

        if (sayi % 2 == 0 && sayi % 3 == 0) {
            System.out.println("İkisine de bölünüyor");
        } else if (sayi % 2 == 0 || sayi % 3 == 0) {
            System.out.println("İkisinden birine bölünüyor");
        } else {
            System.out.println("İkisine de bölünmüyor");
        }
    }
}
