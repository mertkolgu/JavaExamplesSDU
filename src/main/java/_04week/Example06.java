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
public class Example06 {

    public static void main(String[] args) {
        // break vs continue
        // break o anki işlemi yapmayı bırak diğer işleme atla
        // continue ise devam et

        for (int i = 1; i < 5; i++) {
            if (i % 2 == 0) {
                continue; // döngüyü devam ettir
                //break;    // döngüyü bitir
            }
            System.out.println(i);
        }
    }
}
