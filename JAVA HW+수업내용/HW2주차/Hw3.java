import java.util.Scanner;
public class Hw3{
	public static void main (String [] args){
		double x1, x2, y1, y2, width, height, length, area;
		Scanner s = new Scanner(System.in);
		System.out.printf("첫번째 점의 x,y점을 순서대로 입력해 주십시오: ");
		x1= s.nextDouble();
		y1= s.nextDouble();
		System.out.printf("두번째 점의 x,y점을 순서대로 입력해 주십시오: ");
		x2= s.nextDouble();
		y2= s.nextDouble();
		width=x2-x1;
		height=y2-y1;
		
		
		
		if (width==0 ||	height==0) System.out.print("직사각형아니다 임마.");
			else { if (width<0) width=width*(-1);
			if(height<0) height=height*(-1);
			length=2*(width+height);
			area=width*height;
			System.out.printf("직사각형의 둘레는 %.3f이고 넓이는 %.3f입니다.",  length, area);
		}		
	}
}
		