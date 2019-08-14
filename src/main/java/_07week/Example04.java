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
public class Example04 {
    // girilen stringde kaç tane sesli har olduğunu bulur

    public static int sesliBul(String kelime) {

        int sonuc = 0;
        String sesli = "aeıioöuü";

        for (int i = 0; i < kelime.length(); i++) {
            if (sesli.contains(kelime.substring(i, i + 1))) {
                sonuc++;
            }
        }
        return sonuc;
    }

    public static void main(String[] args) {

        System.out.println(sesliBul("merhabaaaaa"));
    }
}
