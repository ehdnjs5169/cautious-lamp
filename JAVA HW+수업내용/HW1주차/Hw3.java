import java.util.Scanner;
public class Hw3{
	public static void main(String[] args){
		int age;
		double weight;
		String name;
		Scanner s = new Scanner(System.in);
		System.out.print("이름: ");
		name=s.nextLine();
		System.out.printf("나이: ");
		age=s.nextInt();
		System.out.printf("몸무게: ");
		weight=s.nextDouble();
		System.out.printf("\"나의 이름은 '%s',\n나이는 %#x,\n\t몸무게는 %.3f이다.\"", name, age, weight);
	}
}
			