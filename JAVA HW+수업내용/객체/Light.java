class Light{
	int lightness;
	void LightOn(){
		System.out.println("���� �������ϴ�.");
	}
	void LightOff(){
		System.out.println("���� �������ϴ�.");
	}
	int Control(int a){
		if (0<=a&&a<=10){
		System.out.print("������ ��Ⱑ"+a+"�Դϴ�.");
		lightness=a;
		return a;
		}
		else System.out.print("�߸� �Է��ϼ̽��ϴ�.");
		return lightness;
	}
}	