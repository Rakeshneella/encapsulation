package encapsulation;


//Java program to demonstrate encapsulation

class Encapsulate {
	// private variables declared
	// these can only be accessed by
	// public methods of class
	private String rakeshName;
	private int rakeshRoll;
	private int rakeshAge;

	// get method for age to access
	// private variable geekAge
	public int getAge() { return rakeshAge; }

	// get method for name to access
	// private variable geekName
	public String getName() { return rakeshName; }

	// get method for roll to access
	// private variable geekRoll
	public int getRoll() { return rakeshRoll; }

	// set method for age to access
	// private variable geekage
	public void setAge(int newAge) { rakeshAge = newAge; }

	// set method for name to access
	// private variable geekName
	public void setName(String newName)
	{
		rakeshName = newName;
	}

	// set method for roll to access
	// private variable geekRoll
	public void setRoll(int newRoll) { rakeshRoll = newRoll; }
}

public class TestEncapsulation {
	public static void main(String[] args)
	{
		Encapsulate obj = new Encapsulate();

		// setting values of the variables
		obj.setName("ukp");
		obj.setAge(25);
		obj.setRoll(55);

		// Displaying values of the variables
		System.out.println("rakesh name: " + obj.getName());
		System.out.println(" rakesh age: " + obj.getAge());
		System.out.println("rakesh roll: " + obj.getRoll());

		// Direct access of geekRoll is not possible
		// due to encapsulation
		// System.out.println("Geek's roll: " +
		// obj.geekName);
	}
}
