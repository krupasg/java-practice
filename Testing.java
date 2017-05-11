import java.util.ArrayList;

class Emp {
	int eid;
	String ename;

	Emp(int eid, String ename) {
		this.eid = eid;
		this.ename = ename;
	}
}

class Student {
	int sid;
	String sname;

	Student(int sid, String sname) {
		this.sid = sid;
		this.sname = sname;
	}
}

/*public class Testing {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		Emp e1 = new Emp(111, "ssssss");
		Student s1 = new Student(222, "hhhhhhhh");
		al.add(e1);
		al.add(s1);
		System.out.println(al);
		System.out.println(al.toString());
	}
}*/

class Testing{
	public static void main(String[] args){
		ArrayList<Emp> al = new ArrayList<Emp>();
		al.add(new Emp(12,"krupa"));
		al.add(new Emp(13, "krupa2"));
		al.add(new Emp(24, "krupa3"));
		al.remove(1);
		al.size();
		al.isEmpty();
		al.clear();
		for(Emp e:al){
		System.out.println(e.eid  +".......   "+e.ename);
		}
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		}
}