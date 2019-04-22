/*
Class: ECE25100 Object Oriented Programming
Instructor: Xiaoli Yang
Author: Matthew Massom
Assignment: 2
File Name: Home.java
Date: 3/3/2018
*/

public class Home{
	private String location;
	private String model;
	private String address;
	private boolean availability;
	private int year;
	private int mlsNumber;
	private int noOfPotentialBuyers;
	private double price;
	
	public Home(String aLocation, String aModel, String aAddress, int aYear, int aNoOfPotentialBuyers, int aMlsNumber, double aPrice) {
		location = aLocation;
		model = aModel;
		address = aAddress;
		year = aYear;
		mlsNumber = aMlsNumber;
		noOfPotentialBuyers = aNoOfPotentialBuyers;
		price = aPrice;
		availability = true;
	}
	
	public String getLocation() { return location; }
	public String getModel() { return model; }
	public String getAddress() {return address; }
	public boolean getAvailability() { return availability; }
	public int getYear() { return year; }
	public int getMlsNumber() { return mlsNumber; }
	public int getNoOfPotentialBuyers() { return noOfPotentialBuyers; }
	public double getPrice() { return price; }
	
	public void setLocation(String aLocation) { location = aLocation; }
	public void setModel(String aModel) { model = aModel; }
	public void setAddress(String aAddress) { address = aAddress; }
	public void setAvailability(boolean aAvailability) { availability = aAvailability; }
	public void setYear(int aYear) { year = aYear; }
	public void setMlsNumber(int aMlsNumber) { mlsNumber = aMlsNumber; }
	public void setNoOfPotentialBuyers(int aNoOfPotentialBuyers) { noOfPotentialBuyers = aNoOfPotentialBuyers; }
	public void setPrice(double aPrice) { price = aPrice; }

	public String toString() {
		return location + ", " + model + ", at " + address;
	}
}