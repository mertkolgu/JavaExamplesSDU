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
public class Example05 {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("merhaba");

        sb.append(8);   // sonuna ekleme yapar

        sb.append(new char[]{'a', 'b', 'c', 'd'});
        System.out.println(sb.toString());

        char[] harfler = {'i', 'l', 'k', 'e'};

        sb.append(harfler);
        System.out.println(sb.toString());

        sb.delete(0, 3);        // silme yapar
        System.out.println(sb.toString());

        sb.deleteCharAt(2);     // istenilen indisi siler
        System.out.println(sb.toString());

        sb.insert(2, "abf");    // 2'den itibaren araya ekleme yapar
        System.out.println(sb.toString());

        sb.replace(0, 3, "i");  // 0 ile 3 arasını silip i yazıyor
        System.out.println(sb.toString());

        sb.reverse();           // tersine çeviriyor
        System.out.println(sb.toString());

        sb.setCharAt(6, 'i');
        System.out.println(sb.toString());

        System.out.println(sb.length());    // uzunluğu

        sb.trimToSize();

        System.out.println(sb.capacity());  // kapasite
    }
}
