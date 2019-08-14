/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _10week;

import java.util.HashMap;

/**
 *
 * @author Mert
 */
public class Example02 {

    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<String, Integer>();

        map.put("Matematik", 15);
        map.put("Fizik", 12);
        map.put("Kimya", 14);

        map.putIfAbsent("Fizik", 20);   // eğer fizikte değer yoksa ekler varsa eklemez
        map.putIfAbsent("Biyoloji", 13);    // ekler

        System.out.println(map.size()); //  kaç elemanı olduğunu gösterir

        System.out.println(map.containsKey("Fizik"));   // fizik olup olmadığını verir true/false

        System.out.println(map.containsValue(14));  // 14 olup olmadığını verir true/false

        System.out.println(map.remove("Fizik"));    // fiziği siler

        System.out.println(map);

        System.out.println(map.get("Fizik"));
    }
}
