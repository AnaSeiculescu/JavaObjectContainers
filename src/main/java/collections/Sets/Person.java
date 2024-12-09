package collections.Sets;

import java.util.Objects;

public class Person implements Comparable<Person>{
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", age='" + age + '\'' +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if (o == null || this.getClass() != o.getClass()) return false;
		Person person = (Person) o;
		return Objects.equals(getName(), person.getName());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getName(), getAge());
	}

	@Override
	public int compareTo(Person o) {
		return this.getName().compareTo(o.getName());
	}
}
