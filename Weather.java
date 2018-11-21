class Weather{
	String weather;
	String Weather(){
		int r=(int)(Math.random()*6);
		if(2<r&&r<=5){
			weather="화창";
			//토끼.기분(+5);
		}
		else if(1<=r&&r<=2){
			weather="우중충";
			//토끼.기분(-5);
		}
		else{
			weather="비옴";
		}
	return weather;
	}
	
	/*String WeatherActivity(int weatherAct){//산책을 1, 훈련이 4라고 했을때
	if((weatherAct==4)&&weather.equals("화창")){
		double d = Math.random();
		if(d<0.05)
			return "일사병으로 인해 사망";
		
	}
	else if((weatherAct==1||weatherAct==4)&&weather.equals("비옴")){
		return "활동 불가";
	}
	else
		return null;
	}*/
}


	
	
	
	
	
	
	
	
	
	
	
		
	