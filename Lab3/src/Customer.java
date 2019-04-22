public class Customer {
	String name;
	int age;
	char sex;
	float money;
	boolean admitted;
	
	public boolean spend(float amount) {
		if (money < amount) {
			return false;
		}
		else {
			money = money - amount;
			return true;
		}
	}
	
	public void give (Customer c, float amount) {
		if(!spend(amount)) {
			System.out.println("Unable to transfer money to " + c.name + ". Insufficient funds.");
		}
		else {
			c.money = c.money + amount;
			System.out.println("Money succesfully transfered to " + c.name + ".");
		}
	}
	
	public float computeFee() {
		float fee;
		fee = 12.75f;
		if (age <= 3) {
			fee = 0.00f;
		}
		else if ((age >= 4) && (age <= 17)) {
			fee = 8.50f;
		}
		else if (age > 65) {
			fee = fee / 2;
		}
		return fee;
	}
	
	public boolean payAdmission() {
		float fee;
		fee = computeFee();
		if (!spend(fee)) {
			return false;
		}
		else {
			return true;
		}
	}
}