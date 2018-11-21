class Elevator{
	int floor;
	boolean isOpen;
	void open(){
		System.out.print("문이 열렸습니다.");
	isOpen=true;
	}
	void close(){
		System.out.print("문이 닫혔습니다.");
	isOpen=false;
	}
	
	void move(int a){
		close();
		if (a>=-2&&a<=10){
			if (a==0) System.out.println("로비로 이동합니다.");
				
			else if (a>0) System.out.println(a+"층으로 이동합니다.");
	
			else System.out.println("지하"+-1*a+"층 으로 이동합니다.");
		floor=a;
		report();
		open();
		
		}
		
		
		else System.out.println("잘못 입력하셨습니다.");
	}
	
	void report(){
		if (floor==0) System.out.println("로비입니다.");
				
			else if (floor>0) System.out.println(floor+"층 입니다.");
	
			else System.out.println("지하"+-1*floor+"층 입니다.");
	}
}
