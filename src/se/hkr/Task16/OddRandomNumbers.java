package se.hkr.Task16;

import java.security.SecureRandom;

public class OddRandomNumbers {
    public static void main(String[] args) {
        SecureRandom rand = new SecureRandom();
        rand.ints(50,1,999)
                .filter(x -> x % 2 != 0)
                .sorted()
                .forEach(System.out::println);

    }
}
