package com.example.assignment;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Assignment {
	int Id;
	String firstname;
	String lastname;
	String middlename;
	String phoneno;
	public Assignment() {};
	public Assignment(int aurthorId,String firstName,String middleName,String lastName,String phoneNo) {
		super();
		this.Id=aurthorId;
		this.firstname=firstName;
		this.lastname=lastName;
		this.middlename=middleName;
		this.phoneno=phoneNo;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getId() {
		return Id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getMiddlename() {
		return middlename;
	}
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public void setId(int id) {
		Id = id;
	}

	
}
