/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _02week;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Mert
 */
public class Example10 {

    public static void main(String[] args) {
        // 5'e bölümden kalan 0'sa HiFive
        // 2'e bölümden kalan 0'sa HiEven
        
        Scanner sc = new Scanner(System.in);
        int sayi;

        System.out.print("Sayı giriniz : ");
        sayi = sc.nextInt();

        if (sayi % 5 == 0) {
            System.out.println("HiFive");
        } else if (sayi % 2 == 0) {
            System.out.println("HiEven");
        } else {
            System.out.println("NULL");
        }        
    }
}
