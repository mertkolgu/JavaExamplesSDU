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
public class Example02 {
    // girilen stringin tersini yazar(recursive)

    public static String reverse(String kelime) {

        if (kelime.isEmpty()) {
            return "";
        } else {
            return kelime.charAt(kelime.length() - 1) + reverse(kelime.substring(0, kelime.length() - 1));
        }
    }

    public static void main(String[] args) {

        System.out.println(reverse("MERT"));
    }
}
