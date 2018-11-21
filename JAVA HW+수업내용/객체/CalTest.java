class CalTest{
	public static void main (String args[]){
		Calculator c = new Calculator(); //계산기의 pi출력
		System.out.println(c.pi);//pi가 c에 있다.
		System.out.printf("%f\n",c.pi);
		
		//add메소드 호출
		c.add(5.3, 2);
		
		//mul메소드 호출
		System.out.println("두수의 곱" +c.mul(2,4));
		
		System.out.println("넓이는: "+c.area(4));
}
}