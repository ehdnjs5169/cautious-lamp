import java.util.Scanner;
public class Temp{
	public static void main(String [] args){
		double fah, cel;
		Scanner s = new Scanner(System.in);
		System.out.println("�?");
		fah=s.nextDouble();
		cel=(5/9.0)*(fah-32);
		System.out.printf("ȭ���� %f���� ������ %f�� �Դϴ�", fah, cel);
		
	}
}
		