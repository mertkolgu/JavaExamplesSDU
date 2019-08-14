/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _09week;

/**
 *
 * @author Mert
 */
public class Example02 {

    public static boolean isPalindrome(String kelime) {

        return kelime.equals(new StringBuilder(kelime).reverse().toString());
    }

    public static boolean isPalindrom(String kelime) {

        String ters = "";

        for (int i = kelime.length() - 1; i >= 0; i--) {
            ters += kelime.charAt(i);
        }
        return kelime.equals(ters);
    }

    public static void main(String[] args) {

        System.out.println(isPalindrome("iki"));
        System.out.println(isPalindrom("ali"));
    }
}
