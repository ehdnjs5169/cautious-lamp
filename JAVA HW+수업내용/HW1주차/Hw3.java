import java.util.Scanner;
public class Hw3{
	public static void main(String[] args){
		int age;
		double weight;
		String name;
		Scanner s = new Scanner(System.in);
		System.out.print("�̸�: ");
		name=s.nextLine();
		System.out.printf("����: ");
		age=s.nextInt();
		System.out.printf("������: ");
		weight=s.nextDouble();
		System.out.printf("\"���� �̸��� '%s',\n���̴� %#x,\n\t�����Դ� %.3f�̴�.\"", name, age, weight);
	}
}
			