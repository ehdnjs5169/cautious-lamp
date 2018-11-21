class Light{
	int lightness;
	void LightOn(){
		System.out.println("불이 켜졌습니다.");
	}
	void LightOff(){
		System.out.println("불이 꺼졌습니다.");
	}
	int Control(int a){
		if (0<=a&&a<=10){
		System.out.print("전구의 밝기가"+a+"입니다.");
		lightness=a;
		return a;
		}
		else System.out.print("잘못 입력하셨습니다.");
		return lightness;
	}
}	