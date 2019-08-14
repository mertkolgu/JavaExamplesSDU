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
public class Example12 {

    public static void main(String[] args) {

        int[] dizi = {1, 2, 3, 4, 5};
        int[] dizi2 = dizi;

        dizi2[3] = 10;

        for (int elm : dizi) {
            System.out.println(elm);
        }
    }
}
