/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _07week;

/**
 *
 * @author Mert
 */
public class Example06 {
    // girilen stringi hexadecimal sayıya dönüştürür

    public static int hexToDec(String kelime) {

        int sonuc = 0, us = 0;
        String hex = "0123456789ABCDEF";

        for (int i = kelime.length() - 1; i >= 0; i--) {
            sonuc += hex.indexOf(kelime.charAt(i)) * Math.pow(16, us);
            us++;
        }
        return sonuc;
    }

    public static void main(String[] args) {

        System.out.println(hexToDec("ABCD"));
    }
}
