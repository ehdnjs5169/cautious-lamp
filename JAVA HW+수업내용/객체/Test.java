class Test{
	public static void main(String[]args){
		System.out.println(args[0]);//������ �Ű����� ���
		System.out.println(args[1]);
		//���ڿ� 5�� ���� 5�� �ٲٰ� ����
		//����(wrapper)Ŭ���� ���
		//������ �����ϰ� IntegerŬ���� ��� Integer.parseInt
		int a = Integer.parseInt("17");
		System.out.println(Integer.parseInt(args[0])+Integer.parseInt(args[1]));
		System.out.println(Double.parseDouble(args[2])+Double.parseDouble(args[3]));
		System.out.println(sumAB(10,20));
			
		
	}
		static int sumAB(int a, int b){//a~b������ �� ���ϴ� �޼ҵ�
			int sum=0;
			for(int i=a; i<=b; i++) sum+=i;
			//���� print => ��ȯŸ��: void
			//���� �ڽ��� ȣ���� ������ ��ȯ => ��ȯŸ��: sum�� Ÿ��(int)
			return sum; //�� �޼ҵ��� ����� sum�̴�.
		}
}