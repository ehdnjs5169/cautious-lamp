import java.util.Scanner;

public class Hello{
	public static void main(String [] args){
		int age; 
		Scanner s = new Scanner(System.in);
		System.out.print("나이: ");
		age = s.nextInt();
		System.out.println("나이: "+age);
		System.out.printf("나이: %d\n", age);
		
		System.out.println("Welcome to Java!");
		System.out.print("Welcome to Java!\n");
		System.out.printf("Welcome to Java!\n");
	}
}