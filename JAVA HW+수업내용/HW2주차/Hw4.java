import java.util.Scanner;
public class Hw4{
	public static void main (String [] args){
		int score;
		Scanner s = new Scanner(System.in);
	
		System.out.print("�����̰�?: ");
		score=s.nextInt();
		if (score> 100 || score<0) System.out.print("�߸��Է��ϼ̽��ϴ�.");
		else if(score>=90) System.out.print("'��'");
		else if(score>=80)System.out.print("'��'");
		else if(score>=70)System.out.print("'��'");
		else if(score>=60)System.out.print("'��'");
		else System.out.print("'��'");
	}
}
		