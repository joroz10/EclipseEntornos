package org.cuatrovientos.ed;

import java.util.Date;

public class User {

	private String name;
	private String surname;
	private Date birthday;
	
	public User() {
		name = "cuatrovientos";
		surname = "cuatrovientos";
	}
	
	public User(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public int getAge() {
		//Obtener el año actual desde la fecha de hoy y restar 
		//el año de la fecha de nacimiento
		int calculateAge = 41;
		return calculateAge;
		
		
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", surname=" + surname + "]";
	}

}
