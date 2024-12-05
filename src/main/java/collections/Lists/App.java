package collections.Lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Person person1 = new Student();
        Person person2 = new Hired();

        Person[] persons = new Person[4];
        persons[0] = person1;
        persons[1] = person2;

        person1.setName("Alina");
        person2.setName("Radu");

//        for(Person pers : persons) {
//            System.out.println(pers);
//        }

        List<Person> list = new ArrayList<>();
        list.add(person1);
        list.add(person2);

        for (Person pers : list) {
            System.out.println(pers);
            if(pers.getName().equals("Alina")) {
                System.out.println("person with name Alina is at index: " + list.indexOf(pers));
            }
        }

        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).getName().equals("Alina")) {  // method chaining
                System.out.println("person with name Alina is: " + list.get(i));
            }

        }
//        System.out.println(list.indexOf(person2));
//        System.out.println("list size is: " + list.size());


//        LinkedList<Person> list2 = new LinkedList<>();
//        list2.add(person1);
//        list2.add(person2);
//        System.out.println(list2.indexOf(person2));
//
//        for(Person person : list2) {
//            System.out.println(person);
//        }
//
//        System.out.println(list2.get(0));


    }
}
