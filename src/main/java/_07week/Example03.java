/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _07week;

/**
 *
 * @author Mert
 */
public class Example03 {

    public static void main(String[] args) {

        String s1 = "ecir";

        if (s1.equals("ecir")) {
            // tamamen aynı olup olmadığını karşılaştırır
            System.out.println("Aynı");
        }

        if (s1.equalsIgnoreCase("Ecir")) {
            // büyük küçük harf farketmeksizin karşılaştırır
            System.out.println("Aynı");
        }

        String kelime = "merhaba";

        System.out.println("Kelime = " + kelime);

        System.out.println("Kelimenin 2. indisi = " + kelime.charAt(2));
        // istediğin indisteki karakteri verir

        System.out.println("Kelimeleri birleştirme = " + kelime.concat("Dünya"));
        // stringi verilen stringle birleştirir

        System.out.println("Kelimenin içinde var mı? = " + kelime.contains("er"));
        // stringte harf veya grupları içerip içermediğini gösterir

        System.out.println("Kelime 'a' ile bitiyor mu? = " + kelime.endsWith("a"));
        // stringin belirtilen karakter veya karakter grubu ile bitip bitmediğini gösterir

        System.out.println("Kelime 'me' ile başlıyor mu? = " + kelime.startsWith("me"));
        // belirtilen karater veya karakter grubu ile başlayıp başlamadığını

        System.out.println("'a' harfine ilk karşılaşılan indeks = " + kelime.indexOf("a"));
        // belirtilen karakter veya karakter grubunu arayıp ilk rastladığı yerdeki indisi döndürür

        System.out.println("Sondan başlayarak 'e' harfine ilk karşılaşılan indeks = " + kelime.lastIndexOf("e"));
        // sondan başlayarak arar

        System.out.println("Kelime var mı? = " + kelime.isEmpty());
        // stringin boş olup olmadığını kontrol eder

        System.out.println("Kelimenin uzunluğu = " + kelime.length());
        // boşluklar da dahil uzunluğunu verir

        System.out.println("'a' harfini 'e' harfi ile değiştirme = " + kelime.replace("a", "e"));
        // karakter veya karakter grubunu başka karakter veya karakter grubuyla değiştirmemizi sağlar

        String kelime1 = "elma,armut,çilek,muz,kivi";
        String[] meyveler = kelime1.split(","); // virgülle ayrılmış kısımları al

        for (String meyve : meyveler) {
            System.out.println(meyve);
        }

        System.out.println(kelime.substring(2));    // 2.karakterden sonra hepsini al
        System.out.println(kelime.substring(1, 4)); // başlangıç dahil son dahil değil alır
        char[] dizi = kelime.toCharArray();         // karakterleri bir diziye aktarır

        for (char ch : dizi) {
            System.out.println(ch);
        }

        System.out.println(kelime.toUpperCase());   // hepsini büyük harf yapar
        System.out.println(kelime.trim());  // stringin başındaki ve sonundaki boşlukları siler ortasındakileri silmez!!
    }
}
