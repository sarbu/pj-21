/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spa2;

/**
 *
 * @author sarbu_192
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;


public class User {
    
        private long id=-1;
	private String firstName;
	private String lastName;
	private Date checkIn;
	private Date checkOut;
	/**
	 * @param id
	 * @param firstName
	 * @param lastName
	 * @param checkIn
	 * @param ceckOut
	 */
	public User(long id, String givenName, String surName, Date checkIn, Date checkOut) {
		this.id = id;
		this.firstName = givenName;
		this.lastName = surName;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the gender
	 */
	public Date getcheckIn() {
		return checkIn;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setDate(Date checkIn) {
		this.checkIn = checkIn;
	}
	/**
	 * @return the age
	 */
	public Date getcheckOut() {
		return checkOut;
	}
	/**
	 * @param age the age to set
	 */
	public void setcheckOut(Date checkOut) {
		this.checkOut = checkOut;
	}
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", gender=" + checkIn + ", age="
				+ checkOut + "]";
	}
}