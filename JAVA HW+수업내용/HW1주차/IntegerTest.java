class IntegerTest{
	public static void main(String [] args){
		
		char c = '��';//���ڸ� �����Ҷ��� ��������ǥ ���(�� ���ڸ� ��밡��)
		//char c2 = 'ac';//�Ұ��� ���ڰ� 2��
	    char c1 = '\uac00';//����: \u�ڿ� ���°� �����ڵ�(2����Ʈ=16��Ʈ=����ڵ�(16����)�� 4�ڸ�(bit),ac00(4�ڸ�)�� 1�ڸ���� �� )
		String s1 = "���б�";//ū����ǥ������� String�� �����(���ڰ��� ���� ����)
		System.out.println("c= "+c);
		//System.out.println("c2= "+c2);
		System.out.println("c1= "+c1);
		System.out.println("s1= "+s1);
		
		System.out.print("�̸�: ");// �� �б� ��� �Է½�
		//name = s.next(); // �� �� ��� ������������
		name = s.nextLine(); // �� �б� �� ��� ������ ���
		
		
		boolean b1 = true, b2 = false, b3 = 1>3;//b3 = false�� �ǹ�
		System.out.println("b3: "+b3);// false�� ��µ�
		
		int a = 15;
		int a1 = 015;//8������ ǥ��, 8������ ǥ���� ���λ�� 0�� �ٿ�����
		int a2 = 0x15;//16������ ǥ��, 16������ ǥ���� ���λ�� 0x�� �ٿ�����
		int a3 = 0b11;//2������ ǥ��, 2������ ǥ���� ���λ�� 0b�� �ٿ�����
		
		System.out.format("%d, %d, %d\n", a, a1, a2);//10���� 15, 8���� 15, 16���� 15�� 10������ ��ȯ�Ͽ� ���
		
		System.out.format("%d, %o, %x\n", a, a1, a2);// �� ������ ���� �� ������ ������ ǥ���ϴ°�
		
		System.out.format("%d, %#o, %#x\n", a, a1, a2);//�� ������ ���λ縦 ǥ���Ͽ� ����Ҷ�
		
		System.out.format("%10d, %#10o, %#10x\n", a, a1, a2);//������ ���߰� ������ (���ۿ� ġ�� ������ % # ������ ���� format specifier wiki)
		
		//System.out.format("%10d, %10d, %10d\n", a); �ϳ��� ���� �̰� ������ %�� 3���϶� ,�ڿ��ִ� ���ڵ� 3�������Ѵ�-Ʋ����
		
		System.out.format("%1$10d, %1$10d, %1$10d\n", a);//�ϳ��� ���� �̰� ������ ,�ڿ� a�� ��� �ǰ� a1, a2���� �����
		
		System.out.format("%2$10d, %2$10d, %2$10d\n", a, a1, a2);// a1�� ���� �̰� ������
		
		System.out.format("%10d", a3);
	}
}