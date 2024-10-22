
public class Main {
   public static void main (String[] arg) {
       HouseCat garfield = new HouseCat("Garfield", 12);
       garfield.eat();
       System.out.println(garfield.isTired());   // prints true

       HouseCat spike = new HouseCat("Spike");
       System.out.println(spike.getWeight()); // prints 13

       Cat plainCat = new Cat(8.6);
       HouseCat cheshireCat = new HouseCat("Cheshire", 12);

       System.out.println(plainCat.noise()); // prints "Meeeeeeooooowww!"
       System.out.println(cheshireCat.noise()); // prints "Hello, my name is Cheshire!"

       Cat suki = new HouseCat("Suki", 8);
       // Calls HouseCat's noise() method
       System.out.println(suki.noise()); // Hello, my name is Suki!

      // System.out.println(((HouseCat) suki).isSatisfied());
   }


}
