class D0511{
	public static void main(String []args){//���⼭�� �迭�̴�. StringŸ�� �迭. args��� �迭�̸�����.
		//�л� ���� 10��(int) ������ �迭 (�ڹٿ����� �迭�� ��ü�� ����)
		int [] scores = new int[10];//�迭�� ���� ���ȣ�� �߰���. scores�� ���� �迭�� ���� ����.
		//10���� �л��� ������ �ݺ����� ����ؼ� �ʱ�ȭ.
		
		
		
		scores[0] = 100;
		scores[1] = 90;
		//...
		scores[9] = 100;
		
		//�迭��.length
		//���ڿ�.length()
		System.out.println("scores �迭�� ���� ����:"+scores.length);
		
		//double �� Ÿ�� ���� 50�� �����ϴ� �迭 ����
		double [] dArr = new double [50];
		//dArr�� ��� ���� ���: for-each�� ���
		for(double i:dArr){
		System.out.println(i);
		}
		//1���� 10��. 2���� 20��....10���� 100������ �ʱ�ȭ
		for(int i=0;i<10;i++){
			scores[i] = 10*(i+1);
		}
		//10���� �л� ������ ���
		for(int i=0;i<10;i++){//������ for��
			System.out.println(scores[i]);
		}
			/*
			for-each�� ����ϱ�
			for(�迭�� �ڷ��� ������:�迭��){
				�ݺ��ؾ��� �ϵ� �ۼ�
			}
			����: �迭�� ���̸� ���� ��.
			����ġ���� �б� �����θ� �����ִ�. ������ ������ scores[i]�Ͱ��� �迭�� ���������� �����Ѵ�.
			*/
		for(int s:scores){//scores: 10 20 30 40 ... 100
			System.out.println("����ġ��"+s);
		}	
		}
	}

//�迭�� �����Ҷ� �߰�ȣ�� ���ؼ� �迭 ���� �� �� �ִ�. ���߿� �迭���� �ָ� ����
//int [] scores {1,2,3...}-> new int []���������� �ڹٰ� �˾Ƽ� �˾Ƶ���