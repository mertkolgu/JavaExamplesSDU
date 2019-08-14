/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _04week;

/**
 *
 * @author Mert
 */
public class Example09 {

    public static void main(String[] args) {
        // harç hesaplama

        double harc = 10000;
        int sene = 1;

        while (harc < 20000) {
            harc *= 1.07;
            sene++;
        }
        System.out.printf("%d yıl sonra harç %.2f olur\n", sene, harc);
    }
}
