class Arrays1 {
	public static void main(String[] args){
		int[] a= new int[3];
		a[0]=40;
		a[1]=50;
		a[2]=40;
		//int[] a={20,2,3,4,4,3};
		for(int i=0; i<a.length; i++ )
		System.out.println(a[i]);
	}
}

class TestArray {
	static void min(int arr[]) {
	int min=arr[0];	
	for(int i=1; i<arr.length; i++)
		if (min>arr[i])
			min=arr[i];
		System.out.println(min);
	}
	public static void main(String[] args) {
		int a[] = {33, 45, 67};
		min(a);
	}
}
class Wrapper {
	public static void main(String[] args){
		int a = 20;
		Integer i = Integer.valueOf(a);
		Integer j = a;
		System.out.println(a);
		System.out.println(i);
		System.out.println(j);
	}
}
class Wrapper1 {
	public static void main(String[] args) {
		Integer a = 10;
		int i = a.intValue();
		int j = a;
		System.out.println(a);
		System.out.println(i);
		System.out.println(j);
		
	}
}
class CommandLineExample{  
	public static void main(String args[]){  
		System.out.println("Your first argument is: "+args[0]);  
	}  
}  
class Testimmutablestring{  
 public static void main(String args[]){  
   String s="Sachin";  
   s.concat(" Tendulkar");//concat() method appends the string at the end  
   System.out.println(s);//will print Sachin because strings are immutable objects  
 }  
}  

class Compare {
	public static void main(String[] args){
		String s1 = "krupa sree";
		String s2 = "krupa";
		String s3 = "krup";
		String s4 =new String("KRUPA");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s4));
		System.out.println(s1==s4);
		System.out.println(s1.equalsIgnoreCase(s4));
		String s="hello";  
		System.out.println(s.substring(0,2));//he  
		s1.replace("sree","krup");
		System.out.println(s1.replace("sree","krup"));
	}
}
// toString() exAMPLE

class Student{  
 int rollno;  
 String name;  
 String city;  
  
 Student(int rollno, String name, String city){  
 this.rollno=rollno;  
 this.name=name;  
 this.city=city;  
 }  
  public String toString(){//overriding the toString() method  
  return rollno+" "+name+" "+city;  
 }  
 public static void main(String args[]){  
   Student s1=new Student(101,"Raj","lucknow");  
   Student s2=new Student(102,"Vijay","ghaziabad");  
     
   System.out.println(s1);//compiler writes here s1.toString()  
   System.out.println(s2);//compiler writes here s2.toString()  
 }  
}  


class Exceptions {
	public static void main(String[] args){
		try {
			System.out.println("gggggggggggg");
			System.out.println(10/0);
		}
		catch(ArithmeticException e) {
			System.out.println(10/0);
		}
		System.out.println("last");
	}
}








