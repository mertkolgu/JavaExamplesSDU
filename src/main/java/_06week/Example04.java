/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _06week;

/**
 *
 * @author Mert
 */
public class Example04 {
    // decimal sayıyı binary sayıya çevirme(recursive)

    public static String decToBin(int n) {

        if (n == 0) {
            return "";
        } else {
            return decToBin(n / 2) + n % 2;
        }
    }

    public static void main(String[] args) {

        System.out.println("Sonuc = " + decToBin(10));
    }
}
