class IntegerTest{
	public static void main(String [] args){
		
		char c = '가';//문자를 저장할때는 작은따옴표 사용(한 문자만 사용가능)
		//char c2 = 'ac';//불가능 문자가 2개
	    char c1 = '\uac00';//가능: \u뒤에 오는건 유니코드(2바이트=16비트=헥사코드(16진수)는 4자리(bit),ac00(4자리)은 1자리라는 뜻 )
		String s1 = "이학기";//큰따옴표를쓸대는 String을 써야함(문자개수 제한 없음)
		System.out.println("c= "+c);
		//System.out.println("c2= "+c2);
		System.out.println("c1= "+c1);
		System.out.println("s1= "+s1);
		
		System.out.print("이름: ");// 이 학기 라고 입력시
		//name = s.next(); // 이 만 출력 띄어쓰기전까지만
		name = s.nextLine(); // 이 학기 다 출력 한줄을 출력
		
		
		boolean b1 = true, b2 = false, b3 = 1>3;//b3 = false를 의미
		System.out.println("b3: "+b3);// false가 출력됨
		
		int a = 15;
		int a1 = 015;//8진수로 표현, 8진수로 표현시 접두사로 0을 붙여야함
		int a2 = 0x15;//16진수로 표현, 16진수로 표현시 접두사로 0x를 붙여야함
		int a3 = 0b11;//2진수로 표현, 2진수로 표현시 접두사로 0b를 붙여야함
		
		System.out.format("%d, %d, %d\n", a, a1, a2);//10진수 15, 8진수 15, 16진수 15를 10진수로 변환하여 출력
		
		System.out.format("%d, %o, %x\n", a, a1, a2);// 각 진수의 수를 각 진수의 값으로 표현하는것
		
		System.out.format("%d, %#o, %#x\n", a, a1, a2);//각 진수의 접두사를 표현하여 출력할때
		
		System.out.format("%10d, %#10o, %#10x\n", a, a1, a2);//정렬을 맞추고 싶을때 (구글에 치면 설명나옴 % # 숫자의 순서 format specifier wiki)
		
		//System.out.format("%10d, %10d, %10d\n", a); 하나를 세번 뽑고 싶을때 %가 3개일때 ,뒤에있는 인자도 3개여야한다-틀린것
		
		System.out.format("%1$10d, %1$10d, %1$10d\n", a);//하나를 세번 뽑고 싶을때 ,뒤에 a만 적어도 되고 a1, a2같이 적어도됨
		
		System.out.format("%2$10d, %2$10d, %2$10d\n", a, a1, a2);// a1만 세번 뽑고 싶을때
		
		System.out.format("%10d", a3);
	}
}