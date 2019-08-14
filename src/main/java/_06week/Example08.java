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
public class Example08 {

    public static void main(String[] args) {
        // diziyi ekrana basma

        int[] rakamlar = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < rakamlar.length; i++) {
            System.out.println(rakamlar[i]);
        }

        System.out.println("***********************");

        for (int elm : rakamlar) {
            System.out.println(elm);
        }
    }
}
