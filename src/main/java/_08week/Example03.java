/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _08week;

/**
 *
 * @author Mert
 */
public class Example03 {
    // karakter dizisindeki karakterleri alt alta yazar

    public static char[] toCharArray(String kelime) {

        char[] sonuc = new char[kelime.length()];

        for (int i = 0; i < kelime.length(); i++) {
            sonuc[i] = kelime.charAt(i);
        }
        return sonuc;
    }

    public static void main(String[] args) {

        char[] sonuc = toCharArray("kelime");

        for (char ch : sonuc) {
            System.out.println(ch);
        }
    }
}
