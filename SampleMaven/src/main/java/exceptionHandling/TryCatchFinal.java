package exceptionHandling;

public class TryCatchFinal {

	public static void main(String[] args) {
		
		/*int a = 9;
		int b = 0;*/
		
		try
		{
			/*int c = a/b;

			int a[]= {10, 20,30};*/
			String name = null;
			//for(int i =0; i<=3; i++)
			//{
				//System.out.println(a[i]);
				System.out.println(name.length());

			//}
		}
		catch(NullPointerException var2)
		{
			System.out.println("Exception1 handled");
		}
		catch(ArrayIndexOutOfBoundsException var1)
		{
			System.out.println("Exception handled");
		}
		catch(Exception var)
		{
			System.out.println("exception handled");
		}
		finally
		{
			System.out.println("end of program");
		}
		// TODO Auto-generated method stub

	}

}
