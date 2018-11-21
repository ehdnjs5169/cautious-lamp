class CarTest{
	public static void main(String [] args){
	Car c=new Car();
	System.out.println(c.getMileage());
	c.goStraight(25);
	c.turnLeft();
	c.goStraight(30);
	c.turnRight();
	c.goStraight(15);
	c.turnLeft();
	c.goStraight(20);
	System.out.printf("총 주행거리는 %d m입니다",c.getMileage());
	}
}
class Car{
	private int mileage;
	public void goStraight(int a){
		System.out.println(a+"m만큼 직진");
		mileage+=a;
	}
	public void turnLeft(){System.out.println("좌회전");}
	public void turnRight(){System.out.println("우회전");}
	public int getMileage(){
		return mileage;
	}
}
	
	