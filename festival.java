
public class festival{
	private static int win = 0;
	


public static String gang8name (){
	int r = (int)(3*Math.random());
	String s;
	if (r==0){
	s = "������ �䲤��";
	}	
	else if(r == 1){

	s = "������ ������";
	}	
	else {
	s = "������ ������";
	}	

	
	return s;
}

public static String gang4name (){
	int r = (int)(3*Math.random());
	String s;
	if (r==0){
	s = "�������� �����";
	}	
	else if(r == 1){

	s = "�ո����� �����";
	}	
	else {
	s = "�޸����� ����";
	}
	
	
	return s;
}
static String gang2name (){
	int r = (int)(3*Math.random());
	String s;
	if (r==0){
	s = "������ �κ�";
	}	
	else if(r == 1){

	s = "�뱸�� Ǫ����";
	}	
	else {
	s = "���ֵ��� �ϴ���";
	}	
	
	return s;
}
static void gang8(int a, int b, int c){
	int a1 = (int)(31*Math.random());
	int b1 = (int)(31*Math.random());
	int c1 = (int)(31*Math.random());
	String s1 = gang8name();
	
	
	System.out.print("8������ �����ϰڽ��ϴ�!\n");
	try{Thread.sleep(1000);}catch(InterruptedException e){}
	System.out.printf("�̹��� ������ �䳢�� %s�Դϴ�!\n", s1);
	try{Thread.sleep(1000);}catch(InterruptedException e){}
		int r = (int)(3*Math.random());
		switch(r){
		case 0:
		
		System.out.print("�̹��� ������ ���̸� ���� ���� ���� ���� �̱�� �ɷ� �ϰڽ��ϴ�!\n");
		
		try{Thread.sleep(3000);}catch(InterruptedException e){}
		if(a > a1){System.out.printf("%d : %d  '��'�� �̰���ϴ�!!!! \n", a, a1);
		win += 1;}//���ΰ��� �䳢 �̸��� ��������
		else if (a == a1){System.out.print("�ɻ��������� �������� '��'�� ���������� �̰���ϴ�.\n");
		win += 1;}//���ΰ��� �䳢 �̸��� ��������
		else{System.out.printf("%d : %d  %s�� �̰���ϴ�.\n", a, a1, s1);
		win += 0;}
		break;
		case 1:
		
		System.out.print("�̹��� ������ �󸶳� ����� �������� �����ϰڽ��ϴ�!\n");
		
		try{Thread.sleep(3000);}catch(InterruptedException e){}
		
		if(b > b1){System.out.printf("%d : %d  '��'�� �̰���ϴ�!!!! \n", b, b1);
		win += 1;}//���ΰ��� �䳢 �̸��� ��������
		else if (a == a1){System.out.print("�ɻ��������� �������� '��'�� ���������� �̰���ϴ�.\n");
		win += 1;}//���ΰ��� �䳢 �̸��� ��������
		else{System.out.printf("%d : %d  %s�� �̰���ϴ�.\n", b, b1, s1);
		win += 0;}
		break;
		case 2:
		
		System.out.print("�̹��� ������ �󸶳� �ǰ��� ���� �����ϰڽ��ϴ�!\n");
		
		try{Thread.sleep(3000);}catch(InterruptedException e){}
		
		if(c > c1){System.out.printf("%d : %d  '��'�� �̰���ϴ�!!!! \n", c, c1);
		win += 1;}//���ΰ��� �䳢 �̸��� ��������
		else if (a == a1){System.out.print("�ɻ��������� �������� '��'�� ���������� �̰���ϴ�.\n");
		win += 1;}//���ΰ��� �䳢 �̸��� ��������
		else{System.out.printf("%d : %d  %s�� �̰���ϴ�.\n", c, c1, s1);
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
	
	System.out.print("4������ �����ϰڽ��ϴ�!\n");
	try{Thread.sleep(1000);}catch(InterruptedException e){}
	System.out.printf("�̹��� ������ �䳢�� %s�Դϴ�!\n", s1);
	try{Thread.sleep(1000);}catch(InterruptedException e){}
		int r = (int)(3*Math.random());
		switch(r){
		case 0:
		
		System.out.print("�̹��� ������ ���̸� ���� ���� ���� ���� �̱�� �ɷ� �ϰڽ��ϴ�!\n");
		try{Thread.sleep(3000);}catch(InterruptedException e){}
		if(a > a1){System.out.printf("%d : %d  '��'�� �̰���ϴ�!!!! \n", a, a1);
		win += 1;}//���ΰ��� �䳢 �̸��� ��������
		else if (a == a1){System.out.print("�ɻ��������� �������� '��'�� ���������� �̰���ϴ�.\n");
		win += 1;}//���ΰ��� �䳢 �̸��� ��������
		else{System.out.printf("%d : %d  %s�� �̰���ϴ�.\n", a, a1, s1);
		win += 0;}
		break;
		case 1:
		
		System.out.print("�̹��� ������ �󸶳� ����� �������� �����ϰڽ��ϴ�!\n");
		
		try{Thread.sleep(3000);}catch(InterruptedException e){}
		
		if(b > b1){System.out.printf("%d : %d  '��'�� �̰���ϴ�!!!! \n", a, a1);
		win += 1;}//���ΰ��� �䳢 �̸��� ��������
		else if (a == a1){System.out.print("�ɻ��������� �������� '��'�� ���������� �̰���ϴ�.\n");
		win += 1;}//���ΰ��� �䳢 �̸��� ��������
		else{System.out.printf("%d : %d  %s�� �̰���ϴ�.\n", a, a1, s1);
		win += 0;}
		break;
		case 2:
		
		System.out.print("�̹��� ������ �󸶳� �ǰ��� ���� �����ϰڽ��ϴ�!\n");
		
		try{Thread.sleep(3000);}catch(InterruptedException e){}
		
		if(c > c1){System.out.printf("%d : %d  '��'�� �̰���ϴ�!!!! \n", a, a1);
		win += 1;}//���ΰ��� �䳢 �̸��� ��������
		else if (a == a1){System.out.print("�ɻ��������� �������� '��'�� ���������� �̰���ϴ�.\n");
		win += 1;}//���ΰ��� �䳢 �̸��� ��������
		else{System.out.printf("%d : %d  %s�� �̰���ϴ�.\n", a, a1, s1);
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
	
	System.out.print("������� �����ϰڽ��ϴ�!\n");
	try{Thread.sleep(1000);}catch(InterruptedException e){}
	System.out.printf("�̹��� ������ �䳢�� %s�Դϴ�!\n", s1);
	try{Thread.sleep(1000);}catch(InterruptedException e){}
	int r = (int)(3*Math.random());
		switch(r){
		case 0:
		
		System.out.print("�̹��� ������ ���̸� ���� ���� ���� ���� �̱�� �ɷ� �ϰڽ��ϴ�!\n");
		
		try{Thread.sleep(3000);}catch(InterruptedException e){}
		
		if(a > a1){System.out.printf("%d : %d  '��'�� �̰���ϴ�!!!! \n", a, a1);
		win += 1;}//���ΰ��� �䳢 �̸��� ��������
		else if (a == a1){System.out.print("�ɻ��������� �������� '��'�� ���������� �̰���ϴ�.\n");
		win += 1;}//���ΰ��� �䳢 �̸��� ��������
		else{System.out.printf("%d : %d  %s�� �̰���ϴ�.\n", a, a1, s1);
		win += 0;}
		break;
		case 1:
		
		System.out.print("�̹��� ������ �󸶳� ����� �������� �����ϰڽ��ϴ�!\n");
		
		try{Thread.sleep(3000);}catch(InterruptedException e){}
		
		if(b > b1){System.out.printf("%d : %d  '��'�� �̰���ϴ�!!!! \n", b, b1);
		win += 1;}//���ΰ��� �䳢 �̸��� ��������
		else if (b == b1){System.out.print("�ɻ��������� �������� '��'�� ���������� �̰���ϴ�.\n");
		win += 1;}//���ΰ��� �䳢 �̸��� ��������
		else{System.out.printf("%d : %d  %s�� �̰���ϴ�.\n", b, b1, s1);
		win += 0;}
		break;
		case 2:
		
		System.out.print("�̹��� ������ �󸶳� �ǰ��� ���� �����ϰڽ��ϴ�!\n");
		
		try{Thread.sleep(3000);}catch(InterruptedException e){}
		
		if(c > c1){System.out.printf("%d : %d  '��'�� �̰���ϴ�!!!! \n", c, c1);
		win += 1;}//���ΰ��� �䳢 �̸��� ��������
		else if (c == c1){System.out.print("�ɻ��������� �������� '��'�� ���������� �̰���ϴ�.\n");
		win += 1;}//���ΰ��� �䳢 �̸��� ��������
		else{System.out.printf("%d : %d  %s�� �̰���ϴ�.\n", c, c1, s1);
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
		System.out.println("8������ �й��ϼ̽��ϴ�.");
	}
	if(win == 1){
		System.out.println("4������ �й��ϼ̽��ϴ�.");
	}
	if(win == 2){
		System.out.println("��������� �й��ϼ̽��ϴ�.");
	}
	if(win == 3){
		System.out.println("����ϼ̽��ϴ�!");
	}
}

static int reward(int a){
	if(win == 3){
	a = a+15;
	}
	return a;
}



}
