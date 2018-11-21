import java.util.Scanner;
public class ComputeArea{
	public static void main(String[]args){
	double radius;
	final double pi=3.14;
	double area;
	Scanner s = new Scanner(System.in);
	System.out.print("원 반지름:");
	radius = s.nextDouble();// nextdouble쓰는게 원반지름다음에 정보를 받기위해서 쓰는지
	System.out.format("원 넓이:%.2f\n", radius*radius*pi);
	area = radius*radius*pi;
	System.out.printf("원 반지름:%.2f\n원 넓이:%.2f\n", radius, area);
	System.out.println("원 반지름: "+radius+"\n원 넓이: "+area);//+radius+의 두번째 +의미?, 
	//이거는 소수점 아래 자리수 지정 할 수 없는지?
}
}
