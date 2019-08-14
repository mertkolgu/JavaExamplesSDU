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
public class Example14 {

    public static void main(String[] args) {

        int[] kaynak = {1, 2, 3, 4, 5};
        int[] hedef = new int[kaynak.length];

        // kaynak diziden hedef diziye rahatça kopyalama işlemi yapar
        System.arraycopy(kaynak, 0, hedef, 0, kaynak.length);

        for (int elm : hedef) {
            System.out.println(elm);
        }
    }
}
