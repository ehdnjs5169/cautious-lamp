import java.util.Scanner;
public class Fuck{
	public static void main (String[] args){
		double radius;
		final double pi=3.14;
		double area;
		Scanner s = new Scanner(System.in);
		
		System.out.print("�� ������: ");
		radius = s.nextDouble();
		System.out.format("�� ����: %.2f\n", radius*radius*pi); //�̱��� ���� �� ��������: ������ �� ��ĭ ����������?
		area = radius*radius*pi;
		System.out.println("�� ������: "+radius+ " �� ����: "+area);
		System.out.printf("�� ������: %.2f �� ����: %.2f\n", radius, area);
	}
}