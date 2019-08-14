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
public class Example05 {

    public static void main(String[] args) {
        // girilen çift sayıların toplamını bulma

        Scanner sc = new Scanner(System.in);
        int sayi, toplam = 0;

        while (true) {
            System.out.print("sayiyi giriniz : ");
            sayi = sc.nextInt();

            if (sayi % 2 == 0) {
                toplam += sayi;
            } else {
                break;
            }
        }
        System.out.println("toplam = " + toplam);
    }
}
