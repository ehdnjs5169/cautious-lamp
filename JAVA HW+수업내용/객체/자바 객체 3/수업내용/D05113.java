//학생들의 점수 평균 계산하는 프로그램. 
import java.util.Scanner;
class D05113{
	static Scanner s = new Scanner(System.in);
	
	public static void main(String [] args){
		
		System.out.print("배열 크기: ");
		int n = s.nextInt();
		double [] dArr = new double[n];
		
		//초기화 1
		init1(dArr);
		//출력
		printArr(dArr);
		//초기화 2
		init2(dArr);
		//출력
		printArr(dArr);
		//모든 원소의 합 출력
		System.out.println("모든 원소의 합: "+sumArr(dArr));
		//가장 큰 원소 출력
		System.out.println("가장 큰 원소: "+largestElt(dArr));		
		//가장 큰 원소의 첫 번째 인덱스 출력
		System.out.println("가장 큰 원소의 첫번째 인덱스: "+minIndexOfMax(dArr));		
	}
	
	static void init1(double [] arr){//1번
		for(int i=0; i<arr.length; i++){
			System.out.print(i+1+"번째 원소: ");
			arr[i] = s.nextDouble();
		}
	}
	static void init2(double [] arr){//2번
		for(int i=0; i<arr.length;i++){
			arr[i] = Math.random()*10;
		}
	}
	static void printArr(double [] arr){//3번
		for(double d:arr){
			System.out.println(d);
		}
	}
	static double sumArr(double [] arr){//4번
		double sum=0;
		for(double d:arr){
			sum += d;
		}
		return sum;
	}
	static double largestElt(double [] arr){//5번
		double max = arr[0];
		for(double d:arr){
			if(max<d) max = d;
		}
		return max;
	}
	static int minIndexOfMax(double [] arr){//6번: 최댓값도 매개변수로 가지는 경우, 아닌 경우 
		double max = arr[0];
		int index=0;
		for(int i=0; i<arr.length; i++){
			if(max<arr[i]){
				max = arr[i];
				index = i;
			}
		}
		return index;
	}
	
	
	
	
}






