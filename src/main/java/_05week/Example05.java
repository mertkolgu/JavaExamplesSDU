/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _05week;

/**
 *
 * @author Mert
 */
public class Example05 {

    public static void main(String[] args) {
        //Math kütüphanesi

        int sayi = (int) (Math.random() * 10);

        System.out.println(Math.E);
        System.out.println(Math.PI);
        System.out.println(Math.abs(-3.14));    // mutlak değer
        System.out.println(Math.ceil(2.1));     // yukarı yuvarlama
        System.out.println(Math.cos(60 * Math.PI / 180));
        System.out.println(Math.cos(Math.toRadians(60)));
        System.out.println(Math.exp(1));        // e üzeri x
        System.out.println(Math.floor(2.8));    // aşağı yuvarlama
        System.out.println(Math.log(Math.E));
        System.out.println(Math.log10(100));
        System.out.println(Math.max(5, 2));     // max sayı seçme
        System.out.println(Math.min(5, 2));     // min sayı seçme
        System.out.println(Math.pow(2, 3));     // üs alma
        System.out.println(Math.random());
        System.out.println(sayi);
        System.out.println(Math.round(2.5));    // yuvarlama
        System.out.println(Math.rint(2.5));     // yuvarlama
        System.out.println(Math.sqrt(9));       // karekök
    }
}
