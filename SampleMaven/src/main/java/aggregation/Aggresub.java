package aggregation;

public class Aggresub {
	
	int rollno;
	int mark;
	Aggremain ref;
	
	public Aggresub(int rollno, int mark, Aggremain ref)	
	{
		
		this.rollno = rollno;
		this.mark = mark;
		this.ref = ref;
		
	}
	void display() {
		System.out.println("The rollno and mark of student is: " +rollno +" " +mark);
		System.out.println("The name and age of student is : " +ref.name +" " +ref.age);
	}

	public static void main(String[] args) {
		
		Aggremain main = new Aggremain("ALICE", 30);
		Aggresub sub = new Aggresub(30, 95, main);
		sub.display();
		// TODO Auto-generated method stub

	}

}
