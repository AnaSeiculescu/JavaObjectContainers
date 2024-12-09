package collections.Sets;

import java.util.Objects;

public class Fruit {
	private String name;

	public Fruit(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Fruit{" +
				"name='" + name + '\'' +
				'}';
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) return true;
		if (object == null || getClass() != object.getClass()) return false;
		Fruit fruit = (Fruit) object;
		return Objects.equals(name, fruit.name);
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(name);
	}
}
