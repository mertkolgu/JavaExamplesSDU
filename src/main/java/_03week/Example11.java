/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _03week;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Mert
 */
public class Example11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int rSayi, tahmin = -1;

        rSayi = rnd.nextInt(100);

        while (rSayi != tahmin) {
            System.out.print("Tahmininiz : ");
            tahmin = sc.nextInt();

            if (tahmin > rSayi) {
                System.out.println("Aşağı");
            } else if (tahmin < rSayi) {
                System.out.println("Yukarı");
            } else {
                System.out.println("Tebrikler");
            }
        }
    }
}
