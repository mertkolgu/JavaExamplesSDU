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
public class Example06 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sayi;

        System.out.print("Sayı (0 - 3) : ");
        sayi = sc.nextInt();

        switch (sayi) {
            case 0:
                System.out.println("Sıfır");
                break;
            case 1:
                System.out.println("Bir");
                break;
            case 2:
                System.out.println("İki");
                break;
            case 3:
                System.out.println("Üç");
                break;
            default:
                System.out.println("İstenen aralıkta değil");
        }
    }
}
