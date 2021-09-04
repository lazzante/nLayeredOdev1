package nLayeredOdev.entities.concretes;

import java.util.ArrayList;

import nLayeredOdev.entities.abstracts.Entity;

public class User implements Entity{
	
	
private String eMail;
private String password;
private String firstName;
private String lastName;

public User() {
	
}

public User(String eMail, String password, String firstName, String lastName) {
	super();
	this.eMail = eMail;
	this.password = password;
	this.firstName = firstName;
	this.lastName = lastName;
	
}




public String geteMail() {
	return eMail;
}


public void seteMail(String eMail) {
	this.eMail = eMail;
}


public String getPassword() {
	return password;
}


public void setPassword(String password) {
	this.password = password;
}


public String getFirstName() {
	return firstName;
}


public void setFirstName(String firstName) {
	this.firstName = firstName;
}


public String getLastName() {
	return lastName;
}


public void setLastName(String lastName) {
	this.lastName = lastName;
}







}
