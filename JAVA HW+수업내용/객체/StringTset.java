class StringTest{
	public static void main(String [] args){
		String a1 = "abcd";
		String a2 = "abfef";
		String a3 = "Hi";
		String a4 = "hi";
		
		System.out.println(a3.equals(a4));//false
		System.out.println(a3.equalsIgnoreCase(a4));//true
		
		//substring(int,int)
		//a2에서 fef만 추려내게
		System.out.println(a2.substring(2,5))
		
		
		//charAt()
		System.out.println(a1.charAt(1));//n번째 문자를 알고싶으면 n-1을 이자로 넣어줘야함.
		
		//compareTo(a1,a2)
		System.out.println(a1.compareTo(a2));//c-f = -3
		System.out.println(a2.compareTo(a1));//c-f = 3
		//concat(a1, a2) = +와 같음
		System.out.println(a2.concat(a1));//abfefabcd
		System.out.println(a1+a2);//abfefabcd
		
		//문자열의 내용을 비교하고 싶을때는 equals 메소드 사용
		System.out.println(a2.equals(a1));
	}
}
