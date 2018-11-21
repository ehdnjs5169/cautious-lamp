import java.util.Scanner;
public class 다이아몬드{
	public static void main(String[]args){
		int line;
		Scanner s = new Scanner(System.in);
		System.out.print("줄수(홀수): ");
		line=s.nextInt();
		for(int i=0; i<=line/2;i++){
			for(int j=line/2-i;j>0; j--){
				System.out.print(" ");
			}
			for(int j=0; i*2+1>j; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0;line/2-i>=0;i++){
			for(int j=0;j<=i;j++){
			System.out.print(" ");}
			for(int j=0;2*(line/2-i)-1>j;j++){
			System.out.print("*");}
			System.out.println();
		}
	}
}