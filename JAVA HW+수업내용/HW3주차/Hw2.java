import java.util.Scanner;
public class Hw2{
	public static void main(String[]args){
		double a,b,result;
		int c;
		Scanner s = new Scanner(System.in);
		System.out.println("ù��° ���� �Է��Ͻÿ�: ");
		a=s.nextDouble();
		System.out.println("�ι�° ���� �Է��Ͻÿ�: ");
		b=s.nextDouble();
		System.out.println("�����ڸ� �Է��Ͻÿ� +:0, -:1, x:2, /:3, %:4");
		c=s.nextInt();
		switch(c){
		case 0:		
		result=a+b;
		if (result%1==0) System.out.printf("������� %f",result);
		else System.out.printf("������� %.2f",result);
		break;
		case 1: 
		result=a-b;
		if (result%1==0) System.out.printf("������� %f",result);
		else System.out.printf("������� %.2f",result);
		break;
		case 2: 
		result=a*b;
		if (result%1==0) System.out.printf("������� %f",result);
		else System.out.printf("������� %.2f",result);
		break;
		case 3: 
		if (b==0)System.out.print("���Ұ�");
		result=a/b;
		if (result%1==0) System.out.println("�������"+(int)result);
		else System.out.printf("������� %.2f",result);
		break;
		case 4: 
		if (b==0)System.out.print("���Ұ�");
		result=a%b;
		if (result%1==0) System.out.printf("������� %f",result);
		else System.out.printf("������� %.2f",result);
		break;
		default:
		System.out.print("�׷� �����ڰ� �����ϴ�.");
		}
	}
}