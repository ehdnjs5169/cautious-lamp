class Disease{
	int Disease(int n){
		if(0<n&&n<=30){
			System.out.println("������ �ɷȽ��ϴ�.");
			setFeeling(-6);//�Ϸ������� -4�ε� �̳����� -10���� �������� �ϹǷ� �߰������� -6�� �� �ǰ��� ��������.
			setHealth(-8);
		}
		else if(30<n&&n<=100){
			System.out.println("�䳢�� ���õ� �ǰ��մϴ�.");
		}
		else{
			System.out.println("���� �ɷ� �׾����ϴ�.");
		}
		return n;
	}
}