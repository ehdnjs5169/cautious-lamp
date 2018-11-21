import java.util.Scanner;
public class Hw2{
	public static void main(String[]args){
		double a,b,result;
		int c;
		Scanner s = new Scanner(System.in);
		System.out.println("첫번째 수를 입력하시오: ");
		a=s.nextDouble();
		System.out.println("두번째 수를 입력하시오: ");
		b=s.nextDouble();
		System.out.println("연산자를 입력하시오 +:0, -:1, x:2, /:3, %:4");
		c=s.nextInt();
		switch(c){
		case 0:		
		result=a+b;
		if (result%1==0) System.out.printf("계산결과는 %f",result);
		else System.out.printf("계산결과는 %.2f",result);
		break;
		case 1: 
		result=a-b;
		if (result%1==0) System.out.printf("계산결과는 %f",result);
		else System.out.printf("계산결과는 %.2f",result);
		break;
		case 2: 
		result=a*b;
		if (result%1==0) System.out.printf("계산결과는 %f",result);
		else System.out.printf("계산결과는 %.2f",result);
		break;
		case 3: 
		if (b==0)System.out.print("계산불가");
		result=a/b;
		if (result%1==0) System.out.println("계산결과는"+(int)result);
		else System.out.printf("계산결과는 %.2f",result);
		break;
		case 4: 
		if (b==0)System.out.print("계산불가");
		result=a%b;
		if (result%1==0) System.out.printf("계산결과는 %f",result);
		else System.out.printf("계산결과는 %.2f",result);
		break;
		default:
		System.out.print("그런 연산자가 없습니다.");
		}
	}
}