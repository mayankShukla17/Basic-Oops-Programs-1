package Basic_Oops_Programs_1;
/*Program 4: Write a program to print the area and perimeter of a triangle having sides by 
creating a class named 'Triangle' with the constructor having the three sides as its 
parameters.
*/
public class Triangle2 {
	int side1,side2,side3;
	public Triangle2(int side1,int side2,int side3) {
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
	}
	public static void main(String[] args) {
		Triangle2 t=new Triangle2(15,10,25);
		int perimeter=t.side1+t.side2+t.side3;
		float area=(t.side2*t.side1)/2;
		System.out.println("Perimeter of rectangle: "+perimeter);
		System.out.println("Area of rectangle: "+area);
	}
}
