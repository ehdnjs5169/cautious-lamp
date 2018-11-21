//학생들의 점수 평균 계산하는 프로그램.
import java.util.Scanner;
class D05112{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		double total=0;
	
		//학생수 입력받아
		//그만큼의 배열 생성
		//점수는 0-100 정수형 난수로 초기화
		//평균 계산
		System.out.print("학생수는? ");
		int n = s.nextInt();
		
		
		int [] scores = new int[n];
		for(int i=0; i<scores.length;i++){
			scores[i] = (int)(Math.random()*101);
			total +=scores[i];
		}
		System.out.printf("평균은 %.2f\n", total/scores.length);
		
		System.out.print("평균은: "+getAvrg(scores));
	
	}


	static double getAvrg(int [] arr){//평균 반환하는 메소드: 정수형배열받아 배열원소들의 평균을 반환
		double sum=0;
		for(int i=0; i<arr.length;i++){
			arr[i] = (int)(Math.random()*101);
			sum+=arr[i];
			
			}
			return sum/arr.length;
	}
}