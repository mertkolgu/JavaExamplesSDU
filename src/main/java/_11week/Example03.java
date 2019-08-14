/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _11week;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Mert
 */
public class Example03 {

    public static void main(String[] args) {

        Set<String> kume = new TreeSet<>();
        kume.add("Murat");
        kume.add("Mert");
        kume.add("Milli");

        for (String elm : kume) {
            System.out.println(elm);
        }
    }
}
