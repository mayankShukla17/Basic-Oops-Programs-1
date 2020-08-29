package Basic_Oops_Programs_1;
//Program 3: Write a program to print the area and perimeter of a triangle having sides by 
//creating a class named 'Triangle' without any parameter in its constructor.
public class Triangle {
	int sideOne,sideTwo,sideThree;
	public Triangle() {
		this.sideOne=15;
		this.sideTwo=10;
		this.sideThree=25;
	}
	public static void main(String[] args) {
		Triangle triangle=new Triangle();
		int perimeter=triangle.sideOne+triangle.sideTwo+triangle.sideThree;
		float area=(triangle.sideTwo*triangle.sideOne)/2;
		System.out.println("Perimeter of rectangle: "+perimeter);
		System.out.println("Area of rectangle: "+area);
	}
}
