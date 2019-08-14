/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _08week;

/**
 *
 * @author Mert
 */
public class Example01 {
    // girilen hexadecimal sayıyı decimal sayıya dönüştürür

    public static double hexToDec(String sayi, int us) {

        if (sayi.isEmpty()) {
            return 0;
        } else {
            String hex = "0123456789ABCDEF";
            double araDeger = hex.indexOf(sayi.charAt(sayi.length() - 1)) * Math.pow(16, us);
            return araDeger + hexToDec(sayi.substring(0, sayi.length() - 1), ++us);
        }
    }

    public static void main(String[] args) {

        System.out.println(hexToDec("63E", 0));
    }
}
