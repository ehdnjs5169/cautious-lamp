class Calculator{
	//�ʵ�
	int a, b;
	double pi=3.14;
	
	//add �޼ҵ� : ��ȯŸ��+�޼ҵ��(�Ű�������)
	void add(double d1, double d2){//��¸� �ϸ� ���̱� ������ ��ȯŸ���� void
		System.out.println("�μ��� ����? "+(d1+d2));
	
	}
	
	//mul�޼ҵ�: �μ��� ���� ��ȯ�Ѵ� �޼ҵ�
	double mul(double d1, double d2){
		return d1*d2; //d1*d2�̰Ÿ� �ٽ� ��ȯ�ϱ� ������ ��ȯŸ���� double. return�� �������ٴ� �� 
		}
		
	//area�޼ҵ�: �������� �޾� ���̸� ��ȯ
	double area(double radius){
		return pi*radius*radius;
	}
	
}
