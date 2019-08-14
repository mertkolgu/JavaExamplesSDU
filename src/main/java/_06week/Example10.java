/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _06week;

/**
 *
 * @author Mert
 */
public class Example10 {

    public static void main(String[] args) {
        // temp kullanarak diziyi rastgele sıralama

        int[] dizi = {9, 12, 3, 45, 36, 24, 14};
        int index, temp;

        for (int i = 1; i < dizi.length; i++) {
            index = (int) (dizi.length * Math.random());
            temp = dizi[i];
            dizi[i] = dizi[index];
            dizi[index] = temp;
        }

        for (int elm : dizi) {
            System.out.printf("%d \t", elm);
        }
    }
}
