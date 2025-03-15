package studentdetails;

public class StudentAddress {
	
	String address;
	Student stu;
	public  StudentAddress(String address, Student stu)
	{
		this.address = address;
		this.stu = stu;
	}
	public void display()
	{
		System.out.println("The name and roll no of student is : " +stu.sname +" " +stu.rno);
		System.out.println("The address of student is : " +address);
	}

	public static void main(String[] args) {
		Student stud = new Student("ABHI", 28);
		StudentAddress addr = new StudentAddress("greenvalley 123", stud);
		addr.display();
		// TODO Auto-generated method stub

	}

}
