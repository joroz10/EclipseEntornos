package org.cuatrovientos.ed;
public class Main {

	public static void main(String[] args) {
		
		User u1 = new User("Javier", "Oroz");
		//u1.name = "Javier";
		//u1.surname = "Oroz";
		System.out.println(u1.toString());
		
		User u2 = new User();
		u2.setName("Jon");
		u2.setSurname("Lopez");
		System.out.println(u2.toString());
		
		String name;
		name = "Iban";
		String surname;
		surname = "Lakuntza";
		
		
		User u3 = new User();
		u3.setName("Iban");
		u3.setSurname("Lakuntza");;
		System.out.println(u3.toString());
		
	}

}
