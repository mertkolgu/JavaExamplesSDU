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
public class Example04 {
    
    public static void main(String[] args) {
        // girilen yarıçapla alanı bulma
        
        Scanner sc = new Scanner(System.in);
        double radius, area;
        
        System.out.print("Yarıçapı giriniz : ");
        radius = sc.nextDouble();
        
        area = radius * radius * 3.14;
        
        System.out.println("Area = " + area);
    }
}
