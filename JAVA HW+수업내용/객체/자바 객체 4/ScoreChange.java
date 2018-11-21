//학생들의 점수 평균 계산하는 프로그램. 
import java.util.Scanner;
class ScoreChange{
	public static void main(String [] args){
		//학생수 입력받아 
		//그 만큼의 배열 생성
		//점수는 0-100 정수형난수로 초기화
		//평균 계산
		
		Scanner s = new Scanner(System.in);
		System.out.print("학생수: ");
		int n = s.nextInt();
		int [] scores = new int[n];
		
		
		System.out.printf("평균: %.2f\n", getAvrg(scores));
		
	}
	
	static double getAvrg(int [] arr){//평균 반환하는 메소드: 정수형 배열을 받아서 배열 원소들의 평균(실수형)을 반환
		double sum=0;
		for(int i=0; i<arr.length;i++){
			arr[i] = (int)(Math.random()*101);
			sum += arr[i];
		}
		return sum/arr.length;
	}
}