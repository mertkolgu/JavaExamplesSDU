/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _03week;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Mert
 */
public class Example02 {

    public static void main(String[] args) {

        Random rnd = new Random();
        int number1, number2;

        number1 = rnd.nextInt(10);
        number2 = rnd.nextInt(10);

        if (number1 > number2) {
            String question = String.format("What is %d - %d", number1, number2);
            String answer = JOptionPane.showInputDialog(null, question, "Soru", JOptionPane.QUESTION_MESSAGE);
            if ((number1 - number2) == Integer.parseInt(answer)) {
                JOptionPane.showMessageDialog(null, "Doğru");
            } else {
                JOptionPane.showMessageDialog(null, "Yanlış");
            }
        } else {
            JOptionPane.showMessageDialog(null, "number1 küçük number2");
        }
    }
}
