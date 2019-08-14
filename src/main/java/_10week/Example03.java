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
public class Example03 {

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

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) == list.get(j)) {
                    list.remove(j);
                }
            }
        }

        for (int item : list) {
            System.out.println(item);
        }
    }
}
