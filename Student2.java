package Basic_Oops_Programs_1;
/*Program 2: Assign and print the roll number, phone number and address of two students 
having names "Sam" and "John" respectively by creating two objects of class 'Student'.
*/
public class Student2 {
	int roll_no;
	long phone_no;
	String address;
	String name1="Sam";
	String name2="John";
	public static void main(String[] args) {
		Student2 s1=new Student2();
		s1.roll_no=1;
		s1.phone_no=9876543210L;
		s1.address="Btm Layout,Bangalore";
		
		Student2 s2=new Student2();
		s2.roll_no=2;
		s2.phone_no=9012345678L;
		s2.address="Govindpuri,New Delhi";
		
		System.out.println(s1.roll_no+" "+s1.name1+" "+s1.phone_no+" "+s1.address);
		System.out.println(s2.roll_no+" "+s2.name2+" "+s2.phone_no+" "+s2.address);
	}
}
