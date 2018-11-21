import java.util.Scanner;
public class Fuck{
	public static void main (String[] args){
		double radius;
		final double pi=3.14;
		double area;
		Scanner s = new Scanner(System.in);
		
		System.out.print("원 반지름: ");
		radius = s.nextDouble();
		System.out.format("원 넓이: %.2f\n", radius*radius*pi); //이까지 했을 때 원반지름: 다음에 왜 한칸 내려가지나?
		area = radius*radius*pi;
		System.out.println("원 반지름: "+radius+ " 원 넓이: "+area);
		System.out.printf("원 반지름: %.2f 원 넓이: %.2f\n", radius, area);
	}
}