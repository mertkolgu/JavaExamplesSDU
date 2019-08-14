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
public class Example01 {
    // 1'den 10'a kadar olan sayıların toplamı(recursive)

    public static int topla(int n) {

        if (n == 0) {
            return 0;
        } else {
            return n + topla(n - 1);
        }
    }

    public static void main(String[] args) {

        System.out.println("Toplam = " + topla(10));
    }
}
