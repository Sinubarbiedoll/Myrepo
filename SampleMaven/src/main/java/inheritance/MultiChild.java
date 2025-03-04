package inheritance;

public class MultiChild extends Intermediate {
			
		public void MulChild()
		{
			System.out.println("This is a MultiChild class");
		}

	public static void main(String[] args) {
		
		MultiChild M = new MultiChild();
		M.Multiple();
		M.Mul();
		M.MulChild();
		// TODO Auto-generated method stub

	}

}
