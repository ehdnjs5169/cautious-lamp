class StringTest{
	public static void main(String [] args){
		String a1 = "abcd";
		String a2 = "abfef";
		String a3 = "Hi";
		String a4 = "hi";
		
		System.out.println(a3.equals(a4));//false
		System.out.println(a3.equalsIgnoreCase(a4));//true
		
		//substring(int,int)
		//a2���� fef�� �߷�����
		System.out.println(a2.substring(2,5))
		
		
		//charAt()
		System.out.println(a1.charAt(1));//n��° ���ڸ� �˰������ n-1�� ���ڷ� �־������.
		
		//compareTo(a1,a2)
		System.out.println(a1.compareTo(a2));//c-f = -3
		System.out.println(a2.compareTo(a1));//c-f = 3
		//concat(a1, a2) = +�� ����
		System.out.println(a2.concat(a1));//abfefabcd
		System.out.println(a1+a2);//abfefabcd
		
		//���ڿ��� ������ ���ϰ� �������� equals �޼ҵ� ���
		System.out.println(a2.equals(a1));
	}
}
