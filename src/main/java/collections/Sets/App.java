package collections.Sets;

import java.util.HashSet;
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


        Person pers1 = new Person("Zaharia ", 24);
        Person pers2 = new Person("Bogdan", 35);
        Person pers3 = new Person("Ion", 18);

        Set<Person> set = new HashSet<>();

        set.add(pers1);
        set.add(pers2);
        set.add(pers3);

        System.out.println(set);

    }
}
