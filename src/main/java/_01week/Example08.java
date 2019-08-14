/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _01week;

/**
 *
 * @author Mert
 */
public class Example08 {

    public static void main(String[] args) {
        // işlem önceliği
        
        int a = 5;
        double b = 4;
        double c = a / b * a++ / 2;
        System.out.println(c);
    }
}
