/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _01week;

import java.util.Scanner;

/**
 *
 * @author Mert
 */
public class Example07 {
    
    public static void main(String[] args) {
        // fahrenhayt sıcaklığı celsius'a çevirme
        
        Scanner sc = new Scanner(System.in);
        double celcius, fahrenheit;
        
        System.out.print("Fahrenheit olarak sıcaklık : ");
        fahrenheit = sc.nextDouble();
        
        celcius = (5.0 / 9) * (fahrenheit - 32);
        
        System.out.println("Celcius = " + celcius);
        System.out.printf("Celcius = %.2f\n", celcius);
        // .2f noktadan sonraki kaç basamak gözükmesi gerektiğini belirtir
    }
}
