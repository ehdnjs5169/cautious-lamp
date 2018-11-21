class Car{
	int year;
	int mileage;
	static int numOfCars;
	
	public Car(){
		numOfCars++;
	}
	public Car(int year){
		this();
		this.year = year;
		
	}
	
	public Car(int year, int mileage){
		
		this(year);
		this.mileage = mileage;
		numOfCars++;
		
	}
}
//�ڵ��� 10��
//2010, 2011, 2012,..., 2019

class D0515{
	public static void main (String [] args){
		/*Car c1 = new Car(2010);
		Car c2 = new Car(2011);
		//...
		Car c10 = new Car(2019);*/
		//�ڵ��� 10�븦 �迭�� ����
		Car [] carList = new Car[10];//�迭�� car�� ����ɼ��ִ� ���� 10�� ���� �ּҰ��� �迭�� �̷��. ���� Car�� ����� �ƴ�.
			//carList[0] = new Car(2010);
			//carList[2] = new Car(2012);
			for(int i=0; i< carList.length;i++){
				carList[i]= new Car(2010+i);	
			}
			System.out.println("�� �ڵ����� ����: "+Car.numOfCars);
			//Ŭ������.���!! ��������.����� �ƴ�
	}
}	