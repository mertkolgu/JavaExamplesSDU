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
public class Example03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double kilo, boy, index;

        System.out.print("Kilonuzu giriniz(kg) : ");
        kilo = sc.nextDouble();

        System.out.print("Boyunuzu giriniz(m) : ");
        boy = sc.nextDouble();

        index = kilo / (boy * boy);

        if (index < 16) {
            System.out.println("Çok zayıfsınız");
        } else if (index >= 16 && index < 18) {
            System.out.println("Zayıfsınız");
        } else if (index >= 18 && index < 24) {
            System.out.println("İyisin iyi");
        } else if (index >= 24 && index < 29) {
            System.out.println("Şişmansın");
        } else if (index >= 29 && index < 35) {
            System.out.println("Çok şişmansın");
        } else if (index >= 35) {
            System.out.println("Helvan Hazır");
        }
    }
}
