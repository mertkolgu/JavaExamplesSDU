/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _10week;

import java.util.ArrayList;

/**
 *
 * @author Mert
 */
public class Example04 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(5);
        list.add(10);
        list.add(5);
        list.add(8);
        list.add(3);
        list.add(2);
        list.add(2);
        list.add(10);
        list.add(5);

        ArrayList<Integer> list2 = new ArrayList<>();

        for (int item : list) {
            if (!list2.contains(item)) {
                list2.add(item);
            }
        }

        for (int item : list2) {
            System.out.println(item);
        }
    }
}
