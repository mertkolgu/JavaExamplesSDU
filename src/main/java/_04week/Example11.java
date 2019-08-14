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
public class Example11 {

    public static void ekranaYaz() {

        System.out.println("Ben bu dersi sevmiyorum.");
    }

    public static void ekranaYaz2(String mesaj) {

        System.out.println(mesaj);
    }

    public static void ekranaYaz3(String mesaj, int tekrar) {

        for (int i = 0; i < tekrar; i++) {
            System.out.println(mesaj);
        }
    }

    public static void main(String[] args) {

        ekranaYaz();
        ekranaYaz();
        ekranaYaz();
        ekranaYaz2("Ben bu dersi sevmiyorum.");
        ekranaYaz2("Seversin seversin.");
        ekranaYaz2("Zorla güzellik olmaz.");
        ekranaYaz3("Ben bu dersi geçeceğim", 40);
    }
}
