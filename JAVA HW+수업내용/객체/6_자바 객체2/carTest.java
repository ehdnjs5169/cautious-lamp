class car{
	private int mileage;
	private String color;
	
	public car(String c, int m){//������: �ν��Ͻ��� �����Ҷ� �ʵ带 �ʱ�ȭ �ϴ� ������ ��. 
		color = c;
		if(m>0&&m<100000)mileage = m;
		else mileage = 0;
	//setColor, setMileage�� �ڵ��� ��ü�� ������� ���Ŀ� �ʵ� �Ӽ��� ������ �ʿ䰡 ���� �� ���. 
	}
	
	void goStraight(int a){
		System.out.println(a+"m �����մϴ�.");
		mileage +=a;
	}
	void turnLeft(){
		System.out.println("��ȸ��");
	}
	void turnRight(){
		System.out.println("��ȸ��");
	}
	public int getMileage(){
		return mileage;
	}
}
class carTest{
public static void main (String [] args){
	car c = new car("blue", 5);//�����ڰ� Car(String c, int m)�̹Ƿ� ("blue", 5)�� ��������Ѵ�. �߰��� �ʱ�ȭ �Ϸ��� setter����ؾ���.
	c.goStraight(10);
	c.turnRight();
	c.goStraight(9);
	System.out.print(c.getMileage());
	}
}
	