class CalTestRem{
	public static void main(String [] args){
		CalculatorRem c = new CalculatorRem();
		c.add(5.4,34.6);
		
		System.out.println(c.pi);
		
		System.out.println(c.mul(5.2, 3));
		
		System.out.println("반지름 6인 원의 넓이는? "+c.area(6));	
	}
}