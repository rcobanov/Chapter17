package se.hkr.Task12;

import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Invoice[] invObjects = new Invoice[] {
                new Invoice(83, "Electric sander",7,57.98),
                new Invoice(24,"Power saw",18,99.99),
                new Invoice(7,"Sledge Hammer",11,21.58),
                new Invoice(77,"Hammer",76,11.99),
                new Invoice(39,"Lawn mower",3,79.50),
                new Invoice(68,"Screwdriver",106,6.99),
                new Invoice(56,"Jig saw", 21, 11.00),
                new Invoice(3, "Wrench", 34, 7.50)
        };
        Stream<Invoice> stream = Arrays.stream(invObjects);
        //17.12.1
        stream.forEach(System.out::println);

    }
}
