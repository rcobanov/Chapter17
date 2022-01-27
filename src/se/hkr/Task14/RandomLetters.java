package se.hkr.Task14;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomLetters {
    public static void main(String[] args) {
        //Inser 30 random letters into a list

        SecureRandom rand = new SecureRandom();
        List<Character> charList = new ArrayList<>();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        for(int i = 0; i < 30; i++){
            charList.add(alphabet.charAt(rand.nextInt(26)));
        }

        charList.stream()
                .sorted()
                .forEach(System.out::println);
        System.out.println("------------ distinct only ---- ");
        charList.stream()
                .sorted()
                .distinct()
                .forEach(System.out::println);


    }
}
