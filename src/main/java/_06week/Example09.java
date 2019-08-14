/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _06week;

/**
 *
 * @author Mert
 */
public class Example09 {

    public static void main(String[] args) {
        // dizideki en büyük değeri bulma

        int[] dizi = {9, 12, 3, 45, 36, 24, 14};
        int enb = dizi[0];

        for (int i = 1; i < dizi.length; i++) {
            if (dizi[i] > enb) {
                enb = dizi[i];
            }
        }
        
        System.out.println("En Büyük Sayı = " + enb);
    }
}
