class Elevator{
	int floor;
	boolean isOpen;
	void open(){
		System.out.print("���� ���Ƚ��ϴ�.");
	isOpen=true;
	}
	void close(){
		System.out.print("���� �������ϴ�.");
	isOpen=false;
	}
	
	void move(int a){
		close();
		if (a>=-2&&a<=10){
			if (a==0) System.out.println("�κ�� �̵��մϴ�.");
				
			else if (a>0) System.out.println(a+"������ �̵��մϴ�.");
	
			else System.out.println("����"+-1*a+"�� ���� �̵��մϴ�.");
		floor=a;
		report();
		open();
		
		}
		
		
		else System.out.println("�߸� �Է��ϼ̽��ϴ�.");
	}
	
	void report(){
		if (floor==0) System.out.println("�κ��Դϴ�.");
				
			else if (floor>0) System.out.println(floor+"�� �Դϴ�.");
	
			else System.out.println("����"+-1*floor+"�� �Դϴ�.");
	}
}
