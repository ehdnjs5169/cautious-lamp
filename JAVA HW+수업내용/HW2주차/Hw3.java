import java.util.Scanner;
public class Hw3{
	public static void main (String [] args){
		double x1, x2, y1, y2, width, height, length, area;
		Scanner s = new Scanner(System.in);
		System.out.printf("ù��° ���� x,y���� ������� �Է��� �ֽʽÿ�: ");
		x1= s.nextDouble();
		y1= s.nextDouble();
		System.out.printf("�ι�° ���� x,y���� ������� �Է��� �ֽʽÿ�: ");
		x2= s.nextDouble();
		y2= s.nextDouble();
		width=x2-x1;
		height=y2-y1;
		
		
		
		if (width==0 ||	height==0) System.out.print("���簢���ƴϴ� �Ӹ�.");
			else { if (width<0) width=width*(-1);
			if(height<0) height=height*(-1);
			length=2*(width+height);
			area=width*height;
			System.out.printf("���簢���� �ѷ��� %.3f�̰� ���̴� %.3f�Դϴ�.",  length, area);
		}		
	}
}
		