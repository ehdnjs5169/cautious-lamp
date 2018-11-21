import java.util.Scanner;
public class Sallary{
	public static void main(String []args){
		int a;
		int b;
		System.out.print("월급을 입력하시오:");
		Scanner m = new Scanner(System.in);
		a=m.nextInt();
		b=10*12*a;
		System.out.printf("10년동안의 저축액: %d\n", b);
	}
}	