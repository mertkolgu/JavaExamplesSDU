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
public class Example13 {

    public static int usAl(int taban, int us) {

        int sonuc = 1;
        for (int i = 0; i < us; i++) {
            sonuc *= taban;
        }
        return sonuc;
    }

    public static void main(String[] args) {

        System.out.println(usAl(2, 3));
        
        int sonuc = usAl(2, 5);
        System.out.println(sonuc);
        // iki kullanım da aynı işi görür
    }
}
