import java.util.Scanner;
public class ComputeArea{
	public static void main(String[]args){
	double radius;
	final double pi=3.14;
	double area;
	Scanner s = new Scanner(System.in);
	System.out.print("�� ������:");
	radius = s.nextDouble();// nextdouble���°� �������������� ������ �ޱ����ؼ� ������
	System.out.format("�� ����:%.2f\n", radius*radius*pi);
	area = radius*radius*pi;
	System.out.printf("�� ������:%.2f\n�� ����:%.2f\n", radius, area);
	System.out.println("�� ������: "+radius+"\n�� ����: "+area);//+radius+�� �ι�° +�ǹ�?, 
	//�̰Ŵ� �Ҽ��� �Ʒ� �ڸ��� ���� �� �� ������?
}
}
