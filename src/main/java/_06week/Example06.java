/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _06week;

import java.util.Scanner;

/**
 *
 * @author Mert
 */
public class Example06 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] dizi = new int[5];
        int toplam = 0;

        for (int i = 0; i < dizi.length; i++) {
            System.out.printf("dizi[%d] = ", i);
            dizi[i] = sc.nextInt();
        }

        for (int i = 0; i < dizi.length; i++) {
            toplam += dizi[i];
        }
        System.out.println("Toplam = " + toplam);
    }
}
