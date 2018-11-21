import java.util.Scanner;
public class Hw3{
	public static void main(String[]args){
		int i,n, sum=0;
		Scanner s = new Scanner(System.in);
		System.out.print("1보다 큰 수 n을 입력하세요.");
		n=s.nextInt();
		for (i=1;i<=n;i++){
			if(i%2==0) {System.out.printf("-%d^2",i);
			sum+=-i*i;}
			else if (i==1) {System.out.print("1^2");
			sum+=1;}
			else {System.out.printf("+%d^2",i);
			sum+=i*i;}
		}
		System.out.printf("=%d",sum);
	}
}
			
			