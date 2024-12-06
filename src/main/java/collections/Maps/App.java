package collections.Maps;

import java.util.*;

public class App {
	public static void main(String[] args) {
		Map<String, Person> peopleWithNicknames = new HashMap<>();

		Person person1 = new Person("Vlad Pop", "142536");
		Person person2 = new Person("Ana Morar", "748596");

		//  We can populate the HashMap collection with put() method:
		peopleWithNicknames.put("Vladut", person1);
		peopleWithNicknames.put("Anisoara", person2);

		//  We can access a person with the nickname, with get() method:
		System.out.println(peopleWithNicknames.get("Vladut"));

		//  Maps are more useful to keep this kind of info, than an object.
		//  We can have 100 different computer settings, so 100 fields in an object will be hard to work with.
		//  Also, in a Map we can add a new key at run time, and the fields of an object cannot be created at runtime.
		Map<String, String> computerSettings = new HashMap<>();

		computerSettings.put("brightness", "50%");
		computerSettings.put("contrast", "85%");
		computerSettings.put("language", "romanian");

		//  If we want to see all the computer settings(keys):
		System.out.println(computerSettings.keySet());

		for(Map.Entry entry : computerSettings.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
}
