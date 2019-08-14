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
public class Example01 {

    public static void main(String[] args) {
        // do-while vs while
        // wo-while önce bir defa döngüyü çalıştırır sonra kontrol yapar
        // while ise önce kontrol yapar sonra gerekli işlemi yapar
        
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
    }
}
