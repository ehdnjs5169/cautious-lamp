class CalTest{
	public static void main (String args[]){
		Calculator c = new Calculator(); //������ pi���
		System.out.println(c.pi);//pi�� c�� �ִ�.
		System.out.printf("%f\n",c.pi);
		
		//add�޼ҵ� ȣ��
		c.add(5.3, 2);
		
		//mul�޼ҵ� ȣ��
		System.out.println("�μ��� ��" +c.mul(2,4));
		
		System.out.println("���̴�: "+c.area(4));
}
}