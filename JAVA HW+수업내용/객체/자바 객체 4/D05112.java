//학생들의 점수 평균 계산하는 프로그램. 
import java.util.Scanner;
class D05112{
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
		
		System.out.println("변경전: "+scores[1]);
		//변경메소드 호출
		changeScore(scores,70);
		System.out.println("변경후: "+scores[1]);
		changeScore(scores, 1,60);
		System.out.println("변경후 뉴메소드: "+scores[1]);
		
		
	}
	
	/*static void changeScore(int before, int after){
		before=after;//이렇게 하면 원본자체가 바뀌지 않는다. */
	static void changeScore(int [] scores, int after){
		scores[1] = after;//원본에 대한 직접적인 변경
	}
	static void changeScore(int [] scores, int t, int after){
		
		scores[t]=after;
	}
	
	
	static double getAvrg(int [] scores){//평균 반환하는 메소드: 정수형 배열을 받아서 배열 원소들의 평균(실수형)을 반환
		double sum=0;
		for(int i=0; i<scores.length;i++){
			scores[i] = (int)(Math.random()*101);
			sum += scores[i];
		}
		return sum/scores.length;
	}
}