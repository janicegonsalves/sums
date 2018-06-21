package complete;
import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner aj=new Scanner(System.in);
		System.out.println("enter first number");
		int num1=aj.nextInt();
		System.out.println("enter second number");
		int num2=aj.nextInt();
		int sum=Total(num1,num2);
		System.out.println("sum is "+sum);
		
		

	}


public static int Total(int x, int y)
{
	int s;
	s=x+y;
	return s;
}}
