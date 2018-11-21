class D0511{
	public static void main(String []args){//여기서도 배열이다. String타입 배열. args라는 배열이름가진.
		//학생 점수 10개(int) 저장할 배열 (자바에서는 배열도 객체로 생각)
		int [] scores = new int[10];//배열의 구조 대괄호를 중간에. scores를 통해 배열에 접근 가능.
		//10명의 학생들 점수를 반복문을 사용해서 초기화.
		
		
		
		scores[0] = 100;
		scores[1] = 90;
		//...
		scores[9] = 100;
		
		//배열명.length
		//문자열.length()
		System.out.println("scores 배열의 원소 개수:"+scores.length);
		
		//double 형 타입 변수 50개 저장하는 배열 생성
		double [] dArr = new double [50];
		//dArr의 모든 원소 출력: for-each문 사용
		for(double i:dArr){
		System.out.println(i);
		}
		//1번은 10점. 2번은 20점....10번은 100점으로 초기화
		for(int i=0;i<10;i++){
			scores[i] = 10*(i+1);
		}
		//10명의 학생 점수를 출력
		for(int i=0;i<10;i++){//전통적 for문
			System.out.println(scores[i]);
		}
			/*
			for-each문 사용하기
			for(배열의 자료형 변수명:배열명){
				반복해야할 일들 작성
			}
			장점: 배열의 길이를 몰라도 됨.
			포이치문은 읽기 용으로만 쓸수있다. 전통적 포문은 scores[i]와같이 배열에 직접적으로 접근한다.
			*/
		for(int s:scores){//scores: 10 20 30 40 ... 100
			System.out.println("포이치문"+s);
		}	
		}
	}

//배열을 선언할때 중괄호를 통해서 배열 값을 줄 수 있다. 나중에 배열값을 주면 에러
//int [] scores {1,2,3...}-> new int []생략되있음 자바가 알아서 알아들음