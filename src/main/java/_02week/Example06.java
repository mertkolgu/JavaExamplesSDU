/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _02week;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Mert
 */
public class Example06 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int bolunen, bolen;

        try {
            System.out.print("Bölüneni giriniz : ");
            bolunen = sc.nextInt();

            System.out.print("Böleni giriniz : ");
            bolen = sc.nextInt();

            System.out.println(bolunen + " / " + bolen + " = " + bolunen / bolen);
        } catch (ArithmeticException e) {
            System.out.println("Sıfıra bölme hatası!");
            e.printStackTrace();
        } catch (InputMismatchException e) {
            System.out.println("Hatalı veri girişi!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finally Çalıştı");
        }
    }
}
