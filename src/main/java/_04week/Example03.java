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
public class Example03 {

    public static void main(String[] args) {
        // üslü sayı hesaplama

        Scanner sc = new Scanner(System.in);
        int taban, us, sonuc = 1;

        System.out.print("tabanı giriniz : ");
        taban = sc.nextInt();

        System.out.print("üssü giriniz : ");
        us = sc.nextInt();

        for (int i = 0; i < us; i++) {
            sonuc *= taban;
        }
        System.out.printf("%d üssü %d = %d\n", taban, us, sonuc);
    }
}
