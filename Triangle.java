package Basic_Oops_Programs_1;
//Program 3: Write a program to print the area and perimeter of a triangle having sides by 
//creating a class named 'Triangle' without any parameter in its constructor.
public class Triangle {
	int side1,side2,side3;
	public Triangle() {
		this.side1=15;
		this.side2=10;
		this.side3=25;
	}
	public static void main(String[] args) {
		Triangle t=new Triangle();
		int perimeter=t.side1+t.side2+t.side3;
		float area=(t.side2*t.side1)/2;
		System.out.println("Perimeter of rectangle: "+perimeter);
		System.out.println("Area of rectangle: "+area);
	}
}
