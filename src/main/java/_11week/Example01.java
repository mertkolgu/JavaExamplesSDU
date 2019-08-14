/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _11week;

import java.util.ArrayList;

/**
 *
 * @author Mert
 */
public class Example01 {

    public static void main(String[] args) {

        ArrayList<Object> liste = new ArrayList<>();

        liste.add(true);
        liste.add(2);
        liste.add("Merhaba");
        liste.add('a');
        liste.add(2.3);

        for (Object o : liste) {
            System.out.println(o);
        }
    }
}
