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
public class Example15 {

    public static void yaz(int[] gelen) {

        for (int elm : gelen) {
            System.out.println(elm);
        }
    }

    public static void carp(int[] gelen) {

        for (int i = 0; i < gelen.length; i++) {
            gelen[i] *= 2;
        }
    }

    public static void main(String[] args) {

        int[] giden = {1, 2, 3, 4, 5};
        //yaz(giden);
        yaz(new int[]{1, 2, 3, 4, 5});  // anonynomus array

        System.out.println("**************");

        carp(giden);
        
        for (int elm : giden) {
            System.out.println(elm);
        }
    }
}
