class car{
	private int mileage;
	private String color;
	
	public car(String c, int m){//생성자: 인스턴스를 생성할때 필드를 초기화 하는 역할을 함. 
		color = c;
		if(m>0&&m<100000)mileage = m;
		else mileage = 0;
	//setColor, setMileage는 자동차 객체가 만들어진 이후에 필드 속성을 변경할 필요가 있을 때 사용. 
	}
	
	void goStraight(int a){
		System.out.println(a+"m 직진합니다.");
		mileage +=a;
	}
	void turnLeft(){
		System.out.println("좌회전");
	}
	void turnRight(){
		System.out.println("우회전");
	}
	public int getMileage(){
		return mileage;
	}
}
class carTest{
public static void main (String [] args){
	car c = new car("blue", 5);//생성자가 Car(String c, int m)이므로 ("blue", 5)를 붙혀줘야한다. 중간에 초기화 하려면 setter사용해야함.
	c.goStraight(10);
	c.turnRight();
	c.goStraight(9);
	System.out.print(c.getMileage());
	}
}
	