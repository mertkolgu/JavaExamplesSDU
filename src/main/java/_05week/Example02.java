/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _05week;

/**
 *
 * @author Mert
 */
public class Example02 {

    public static int toplamBul(int a, int b) {

        return a + b;

    }

    public static int toplamBul(int a, int b, int c) {

        return a + b + c;
    }

    public static double toplamBul(double a, int b) {

        return a + b;
    }

    public static void main(String[] args) {

        System.out.println("Toplam = " + toplamBul(2, 3));
        System.out.println("Toplam = " + toplamBul(2, 3, 4));
        System.out.println("Toplam = " + toplamBul(2.0, 3));
    }
}
