/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _03week;

import java.util.Scanner;

/**
 *
 * @author Mert
 */
public class Example01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sayi1, sayi2;

        System.out.print("1. sayıyı giriniz : ");
        sayi1 = sc.nextInt();

        System.out.print("2. sayıyı giriniz : ");
        sayi2 = sc.nextInt();

        if (sayi1 > sayi2) {
            System.out.println("sayi1 büyük");
        } else if (sayi2 > sayi1) {
            System.out.println("sayi2 büyük");
        } else {
            System.out.println("İki sayı eşit");
        }
    }
}
