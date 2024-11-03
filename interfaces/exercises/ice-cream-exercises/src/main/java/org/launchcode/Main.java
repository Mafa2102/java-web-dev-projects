package org.launchcode;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        ArrayList<Topping> toppings = menu.getToppings();
        Comparator comparator = new FlavorComparator();
        Comparator coneComparator = new ConeComparator();


        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name' field.
        System.out.println("\nBefore sort:\n");
        for (Flavor flavor : flavors) {
            System.out.println(flavor.getName() + " has number of allergens: " + flavor.getAllergens().size());
        }

        flavors.sort(comparator);
        System.out.println("\nAfter sorting by numbers of allergens:\n");
        for (Flavor flavor : flavors) {
            System.out.println(flavor.getName() + " has number of allergens: " + flavor.getAllergens().size());
        }
        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost' field.

        System.out.println("\nBEFORE sort:\n");
        for (Cone cone : cones){
            System.out.println(cone.getName() + " $" + cone.getCost());
        }
        cones.sort(coneComparator);
        System.out.println("\nAFTER sorting by price increasing:\n");
        for (Cone cone : cones){
            System.out.println(cone.getName() + " $" + cone.getCost());
        }

        System.out.println("\nBEFORE sort:\n");
        for (Topping topping : toppings){
            System.out.println(topping.getName() + " has level " + topping.getTastiness() + " of tastiness ");
        }

        toppings.sort(new ToppingComparator());

        System.out.println("\nAfter sorting by level of Tastiness: \n");
        for(Topping topping : toppings) {
            System.out.println(topping.getName() + " Tastiness: " + topping.getTastiness());
        }
        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
    }
}