package collections.Sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Fruit apple = new Fruit("apple");
        Fruit cherry = new Fruit("cherry");
        Fruit orange = new Fruit("apple");

        Set<Fruit> fruitList = new HashSet<>();

        fruitList.add(apple);
        fruitList.add(cherry);
        fruitList.add(orange);

        int forLoopRuns = 1;

        for (Fruit fruit : fruitList) {
            System.out.println("We are at run number: " + forLoopRuns);
            System.out.println("current fruit is: " + fruit);
            forLoopRuns++;
        }

        System.out.println("apple hashcode is: " + apple.hashCode());
        System.out.println("cherry hashcode is: " + cherry.hashCode());
        System.out.println("orange hashcode is: " + orange.hashCode());


    }
}
