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
public class Example06 {

    public static void main(String[] args) {
        // 20 karakterli rastgele şifre oluşturma

        String sifre = "";
        int secim, rakam;
        char karakter;
        boolean kucukHarf = false, buyukHarf = false;

        while (kucukHarf == false || buyukHarf == false) {
            sifre = "";
            for (int i = 0; i < 20; i++) {
                secim = 1 + (int) (Math.random() * 3);
                if (secim == 1) {
                    karakter = (char) (97 + (int) (Math.random() * 26));
                    sifre += karakter;
                    kucukHarf = true;
                } else if (secim == 2) {
                    karakter = (char) (65 + (int) (Math.random() * 26));
                    sifre += karakter;
                    buyukHarf = true;
                } else {
                    rakam = (int) (Math.random() * 10);
                    sifre += rakam;
                }
            }
        }
        System.out.println("Şifre = " + sifre);
    }
}
