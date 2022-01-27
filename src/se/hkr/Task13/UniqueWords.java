package se.hkr.Task13;

import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;

public class UniqueWords {
    public static void main(String[] args) {
        // Input sentence from user.
        // Display unique words in alphabetic order.
        // treat upper/lowercase the same
        Pattern pattern = Pattern.compile("\\s+");

        System.out.println("Input a sentence!");
        Scanner input = new Scanner(System.in);
        String myText = input.nextLine();

        pattern.splitAsStream(myText)
                .map(String::toLowerCase)
                .distinct()
                .sorted()
                .forEach(System.out::println);


    }
}
