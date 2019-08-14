/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _04week;

import java.util.Scanner;

/**
 *
 * @author Mert
 */
public class Example04 {

    public static void main(String[] args) {
        // faktoriyel hesaplama

        Scanner sc = new Scanner(System.in);
        int sayi, sonuc = 1;

        System.out.print("sayi giriniz : ");
        sayi = sc.nextInt();

        for (int i = 1; i <= sayi; i++) {
            sonuc *= i;
        }
        System.out.printf("%d! = %d\n", sayi, sonuc);
    }
}
