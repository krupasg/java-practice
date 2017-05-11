/*class Employee {
	int eid;
	String name;
	float salary;
	
	void display(){
	System.out.println("Employee Id: "+ eid);
	System.out.println("Employee nmae: "+ name);
	System.out.println("Employee salary: "+ salary);
	}
	Employee(int eid, String name, float salary) {
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}
	public static void main(String[] args){
	Employee emp = new Employee(111, "raaaa", 2999.99f);
	emp.display();
	}
}*/

/*Create a class Employee.java with attributes empNo, empName, address, State, zipCode, phone, designation 
(manager, lead, analyst) , experience in Years, emailAddress, basic, hra, bonus (% of basic). 
Choose appropriate data types and create a constructor, getters & setters for the attributes.
Also create a method to return the total salary (basic + hra + (bonus/100)*basic)   */

class Employee {

	String empName;
	String address;
	String state;
	int zipCode;
	String phoneNumber;
	String designation;
	String experienceInYears;
	String emailAddress;
	double basic, hra, bonus;
	int empNum;
	double totalSalary;

	public Employee(String empName, String address, String state, int zipCode, String phoneNumber, String designation,
			String experienceInYears, String emailAddress, double basic, double hra, double bonus, int empNum,
			double totalSalary) {
		super();
		this.empName = empName;
		this.address = address;
		this.state = state;
		this.zipCode = zipCode;
		this.phoneNumber = phoneNumber;
		this.designation = designation;
		this.experienceInYears = experienceInYears;
		this.emailAddress = emailAddress;
		this.basic = basic;
		this.hra = hra;
		this.bonus = bonus;
		this.empNum = empNum;
		this.totalSalary = totalSalary;
	}

	public int getEmpNum() {
		return empNum;
	}

	public void setEmpNum(int empNum) {
		this.empNum = empNum;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getExperienceInYears() {
		return experienceInYears;
	}

	public void setExperienceInYears(String experienceInYears) {
		this.experienceInYears = experienceInYears;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public double getBasic() {
		return basic;
	}

	public void setBasic(double basic) {
		this.basic = basic;
	}

	public double getHra() {
		return hra;
	}

	public void setHra(double hra) {
		this.hra = hra;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	void totalSalary() {
		totalSalary = (basic + hra + (bonus / 100) * basic);
	}

}
