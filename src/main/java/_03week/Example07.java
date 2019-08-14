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
public class Example07 {

    public static void main(String[] args) {

        int sayi;
        Scanner sc = new Scanner(System.in);

        System.out.print("Sayı giriniz : ");
        sayi = sc.nextInt();

        String sonuc = (sayi % 2 == 0) ? "çift" : "tek";

        System.out.println(sonuc);
    }
}
