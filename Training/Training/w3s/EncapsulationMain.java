package w3s;

public class EncapsulationMain {

	public static void main(String[] args) {
		Encapsulation person = new Encapsulation();
		person.setAge(25);
		person.setBirthday(2000);
		person.setfName("Johnny");
		
		System.out.print(person.getfName());
		System.out.print(" "+person.getmName());
		System.out.println(" "+person.getAge());

		
		
	}

}
