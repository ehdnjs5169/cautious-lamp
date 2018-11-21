class bokCar{
	int year;
	int mileage;
	static int numOfCars;
	
	public bokCar(){
		numOfCars++;
	}
	public bokCar(int year){
		this();
		this.year=year;
		
	}
	public bokCar(int year, int mileage){
		this(year);
		this.mileage=mileage;
		numOfCars++;
	}
}
class bCar{ 
	public static void main(String [] args){
	bokCar [] carList = new bokCar [10];
	for(int i=0; i<10; i++){
		carList[i]= new bokCar(2010+i);
	}
	System.out.print("총 자동차 대수:"+bokCar.numOfCars);
	}
}