class Weather{
	String weather;
	String Weather(){
		int r=(int)(Math.random()*6);
		if(2<r&&r<=5){
			weather="ȭâ";
			//�䳢.���(+5);
		}
		else if(1<=r&&r<=2){
			weather="������";
			//�䳢.���(-5);
		}
		else{
			weather="���";
		}
	return weather;
	}
	
	/*String WeatherActivity(int weatherAct){//��å�� 1, �Ʒ��� 4��� ������
	if((weatherAct==4)&&weather.equals("ȭâ")){
		double d = Math.random();
		if(d<0.05)
			return "�ϻ纴���� ���� ���";
		
	}
	else if((weatherAct==1||weatherAct==4)&&weather.equals("���")){
		return "Ȱ�� �Ұ�";
	}
	else
		return null;
	}*/
}


	
	
	
	
	
	
	
	
	
	
	
		
	