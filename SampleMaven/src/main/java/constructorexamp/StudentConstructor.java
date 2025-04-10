package constructorexamp;

public class StudentConstructor {
	
	public StudentConstructor()
	{
		System.out.println("My name is Giza");
	}
	public StudentConstructor(int a, int b)
	{
		int sum = a+b;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		
		StudentConstructor stu =new StudentConstructor();
		StudentConstructor stu1 =new StudentConstructor(50,20);
// TODO Auto-generated method stub

	}

}
