package Basic_Oops_Programs_1;
/*Program 4: Write a program to print the area and perimeter of a triangle having sides by 
creating a class named 'Triangle' with the constructor having the three sides as its 
parameters.
 */
public class TriangleTwo {
	int sideOne,sideTwo,sideThree;
	public TriangleTwo(int side1,int side2,int side3) {
		this.sideOne=side1;
		this.sideTwo=side2;
		this.sideThree=side3;
	}
	public static void main(String[] args) {
		TriangleTwo triangle=new TriangleTwo(15,10,25);
		int perimeter=triangle.sideOne+triangle.sideTwo+triangle.sideThree;
		float area=(triangle.sideTwo*triangle.sideOne)/2;
		System.out.println("Perimeter of rectangle: "+perimeter);
		System.out.println("Area of rectangle: "+area);
	}
}
