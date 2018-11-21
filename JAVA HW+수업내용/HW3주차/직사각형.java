import java.util.Scanner;
public class 직사각형{
	public static void main(String[]args){
		Scanner s= new Scanner(System.in);
		int garo, sero, banbok;
		System.out.print("세로를 입력하세요: ");
		sero=s.nextInt();
		System.out.print("반복횟수를 입력하세요: ");
		banbok=s.nextInt();
		System.out.print("가로를 입력하세요: ");
		garo=s.nextInt();
		for(int i=0; i<sero; i++){
			for(int j=0; j<banbok; j++){
				for(int k=0; k<garo; k++){
				System.out.print("*");}
			System.out.print("\t");}
		System.out.println();}
	}
}
