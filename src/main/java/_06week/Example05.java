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
public class Example05 {

    public static void main(String[] args) {

        int[] dizi = new int[5];
        for (int i = 0; i < dizi.length; i++) {
            System.out.printf("dizi[%d] = %d\n", i, dizi[i]);
        }

        System.out.println("*****************");

        double[] dizi1 = new double[5];
        for (int i = 0; i < dizi1.length; i++) {
            System.out.printf("dizi[%d] = %.1f\n", i, dizi1[i]);
        }

        System.out.println("*****************");

        boolean[] dizi2 = new boolean[5];
        for (int i = 0; i < dizi2.length; i++) {
            System.out.printf("dizi[%d] = %b\n", i, dizi2[i]);
        }
    }
}
