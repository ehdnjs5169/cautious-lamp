import java.util.Scanner;
public class Hell{//클래스 헤더
	public static void main(String[] args){//스트링들의 배열
		double radius;
		final double Pi = 3.14; // final = 상수화 , 상수는 관례상 대문자로 표기
		double area;
		Scanner s = new Scanner(System.in);
		System.out.print("원 반지름: ");
		radius = s.nextDouble();
		System.out.format("원 넓이: %.2f\n", radius*radius*Pi);// printf가 붙으면 서식을 지정(%d, %f, %c, %s)할 수 있음 printf는 c에서 많이 쓰고 java에서는 format을 많이 쓴다
		area=radius*radius*Pi;
		System.out.printf("원 반지름 %.2f\n원 넓이: %.2f\n", radius, area);
		System.out.println("원 반지름: "+radius+"\n원 넓이: "+area);
	
	}
}