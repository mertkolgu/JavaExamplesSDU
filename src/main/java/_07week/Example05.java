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
public class Example05 {
    // girilen stringde kaç tane sesli har olduğunu bulur(recursive)

    public static int sesliBul(String kelime) {

        if (kelime.isEmpty()) {
            return 0;
        } else if ("aeıioöuü".contains(kelime.substring(0, 1))) {
            return 1 + sesliBul(kelime.substring(1));
        } else {
            return 0 + sesliBul(kelime.substring(1));
        }
    }

    public static void main(String[] args) {

        System.out.println(sesliBul("merhaba"));
    }
}
