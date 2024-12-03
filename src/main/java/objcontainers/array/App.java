package objcontainers.array;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("Alina");

        Unemployed unemployed1 = new Unemployed();
        unemployed1.setName("Radu");

        Person[] persons = new Person[3];

        persons[0] = student1;
        persons[1] = unemployed1;
        persons[2] = student1;

        persons[2] = null;

        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);
        }
    }
}
