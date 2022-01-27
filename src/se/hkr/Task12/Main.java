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

       //17.12.4 Map invoice to part description and the value of the invoice (quantity*priceperItem), order by inv value
        System.out.println("----------- 17.12.4 -----------");
        Arrays.stream(invObjects)
                .sorted(Comparator.comparing(invValue -> invValue.getPrice() * invValue.getQuantity()))
                .map(invValue -> String.format(
                        "Description: %-15s  Invoice amount: %7.2f",
                        invValue.getPartDescription(), (invValue.getPrice() * invValue.getQuantity())))
                .forEach(System.out::println);


        // 17.12.5 Modify 12.4 to select the invoice values in the range of 200 to 500
        System.out.println("----------- 17.12.5 -----------");
        Arrays.stream(invObjects)
                .filter(inv -> inv.getPrice() * inv.getQuantity() >= 200 && inv.getPrice() * inv.getQuantity() <= 500)
                .sorted(Comparator.comparing(inv -> inv.getPrice()* inv.getQuantity()))
                .map(invValue -> String.format(
                        "Description: %-15s  Invoice amount: %7.2f",
                        invValue.getPartDescription(), (invValue.getPrice() * invValue.getQuantity())))
                .forEach(System.out::println);
        // 17.12.6 Find any invoice where the part descriptipn contains saw
        System.out.println("----------- 17.12.6 -----------");
        Arrays.stream(invObjects)
                .filter(inv -> inv.getPartDescription().contains("saw"))
                .forEach(System.out::println);
    }
}
