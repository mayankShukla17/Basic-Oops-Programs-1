package Basic_Oops_Programs_1;
//Program 5: Print the average of three numbers entered by the user	 by creating a class 
//named 'Average' having a method to calculate and print the average.
import java.util.Scanner;
public class Average{
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter three numbers.");
		int firstNumber=scanner.nextInt();
		int secondNumber=scanner.nextInt();
		int thirdNumber=scanner.nextInt();
		float average=average(firstNumber,secondNumber,thirdNumber);
		System.out.println("Average of numbers are: "+average);
	}
	public static float average(int firstNumber,int secondNumber,int thirdNumber) {
		int sum=firstNumber+secondNumber+thirdNumber;
		float average=sum/3;
		return average;
	}
}
