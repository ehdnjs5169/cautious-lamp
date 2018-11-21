import java.util.Scanner;
public class Temp{
	public static void main(String [] args){
		double fah, cel;
		Scanner s = new Scanner(System.in);
		System.out.println("몇도?");
		fah=s.nextDouble();
		cel=(5/9.0)*(fah-32);
		System.out.printf("화씨로 %f도는 도씨로 %f도 입니다", fah, cel);
		
	}
}
		