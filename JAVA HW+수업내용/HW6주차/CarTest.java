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
	System.out.printf("�� ����Ÿ��� %d m�Դϴ�",c.getMileage());
	}
}
class Car{
	private int mileage;
	public void goStraight(int a){
		System.out.println(a+"m��ŭ ����");
		mileage+=a;
	}
	public void turnLeft(){System.out.println("��ȸ��");}
	public void turnRight(){System.out.println("��ȸ��");}
	public int getMileage(){
		return mileage;
	}
}
	
	