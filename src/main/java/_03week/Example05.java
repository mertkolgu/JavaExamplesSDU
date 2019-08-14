/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _03week;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Mert
 */
public class Example05 {

    public static void main(String[] args) {
        
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);
        int randSayi, tahmin;

        randSayi = 10 + rnd.nextInt(90);
        JOptionPane.showMessageDialog(null, randSayi);

        System.out.print("Tahmininiz : ");
        tahmin = sc.nextInt();

        int birler = tahmin % 10;
        int onlar = tahmin / 10;
        int yeniSayi = birler * 10 + onlar;

        if (randSayi == tahmin) {
            System.out.println("10000$ kazandınız!");
        } else if (randSayi == yeniSayi) {
            System.out.println("3000$ kazandınız!");
        } else if (randSayi == birler || randSayi % 10 == onlar || randSayi / 10 == birler || randSayi / 10 == onlar) {
            System.out.println("1000$ kazandınız!");
        } else {
            System.out.println("Hiçbir şey kazanamadınız!");
        }
    }
}
