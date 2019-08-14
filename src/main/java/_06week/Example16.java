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
public class Example16 {

    public static void tersCevir(int[] gelen) {

        int temp;
        
        for (int i = 0; i < gelen.length / 2; i++) {
            temp = gelen[i];
            gelen[i] = gelen[gelen.length - 1 - i];
            gelen[gelen.length - 1 - i] = temp;
        }
    }

    public static void main(String[] args) {

        int[] dizi = {1, 2, 3, 4, 5};
        tersCevir(dizi);

        for (int elm : dizi) {
            System.out.println(elm);
        }
    }
}
