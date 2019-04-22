/*
Class: ECE25100 Object Oriented Programming
Instructor: Xiaoli Yang
Author: Matthew Massom
Assignment: 2
File Name: Buyer.java
Date: 3/3/2018
*/

public class Buyer{
	private String name;
	private String address;
	private String phoneNumber;
	private int mlsNumber;
	
	public Buyer(String aName, String aAddress, String aPhoneNumber, int aMlsNumber) {
		name = aName;
		address = aAddress;
		phoneNumber = aPhoneNumber;
		mlsNumber = aMlsNumber;
	}
	
	public Buyer() {
		name = "name unknown";
		address = "address unknown";
		phoneNumber = "phone number unknown";
	}
	
	public String getName() { return name; }
	public String getAddress() { return address; }
	public String getPhoneNumber() { return phoneNumber; }
	public int getMlsNumber() { return mlsNumber; }
	
	public void setName(String aName) { name = aName; }
	public void setAddress(String aAddress) { address = aAddress; }
	public void setPhoneNumber(String aPhoneNumber) { phoneNumber = aPhoneNumber; }
	public void setMlsNumber(int aMlsNumber) { mlsNumber = aMlsNumber; }
	
	public String toString() {
		return name + ", " + address;
	}
	
	public void viewHome(Home aHome) {
		aHome.setNoOfPotentialBuyers(aHome.getNoOfPotentialBuyers() + 1);
	}
}