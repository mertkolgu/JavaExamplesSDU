/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _02week;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Mert
 */
public class Example09 {

    public static void main(String[] args) {

        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);

        int ilkSayi, ikinciSayi, cevap;

        ilkSayi = 5 + rnd.nextInt(10);
        ikinciSayi = rnd.nextInt(10);

        System.out.print("What is " + ilkSayi + " + " + ikinciSayi + " ? ");
        cevap = sc.nextInt();

        if (cevap == (ilkSayi + ikinciSayi)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
