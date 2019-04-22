public class Person {
	private String firstName;
	private String lastName;
	private String emailAddress;
	
	public Person (String aFirstName, String aLastName) {
		firstName = aFirstName;
		lastName = aLastName;
		if(aLastName.length() > 5)
			emailAddress = Character.toString(aFirstName.charAt(0)) 
					+ Character.toString(aLastName.charAt(0)) 
					+ Character.toString(aLastName.charAt(1)) 
					+ Character.toString(aLastName.charAt(2)) 
					+ Character.toString(aLastName.charAt(3))
					+ Character.toString(aLastName.charAt(4)) 
					+ "@yahoo.com";
		else
			emailAddress = aFirstName.charAt(0) + aLastName + "@yahoo.com";
	}
	
	public String getFirstName() { return firstName; }
	public String getLastName() { return lastName; }
	public String getEmailAddress() { return emailAddress; }
	
	public void setFirstName(String aFirstName) { firstName = aFirstName; }
	public void setLastName(String aLastName) { lastName = aLastName; }
	
	public String toString () {
		return firstName + " " + lastName + " has email address " + emailAddress; 
	}
}