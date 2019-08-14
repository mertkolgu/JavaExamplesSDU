/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _03week;

import javax.swing.JOptionPane;

/**
 *
 * @author Mert
 */
public class Example09 {

    public static void main(String[] args) {

        int result = JOptionPane.showConfirmDialog(null, "Program Kapatılsın Mı?", "Dikkat", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (result == JOptionPane.YES_OPTION) {
            System.out.println("Yes seçildi");
        } else {
            System.out.println("No seçildi");
        }
    }
}
