import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//   daxil edilen sozun palindrom olub olmadigini yoxlayin


//        Scanner sc = new Scanner(System.in);
//        System.out.print("bir text daxil edin: ");
//        String text = sc.nextLine();
//
//
//        if (palindrom(text)){
//            System.out.println("text palindromdur");
//        }
//        else {
//            System.out.println("text palidrom deyil");
//        }
//
//    }
//    public static boolean palindrom(String text){
//        String tersText = "";
//
//        for (int i=text.length()-1; i>=0; i--){
//            tersText += text.charAt(i);
//        }
//        System.out.println(tersText);
//        return text.equals(tersText);


        Scanner sc = new Scanner(System.in);
        System.out.print("metn daxil edin: ");
        String word = sc.nextLine();
        System.out.println("metnin uzunlugu: " + word.length());
        System.out.println("===");

        if (word.isEmpty()) System.out.println("metin bosdur");
        else System.out.println("metin bos deyil");
        System.out.println("===");

        System.out.println("kicik herlerle yazdir: " + word.toLowerCase());
        System.out.println("===");
        System.out.println("boyuk herlerle yazdir: " + word.toUpperCase());
        System.out.println("===");

        if (word.contains("merhaba")) System.out.println("true");
        else System.out.println("false");
        System.out.println("===");

        System.out.println("ilk ve son 5 indexi yazdi: " + word.substring(0, 5) + word.substring(word.length() - 5, word.length()));
        System.out.println("===");

        String text = "test";
        System.out.println("metnleri birlesdir: " + word.concat(text));
        System.out.println("===");
        System.out.println("a herleri eherfi ile evez edin: " + word.replace("a", "e"));
        System.out.println("===");

        System.out.println("metni tersine yazdir: " + toTersWord(word));
        System.out.println("===");

        if (toPalindrom(word)) System.out.println("metn palidromder");
        else System.out.println("metn palidrom deyil");
        toAyriYaz(word);
        toCoxIHerf(word);
    }

    public static String toTersWord(String word) {
        String tersWord = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            tersWord += word.charAt(i);
        }
        return tersWord;
    }

    public static void toAyriYaz(String word) {
        String[] arr = word.split(" ");
        for (var a : arr) {
            System.out.println(a);
        }
    }

    public static boolean toPalindrom(String word) {
        String tersWord = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            tersWord += word.charAt(i);
        }
        return word.equals(tersWord);
    }

    public static void toCoxIHerf(String word) {
        int count = 0;
        int max = 0;
        int k = max;
        char bukva = ' ';

        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(i) == word.charAt(j)) {
                    count++;
                }
            }
            if (count > k) {
                k = count;
                bukva = word.charAt(i);
            }
            count = 0;
        }
        if (k > max) {
            max = k;
            System.out.println("en cox tekrarlanan herf: " + bukva);
        }
    }
}