package collections.Maps;

public class Person {
	private String name;
	private String phoneNumber;

	public Person(String name, String phoneNumber){
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", phoneNumber='" + phoneNumber + '\'' +
				'}';
	}
}
