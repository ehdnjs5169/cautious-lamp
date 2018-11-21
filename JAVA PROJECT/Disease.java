class Disease{
	int Disease(int n){
		if(0<n&&n<=30){
			System.out.println("질병에 걸렸습니다.");
			setFeeling(-6);//하루지나면 -4인데 이날에는 -10까지 떨어져야 하므로 추가적으로 -6을 함 건강도 마찬가지.
			setHealth(-8);
		}
		else if(30<n&&n<=100){
			System.out.println("토끼는 오늘도 건강합니다.");
		}
		else{
			System.out.println("병에 걸려 죽었습니다.");
		}
		return n;
	}
}