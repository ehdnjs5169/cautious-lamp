import java.util.Scanner;
public class Hell{//Ŭ���� ���
	public static void main(String[] args){//��Ʈ������ �迭
		double radius;
		final double Pi = 3.14; // final = ���ȭ , ����� ���ʻ� �빮�ڷ� ǥ��
		double area;
		Scanner s = new Scanner(System.in);
		System.out.print("�� ������: ");
		radius = s.nextDouble();
		System.out.format("�� ����: %.2f\n", radius*radius*Pi);// printf�� ������ ������ ����(%d, %f, %c, %s)�� �� ���� printf�� c���� ���� ���� java������ format�� ���� ����
		area=radius*radius*Pi;
		System.out.printf("�� ������ %.2f\n�� ����: %.2f\n", radius, area);
		System.out.println("�� ������: "+radius+"\n�� ����: "+area);
	
	}
}