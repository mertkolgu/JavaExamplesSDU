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
public class Example07 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] dizi;
        int boyut;

        System.out.print("Dizinin eleman sayısı = ");
        boyut = sc.nextInt();

        dizi = new int[boyut];

        for (int i = 0; i < dizi.length; i++) {
            System.out.println(dizi[i]);
        }
    }
}
