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
public class Example04 {

    public static void main(String[] args) {

        char ch = 'a';

        System.out.println("Değişken sayı mı? = " + Character.isDigit(ch));
        // belirtilen değerin sayı olup olmadığına bakar

        System.out.println("Değişken string mi? = " + Character.isLetter(ch));
        // alfabetik karakter olup olmadığını sorguluyor

        System.out.println("Değişken string veya sayı mı? = " + Character.isLetterOrDigit(ch));
        // alfabetik veya digit olup olmadığını sorguluyor

        System.out.println("Değişkende büyük harf var mı? = " + Character.isUpperCase(ch));
        // büyük harf olup olmadığını sorguluyor

        System.out.println("Değişkende küçük harf var mı? = " + Character.isLowerCase(ch));
        // küçük harf olup olmadığını sorguluyor
    }
}
