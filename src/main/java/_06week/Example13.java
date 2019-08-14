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
public class Example13 {

    public static void main(String[] args) {

        int[] dizi = {1, 2, 3, 4, 5};
        int[] dizi2 = new int[dizi.length];

        for (int i = 0; i < dizi.length; i++) {
            dizi2[i] = dizi[i];
        }

        for (int elm : dizi2) {
            System.out.println(elm);
        }
    }
}
