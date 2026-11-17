import java.util.Scanner;

public class DynamicInput {
	public static void main(String[] args) {
		
	/*
	 * int age =19;  // hardcoding the value
	 * System.out.println(age);
	 */
	/*
	 * sc.nextShort(); sc.nextByte(); sc.nextInt(); sc.nextLong(); sc.nextFloat();
	 * sc.nextDouble(); sc.nextLine(); sc.next();
	 */
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the baseSalary");
	int salary=sc.nextInt();
	 System.out.println("the baseSalary is " + salary);
	 System.out.println("enter the short value");
	short a=sc.nextShort();
	System.out.println("Short value is " + a);
	System.out.println("--------------");
	sc.nextLine(); // should give for string because "space' itself char
	System.out.println("enter the name");
	//String name =sc.next(); // a ravi =>prints only , sc.nextLine=> prints whole value (a ravi) because 'space' itself is character
	String name = sc.nextLine();
		
	System.out.println("name is " + name);
	}
}
