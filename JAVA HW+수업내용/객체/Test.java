class Test{
	public static void main(String[]args){
		System.out.println(args[0]);//메인의 매개변수 사용
		System.out.println(args[1]);
		//문자열 5를 정수 5로 바꾸고 싶음
		//랩퍼(wrapper)클래스 사용
		//정수로 포장하고 Integer클래스 사용 Integer.parseInt
		int a = Integer.parseInt("17");
		System.out.println(Integer.parseInt(args[0])+Integer.parseInt(args[1]));
		System.out.println(Double.parseDouble(args[2])+Double.parseDouble(args[3]));
		System.out.println(sumAB(10,20));
			
		
	}
		static int sumAB(int a, int b){//a~b까지의 합 구하는 메소드
			int sum=0;
			for(int i=a; i<=b; i++) sum+=i;
			//합을 print => 반환타입: void
			//합을 자신을 호출한 곳으로 반환 => 반환타입: sum의 타입(int)
			return sum; //이 메소드의 결과는 sum이다.
		}
}