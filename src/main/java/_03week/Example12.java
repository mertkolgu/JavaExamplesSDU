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
public class Example12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        int sayi1, sayi2, cevap, dCevap = 0, tekrar = 1;

        while (tekrar <= 5) {
            sayi1 = rnd.nextInt(10);
            sayi2 = rnd.nextInt(10);
            String soru = String.format("%d. %d - %d ? ", tekrar, sayi1, sayi2);
            
            System.out.print(soru);
            cevap = sc.nextInt();

            if (cevap == (sayi1 - sayi2)) {
                dCevap++;
            }
            tekrar++;
        }
        System.out.printf("%d doğru cevabınız var", dCevap);
    }
}
