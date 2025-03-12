package encapsulation;

public class Display1 {

	public static void main(String[] args) {
		Display dis = new Display();
		dis.setPassword(12345);
		dis.setUsername("Dis@123");
		System.out.println("The username and password is : " +dis.getPassword() +" " +dis.getUsername());
		// TODO Auto-generated method stub

	}

}
