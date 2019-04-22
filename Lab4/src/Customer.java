public class Customer{
	
	private String		name;
	private int			age;
	private char		sex;
	private float		money;
	private boolean		admitted;
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public char getSex() {
		return sex;
	}
	
	public float getMoney() {
		return money;
	}
	
	public boolean getAdmitted() {
		return admitted;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public void setAge(int a) {
		age = a;
	}
	
	public void setSex(char s) {
		sex = s;
	}
	
	public void setMoney(float m) {
		money = m;
	}
	
	public void setAdmitted(boolean a) {
		admitted = a;
	}
	
	public Customer(String aName) {
		name = aName;
	}
	
	public Customer(String aName, int nAge, char nSex) {
		name = aName;
		age = nAge;
		sex = nSex;
	}
	
	public Customer(String aName, int nAge, char nSex, float nMoney, boolean nAdmitted) {
		name = aName;
		age = nAge;
		sex = nSex;
		money = nMoney;
		admitted = nAdmitted;
	}
	
	public Customer() {
	}
	
	public Customer(char nSex) {
		sex = nSex;
	}
	
	public boolean spend(float amount) {
		if (money < amount)
			return false;
		money -= amount;
		return true;
	}
	
	public void give(Customer c, float amount) {
		if (money >= amount) {
			money -= amount;
			c.money += amount;
		}
	}
	
	public float computeFee() {
		if (age <= 3)
			return 0;
		if (age < 18)
			return 8.50f;
		if (age >= 65)
			return 12.75f * 0.50f;
		
		return 12.75f;
	}
	
	public void payAdmission() {
		if (spend(computeFee()))
			admitted = true;
	}
	
	public String toString() {
		if (sex == 'M') {
			if (admitted == true)
				return "Customer " + name + ": a " + age + " year old male with $" + money + " who has been admitted.";
			else
				return "Customer " + name + ": a " + age + " year old male with $" + money + " who has not been admitted.";
		}
		else {
			if (admitted == true)
				return "Customer " + name + ": a " + age + " year old female with $" + money + " who has been admitted.";
			else
				return "Customer " + name + ": a " + age + " year old female with $" + money + " who has not been admitted.";
		}
		
		
		
	}
}