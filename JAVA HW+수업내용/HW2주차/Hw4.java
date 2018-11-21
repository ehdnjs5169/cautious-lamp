import java.util.Scanner;
public class Hw4{
	public static void main (String [] args){
		int score;
		Scanner s = new Scanner(System.in);
	
		System.out.print("맻점이고?: ");
		score=s.nextInt();
		if (score> 100 || score<0) System.out.print("잘못입력하셨습니다.");
		else if(score>=90) System.out.print("'수'");
		else if(score>=80)System.out.print("'우'");
		else if(score>=70)System.out.print("'미'");
		else if(score>=60)System.out.print("'양'");
		else System.out.print("'가'");
	}
}
		