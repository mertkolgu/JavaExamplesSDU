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
public class Example03 {
    // faktoriyel hesaplama(recursive)

    public static int faktoriyel(int n) {

        if (n == 0) {
            return 1;
        } else {
            return n * faktoriyel(n - 1);
        }
    }

    public static void main(String[] args) {

        System.out.println("Toplam = " + faktoriyel(5));
    }
}
