import com.sun.org.apache.xerces.internal.xs.datatypes.ObjectList;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Variance {

    public static void main(String[] args) {

        // Covariance - Subtype ok
        final Animal animal = new Dog(); // ok
        // final kotlin.Dog dog = new kotlin.Animal(); // not ok
        // final kotlin.Dog dog = (kotlin.Dog) new kotlin.Animal(); // not ok - ClassCastException
        // kotlin.printName(animal); // ok


        // Java - Use-site Variance

        // Covariance - Generics with wildcard "extends"
        final List<Integer> integers = new ArrayList<>();
        final List<? extends Number> numbers = integers;
        final Number number = numbers.get(0); // We can read from a generic structure
        //numbers.add(new Integer(1)); // not ok


        // Contravariance - Generics with wildcard "super"
        final List<Number> numbers1 = new ArrayList<>();
        List<? super Integer> integers1 = numbers1;
        integers1.add(new Integer(1)); // We can write to a generic structure
        //final Number number1 = integers1.get(0); // not ok

    }

    private static class Animal {
    }

    private static class Dog extends Animal {
    }

    private static void printName(Animal animal) {
        System.out.println(animal.getClass().getSimpleName());
    }
}
