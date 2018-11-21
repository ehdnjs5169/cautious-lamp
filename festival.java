
public class festival{
	private static int win = 0;
	


public static String gang8name (){
	int r = (int)(3*Math.random());
	String s;
	if (r==0){
	s = "옆집의 토깽이";
	}	
	else if(r == 1){

	s = "앞집의 콩콩이";
	}	
	else {
	s = "뒷집의 윙윙이";
	}	

	
	return s;
}

public static String gang4name (){
	int r = (int)(3*Math.random());
	String s;
	if (r==0){
	s = "옆마을의 토실이";
	}	
	else if(r == 1){

	s = "앞마을의 토순이";
	}	
	else {
	s = "뒷마을의 데빗";
	}
	
	
	return s;
}
static String gang2name (){
	int r = (int)(3*Math.random());
	String s;
	if (r==0){
	s = "서울의 로빗";
	}	
	else if(r == 1){

	s = "대구의 푸름이";
	}	
	else {
	s = "제주도의 하늘이";
	}	
	
	return s;
}
static void gang8(int a, int b, int c){
	int a1 = (int)(31*Math.random());
	int b1 = (int)(31*Math.random());
	int c1 = (int)(31*Math.random());
	String s1 = gang8name();
	
	
	System.out.print("8강전을 시작하겠습니다!\n");
	try{Thread.sleep(1000);}catch(InterruptedException e){}
	System.out.printf("이번에 출전한 토끼는 %s입니다!\n", s1);
	try{Thread.sleep(1000);}catch(InterruptedException e){}
		int r = (int)(3*Math.random());
		switch(r){
		case 0:
		
		System.out.print("이번의 경쟁은 먹이를 보고 오래 참은 쪽이 이기는 걸로 하겠습니다!\n");
		
		try{Thread.sleep(3000);}catch(InterruptedException e){}
		if(a > a1){System.out.printf("%d : %d  '나'가 이겼습니다!!!! \n", a, a1);
		win += 1;}//주인공의 토끼 이름이 정해지면
		else if (a == a1){System.out.print("심사위원들의 결정으로 '나'가 판정승으로 이겼습니다.\n");
		win += 1;}//주인공의 토끼 이름이 정해지면
		else{System.out.printf("%d : %d  %s가 이겼습니다.\n", a, a1, s1);
		win += 0;}
		break;
		case 1:
		
		System.out.print("이번의 경쟁은 얼마나 기분이 좋은지로 결정하겠습니다!\n");
		
		try{Thread.sleep(3000);}catch(InterruptedException e){}
		
		if(b > b1){System.out.printf("%d : %d  '나'가 이겼습니다!!!! \n", b, b1);
		win += 1;}//주인공의 토끼 이름이 정해지면
		else if (a == a1){System.out.print("심사위원들의 결정으로 '나'가 판정승으로 이겼습니다.\n");
		win += 1;}//주인공의 토끼 이름이 정해지면
		else{System.out.printf("%d : %d  %s가 이겼습니다.\n", b, b1, s1);
		win += 0;}
		break;
		case 2:
		
		System.out.print("이번의 경쟁은 얼마나 건강한 지로 결정하겠습니다!\n");
		
		try{Thread.sleep(3000);}catch(InterruptedException e){}
		
		if(c > c1){System.out.printf("%d : %d  '나'가 이겼습니다!!!! \n", c, c1);
		win += 1;}//주인공의 토끼 이름이 정해지면
		else if (a == a1){System.out.print("심사위원들의 결정으로 '나'가 판정승으로 이겼습니다.\n");
		win += 1;}//주인공의 토끼 이름이 정해지면
		else{System.out.printf("%d : %d  %s가 이겼습니다.\n", c, c1, s1);
		win += 0;}
		break;
		default:
		break;
	
	}
}
static void gang4(int a, int b, int c){
	int a1 = (int)(41*Math.random());
	int b1 = (int)(41*Math.random());
	int c1 = (int)(41*Math.random());
	String s1 = gang4name();
	
	System.out.print("4강전을 시작하겠습니다!\n");
	try{Thread.sleep(1000);}catch(InterruptedException e){}
	System.out.printf("이번에 출전한 토끼는 %s입니다!\n", s1);
	try{Thread.sleep(1000);}catch(InterruptedException e){}
		int r = (int)(3*Math.random());
		switch(r){
		case 0:
		
		System.out.print("이번의 경쟁은 먹이를 보고 오래 참은 쪽이 이기는 걸로 하겠습니다!\n");
		try{Thread.sleep(3000);}catch(InterruptedException e){}
		if(a > a1){System.out.printf("%d : %d  '나'가 이겼습니다!!!! \n", a, a1);
		win += 1;}//주인공의 토끼 이름이 정해지면
		else if (a == a1){System.out.print("심사위원들의 결정으로 '나'가 판정승으로 이겼습니다.\n");
		win += 1;}//주인공의 토끼 이름이 정해지면
		else{System.out.printf("%d : %d  %s가 이겼습니다.\n", a, a1, s1);
		win += 0;}
		break;
		case 1:
		
		System.out.print("이번의 경쟁은 얼마나 기분이 좋은지로 결정하겠습니다!\n");
		
		try{Thread.sleep(3000);}catch(InterruptedException e){}
		
		if(b > b1){System.out.printf("%d : %d  '나'가 이겼습니다!!!! \n", a, a1);
		win += 1;}//주인공의 토끼 이름이 정해지면
		else if (a == a1){System.out.print("심사위원들의 결정으로 '나'가 판정승으로 이겼습니다.\n");
		win += 1;}//주인공의 토끼 이름이 정해지면
		else{System.out.printf("%d : %d  %s가 이겼습니다.\n", a, a1, s1);
		win += 0;}
		break;
		case 2:
		
		System.out.print("이번의 경쟁은 얼마나 건강한 지로 결정하겠습니다!\n");
		
		try{Thread.sleep(3000);}catch(InterruptedException e){}
		
		if(c > c1){System.out.printf("%d : %d  '나'가 이겼습니다!!!! \n", a, a1);
		win += 1;}//주인공의 토끼 이름이 정해지면
		else if (a == a1){System.out.print("심사위원들의 결정으로 '나'가 판정승으로 이겼습니다.\n");
		win += 1;}//주인공의 토끼 이름이 정해지면
		else{System.out.printf("%d : %d  %s가 이겼습니다.\n", a, a1, s1);
		win += 0;}
		break;
		default:
		break;
	
	}
}
static void gang2(int a, int b, int c){
	int a1 = (int)(51*Math.random());
	int b1 = (int)(51*Math.random());
	int c1 = (int)(51*Math.random());
	String s1 = gang2name();
	
	System.out.print("결승전을 시작하겠습니다!\n");
	try{Thread.sleep(1000);}catch(InterruptedException e){}
	System.out.printf("이번에 출전한 토끼는 %s입니다!\n", s1);
	try{Thread.sleep(1000);}catch(InterruptedException e){}
	int r = (int)(3*Math.random());
		switch(r){
		case 0:
		
		System.out.print("이번의 경쟁은 먹이를 보고 오래 참은 쪽이 이기는 걸로 하겠습니다!\n");
		
		try{Thread.sleep(3000);}catch(InterruptedException e){}
		
		if(a > a1){System.out.printf("%d : %d  '나'가 이겼습니다!!!! \n", a, a1);
		win += 1;}//주인공의 토끼 이름이 정해지면
		else if (a == a1){System.out.print("심사위원들의 결정으로 '나'가 판정승으로 이겼습니다.\n");
		win += 1;}//주인공의 토끼 이름이 정해지면
		else{System.out.printf("%d : %d  %s가 이겼습니다.\n", a, a1, s1);
		win += 0;}
		break;
		case 1:
		
		System.out.print("이번의 경쟁은 얼마나 기분이 좋은지로 결정하겠습니다!\n");
		
		try{Thread.sleep(3000);}catch(InterruptedException e){}
		
		if(b > b1){System.out.printf("%d : %d  '나'가 이겼습니다!!!! \n", b, b1);
		win += 1;}//주인공의 토끼 이름이 정해지면
		else if (b == b1){System.out.print("심사위원들의 결정으로 '나'가 판정승으로 이겼습니다.\n");
		win += 1;}//주인공의 토끼 이름이 정해지면
		else{System.out.printf("%d : %d  %s가 이겼습니다.\n", b, b1, s1);
		win += 0;}
		break;
		case 2:
		
		System.out.print("이번의 경쟁은 얼마나 건강한 지로 결정하겠습니다!\n");
		
		try{Thread.sleep(3000);}catch(InterruptedException e){}
		
		if(c > c1){System.out.printf("%d : %d  '나'가 이겼습니다!!!! \n", c, c1);
		win += 1;}//주인공의 토끼 이름이 정해지면
		else if (c == c1){System.out.print("심사위원들의 결정으로 '나'가 판정승으로 이겼습니다.\n");
		win += 1;}//주인공의 토끼 이름이 정해지면
		else{System.out.printf("%d : %d  %s가 이겼습니다.\n", c, c1, s1);
		win += 0;}
		break;
		default:
		break;
	
	}
}

static void progress(int a, int b, int c){
	gang8(a, b, c);
	
	if(win == 1){
		gang4(a, b, c);
	}
	if(win == 2){
		gang2(a, b, c);
	}
	if(win == 0){
		System.out.println("8강에서 패배하셨습니다.");
	}
	if(win == 1){
		System.out.println("4강에서 패배하셨습니다.");
	}
	if(win == 2){
		System.out.println("결승전에서 패배하셨습니다.");
	}
	if(win == 3){
		System.out.println("우승하셨습니다!");
	}
}

static int reward(int a){
	if(win == 3){
	a = a+15;
	}
	return a;
}



}
