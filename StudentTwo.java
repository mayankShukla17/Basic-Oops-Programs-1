package Basic_Oops_Programs_1;
/*Program 2: Assign and print the roll number, phone number and address of two students 
having names "Sam" and "John" respectively by creating two objects of class 'Student'.
 */
public class StudentTwo {
	int roll_no;
	long phone_no;
	String address;
	String name1="Sam";
	String name2="John";
	public static void main(String[] args) {
		StudentTwo student1=new StudentTwo();
		student1.roll_no=1;
		student1.phone_no=9876543210L;
		student1.address="Btm Layout,Bangalore";

		StudentTwo student2=new StudentTwo();
		student2.roll_no=2;
		student2.phone_no=9012345678L;
		student2.address="Govindpuri,New Delhi";

		System.out.println(student1.roll_no+" "+student1.name1+" "+student1.phone_no+" "+student1.address);
		System.out.println(student2.roll_no+" "+student2.name2+" "+student2.phone_no+" "+student2.address);
	}
}
