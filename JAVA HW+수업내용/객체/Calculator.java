class Calculator{
	//필드
	int a, b;
	double pi=3.14;
	
	//add 메소드 : 반환타입+메소드명(매개변수들)
	void add(double d1, double d2){//출력만 하면 끝이기 때문에 반환타입이 void
		System.out.println("두수의 합은? "+(d1+d2));
	
	}
	
	//mul메소드: 두수의 곱을 반환한느 메소드
	double mul(double d1, double d2){
		return d1*d2; //d1*d2이거를 다시 반환하기 때문에 반환타입은 double. return는 내보낸다는 뜻 
		}
		
	//area메소드: 반지름을 받아 넓이를 반환
	double area(double radius){
		return pi*radius*radius;
	}
	
}
