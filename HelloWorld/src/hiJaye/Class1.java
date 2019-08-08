package hiJaye;

import java.util.Scanner;

public class Class1 {

	public static void main(String[] args) {
		
		//Update data
		
//		System.out.println("we start the test");
//		getData();
//
//		System.out.println("we started again");
//		getData();
//		getData();
		
//		System.out.println(calculatedAdd());
//		int a=5,b=2;
//		int result = calculatedAdd(a,b);
//		System.out.println(result);
//		int result2 = getNumber(a,b);
//		System.out.println(result2);
//		double result3 = getTogether(a,b); 
//		System.out.println(result3);
//		boolean result4 = tureorFalse(a,b);
//		System.out.println(result4);
//		
//		System.out.println("Nuerzhati Yijiati".substring(4, 9));
//		System.out.println("Nuerzhati".substring(4) + "Jiaying Wang".substring(8));
//		System.out.println("You" + result + result2 * result3 + "Happy");
//		System.out.println("Nuer\tzhati" + "Yi\njiati" + "\\" + "\"");
//		
//		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your salary and then press enter button!");
		double salary = input.nextInt();
		System.out.println("Please enter your yearly debt and then press enter button!");
		double debt = input.nextInt();
		System.out.println("Please enter your mortgage amount and then press enter button!");
		double amount = input.nextInt();
		boolean qulify = (salary - debt)*0.35 >amount;
		System.out.println("that is your status: "+qulify);
				
	}

	public static boolean tureorFalse(int number1, int number2)
	{
		return number1 == number2;
		
	}
	
	
	
	
	public static double getTogether(int number1, int number2)
	{
		double result3 = number1 / number2;
		return result3;
	}
	
	

	public static int    getNumber(int number1, int number2)
	{ 
		int result2 = number1 * number2;
		return result2;
	}
	
	
	
	
	
	
	            //This is return type      This is method name
	public static void                      getData()
	{
		System.out.println("This 1 is from Method");
		System.out.println("This 2 is from Method");
		System.out.println("This 3 is from Method");
		System.out.println("This 4 is from Method");
	}
	
	public static int calculatedAdd(int number1, int number2) {
		int result = number1+number2;
		return result;
	}
	
	
	
	
}
