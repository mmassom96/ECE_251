/*
Class: ECE25100 Object Oriented Programming
Instructor: Xiaoli Yang
Author: Matthew Massom
Assignment: 2
File Name: RealEstateAgent.java
Date: 3/3/2018
*/

public class RealEstateAgent{
	private String name;
	private String employeeNumber;
	private double commissionRate;
	private double totalCommissionEarned;
	
	public RealEstateAgent(String aName, String aEmployeeNumber, double aCommissionRate) {
		name = aName;
		employeeNumber = aEmployeeNumber;
		commissionRate = aCommissionRate;
		totalCommissionEarned = 150.00;
	}
		
	public String getName() { return name; }
	public String getEmployeeNumber() { return employeeNumber; }
	public double getCommissionRate() { return commissionRate; }
	public double getTotalCommissionEarned() { return totalCommissionEarned; }

	public void setName(String aName) { name = aName; }
	public void setEmployeeNumber(String aEmployeeNumber) { employeeNumber = aEmployeeNumber; }
	public void setCommissionRate(double aCommissionRate) { commissionRate = aCommissionRate; }
	public void setTotalCommissionEarned(double aTotalCommissionEarned) { totalCommissionEarned = aTotalCommissionEarned; }

	public String sellHome(Home home, Buyer buyer) {
		if (home.getAvailability() == false) { return null; }
		else {
			double commissionEarned = home.getPrice() * commissionRate;
			addCommission(commissionEarned);
			return home.toString() + "\n" + buyer.toString() + "\n" + name + ", " + employeeNumber;
		}
	}
	
	public void addCommission(double commissionEarned) {
		totalCommissionEarned = totalCommissionEarned + commissionEarned;
	}
}