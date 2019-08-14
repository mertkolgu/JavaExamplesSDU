/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _11week;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Mert
 */
public class Example04 {

    public static void main(String[] args) {
        // girilen kelimede bulunan harfların sayısını bulma

        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();
        String kelime, key;

        System.out.print("Kelimeyi giriniz : ");
        kelime = sc.nextLine();

        for (int i = 0; i < kelime.length(); i++) {
            key = kelime.substring(i, i + 1);
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }

        Set<String> keys = map.keySet();
        for (String k : keys) {
            System.out.printf("%s = %d \n", k, map.get(k));
        }
    }
}
