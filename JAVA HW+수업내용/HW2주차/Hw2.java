import java.util.Scanner;
public class Hw2{
	public static void main (String [] args){
		int n, abs;
		String sign;
		System.out.print("������ �Է��Ͻÿ�: ");
		Scanner s = new Scanner(System.in);
		n=s.nextInt();
		sign= (n>>31==0)? "���": "����";
		if (sign=="����") abs=~n+1;
		else abs=n;
		
	System.out.printf("\"���� %d�� %s�̸� ������ %d�̰� \n\t������ 4�� ���� ���� %d�̸� \n\t\t�������� %d�Դϴ�.\"", n, sign, abs, abs>>2, abs&0b11);
	}
}
	
		