import java.util.Scanner;

public class Hello{
	public static void main(String [] args){
		int age; 
		Scanner s = new Scanner(System.in);
		System.out.print("����: ");
		age = s.nextInt();
		System.out.println("����: "+age);
		System.out.printf("����: %d\n", age);
		
		System.out.println("Welcome to Java!");
		System.out.print("Welcome to Java!\n");
		System.out.printf("Welcome to Java!\n");
	}
}