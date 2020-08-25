package Basic_Oops_Programs_1;
//Program 5: Print the average of three numbers entered by the user	 by creating a class 
//named 'Average' having a method to calculate and print the average.
import java.util.Scanner;
public class Average {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three numbers.");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		float avg=average(a,b,c);
		System.out.println("Average of numbers are: "+avg);
	}
	public static float average(int a,int b,int c) {
		int sum=a+b+c;
		float avg=sum/3;
		return avg;
	}
}
