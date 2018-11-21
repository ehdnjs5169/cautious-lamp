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
//자동차 10대
//2010, 2011, 2012,..., 2019

class D0515{
	public static void main (String [] args){
		/*Car c1 = new Car(2010);
		Car c2 = new Car(2011);
		//...
		Car c10 = new Car(2019);*/
		//자동차 10대를 배열로 관리
		Car [] carList = new Car[10];//배열로 car이 저장될수있는 공간 10개 생성 주소값이 배열을 이룬다. 실제 Car이 생긴건 아님.
			//carList[0] = new Car(2010);
			//carList[2] = new Car(2012);
			for(int i=0; i< carList.length;i++){
				carList[i]= new Car(2010+i);	
			}
			System.out.println("총 자동차의 개수: "+Car.numOfCars);
			//클래스명.멤버!! 참조변수.멤버가 아님
	}
}	