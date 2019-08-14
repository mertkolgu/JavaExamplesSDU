/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _02week;

import javax.swing.JOptionPane;

/**
 *
 * @author Mert
 */
public class Example07 {
    
    public static void main(String[] args) {
        
        String sayi1 = JOptionPane.showInputDialog(null, "ilk sayıyı giriniz", "Bilgi Girişi", JOptionPane.INFORMATION_MESSAGE);
        String sayi2 = JOptionPane.showInputDialog(null, "ikinci sayıyı giriniz", "Bilgi Girişi", JOptionPane.PLAIN_MESSAGE);

        int sonuc = Integer.parseInt(sayi1) + Integer.parseInt(sayi2);

        JOptionPane.showMessageDialog(null, sonuc);
    }
}
