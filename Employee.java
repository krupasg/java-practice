class Employee {
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
}