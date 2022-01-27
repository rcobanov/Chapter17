package se.hkr.Task12;

import java.util.Arrays;
import java.util.Comparator;
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
        //17.12.1 view the objects
        System.out.println(" --------------- 17.12.1 ------------");
        Arrays.stream(invObjects).forEach(System.out::println);
        System.out.println(" --------------- 17.12.2 ------------");
        //17.12.2 Using Streams to sort the objects by priceItem and then display result
        Arrays.stream(invObjects)
                .sorted(Comparator.comparing(Invoice::getPrice))
                .forEach(System.out::println);

        //17.12.3 Map invoice object to description and quantity, sorting by quantity
       Arrays.stream(invObjects)
               .sorted(Comparator.comparing(Invoice::getQuantity))
               .map(invObject -> String.format(
                       "Description: %-15s     Quantity: %d",
                       invObject.getPartDescription(), invObject.getQuantity()))
               .forEach(System.out::println);
    }
}
