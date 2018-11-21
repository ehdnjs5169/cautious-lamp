import java.util.Scanner;
public class Hw2{
	public static void main (String [] args){
		int n, abs;
		String sign;
		System.out.print("정수를 입력하시오: ");
		Scanner s = new Scanner(System.in);
		n=s.nextInt();
		sign= (n>>31==0)? "양수": "음수";
		if (sign=="음수") abs=~n+1;
		else abs=n;
		
	System.out.printf("\"정수 %d는 %s이며 절댓값은 %d이고 \n\t절댓값을 4로 나눈 몫은 %d이며 \n\t\t나머지는 %d입니다.\"", n, sign, abs, abs>>2, abs&0b11);
	}
}
	
		