/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _11week;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Mert
 */
public class Example02 {

    public static void main(String[] args) {

        Set<Integer> kume = new HashSet<>();
        kume.add(5);
        kume.add(2);
        kume.add(5);

        for (int elm : kume) {
            System.out.println(elm);
        }
    }
}
