import java.io.IOException;
import java.util.Scanner;

class �䳢{
	//private static Cfunction c = new Cfunction();
	private	int F;
	private int M;
	private int H;
	private int L;
	static int time;
	static int day;
	private boolean D;
	
	Scanner s=new Scanner(System.in);
	Weather W= new Weather();
	
	public �䳢(){
		F=50;
		M=50;
		H=50;
		L=50;
		time=0;
		day=0;
		
		D=false;
	}
	
	void �������(){
		System.out.println(String.format("          ������ : %3d                   ���  :%3d\n",F,M));
		System.out.println("              ");
		System.out.println(String.format("          �ǰ�   : %3d                   ����  :%b\n",H,D));
	}
	void Time(){
		if(time%3==0){
			time=0;
			day++;
			System.out.println(day+"��° ���� ��Ҵ�.");
			System.out.println("���� ������ "+W.Weather());
		}
		switch(time%3){
			case 0: System.out.println("��ħ�̴�. ������ �ұ�?");break;
			case 1: System.out.println("�����̴�. ������ �ұ�?");break;
			case 2: System.out.println("�����̴�. ������ �ұ�?");break;
			default: break;
		}
		time++;
		
	}
	int ���(){
		Time();
		System.out.println("1.��å�ϱ�   2.�����ֱ�   3.����ֱ�   4.�Ʒ��ϱ�");
		//c.gotoxy(10,29);
		int order=s.nextInt();
		return order;
	}
	
	void ����(int order)throws IOException, InterruptedException{
		switch(order){
			case 1:
				System.out.println("�䳢�� ��å�� �ߴ�... ");
				System.out.println("                                              ");
				������(-5);���(2);�ǰ�(2);����(1);
				System.out.println(HighState()+LowState());
				break;
			case 2:
				System.out.println("�䳢���� ���̸� ���...");
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		System.out.println("��������������������������������������������\n��                                        ��\n��      ~�䳢 Ű���~                     ��\n��                                        ��\n��                                        ��\n��                                        ��\n������ ����             1. ���� ��ŸƮ    ��\n����o w o��             2. ���� ����      ��\n����)   (��             3. ���� ����      ��\n��                                        ��\n��                                        ��\n��������������������������������������������\n");
		try{Thread.sleep(500);}catch(Exception e){e.printStackTrace();}
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		System.out.println("��������������������������������������������\n��                                        ��\n��                                        ��\n��                                        ��\n��                                        ��\n��                                        ��\n������ ����                               ��\n����o w o��                               ��\n����)   (��                               ��\n��                                        ��\n��                                        ��\n��������������������������������������������\n");
		try{Thread.sleep(500);}catch(Exception e){e.printStackTrace();}
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		System.out.println("��������������������������������������������\n��                                        ��\n��                                        ��\n��                                        ��\n��                                        ��\n��                                        ��\n������ ����                               ��\n���� o wo��                               ��\n����)   (��      *    *    *    *         ��\n��                                        ��\n��                                        ��\n��������������������������������������������\n");
		try{Thread.sleep(300);}catch(Exception e){e.printStackTrace();}
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		System.out.println("��������������������������������������������\n��                                        ��\n��                                        ��\n��                                        ��\n��                                        ��\n��                                        ��\n��      ���� ����                         ��\n��      �� o _o��                         ��\n��      �� ) *(��     *    *    *         ��\n��                                        ��\n��                                        ��\n��������������������������������������������\n");
		try{Thread.sleep(300);}catch(Exception e){e.printStackTrace();}
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		System.out.println("��������������������������������������������\n��                                        ��\n��                                        ��\n��                                        ��\n��                                        ��\n��                                        ��\n��      ���� ����                         ��\n��      �� - O-��                         ��\n��      �� ) *(��     *    *    *         ��\n��                                        ��\n��                                        ��\n��������������������������������������������\n");
		try{Thread.sleep(300);}catch(Exception e){e.printStackTrace();}
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		System.out.println("��������������������������������������������\n��                   A                     ��\n��                                        ��\n��                                        ��\n��                                        ��\n��                                        ��\n��      ���� ����                         ��\n��      �� - ~-��                         ��\n��      �� )  (��     *    *    *         ��\n��                                        ��\n��                                        ��\n��������������������������������������������\n");
		try{Thread.sleep(300);}catch(Exception e){e.printStackTrace();}
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		System.out.println("��������������������������������������������\n��                                        ��\n��                                        ��\n��                                        ��\n��                                        ��\n��                                        ��\n��      ���� ����                         ��\n��      �� o ~o��                         ��\n��      �� )  (��     *    *    *         ��\n��                                        ��\n��                                        ��\n��������������������������������������������\n");
		try{Thread.sleep(300);}catch(Exception e){e.printStackTrace();}
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		System.out.println("��������������������������������������������\n��                                        ��\n��                                        ��\n��                                        ��\n��                                        ��\n��                                        ��\n��            ���� ����                   ��\n��            �� o _o��                   ��\n��            �� ) *(��    *    *         ��\n��                                        ��\n��                                        ��\n��������������������������������������������\n");
		try{Thread.sleep(300);}catch(Exception e){e.printStackTrace();}
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		System.out.println("��������������������������������������������\n��                                        ��\n��                                        ��\n��                                        ��\n��                                        ��\n��                                        ��\n��            ���� ����                   ��\n��            �� - O-��                   ��\n��            �� ) *(��    *    *         ��\n��                                        ��\n��                                        ��\n��������������������������������������������\n");
		try{Thread.sleep(300);}catch(Exception e){e.printStackTrace();}
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		System.out.println("��������������������������������������������\n��                                        ��\n��                                        ��\n��                                        ��\n��                                        ��\n��                                        ��\n��            ���� ����                   ��\n��            �� - ~-��                   ��\n��            �� )  (��    *    *         ��\n��                                        ��\n��                                        ��\n��������������������������������������������\n");
		try{Thread.sleep(300);}catch(Exception e){e.printStackTrace();}
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		System.out.println("��������������������������������������������\n��                                        ��\n��                                        ��\n��                                        ��\n��                                        ��\n��                                        ��\n��            ���� ����                   ��\n��            �� o ~o��                   ��\n��            �� )  (��    *    *         ��\n��                                        ��\n��                                        ��\n��������������������������������������������\n");
		try{Thread.sleep(300);}catch(Exception e){e.printStackTrace();}
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		System.out.println("��������������������������������������������\n��                                        ��\n��                                        ��\n��                                        ��\n��                                        ��\n��                                        ��\n��                  ���� ����             ��\n��                  �� o _o��             ��\n��                  �� ) *(��   *         ��\n��                                        ��\n��                                        ��\n��������������������������������������������\n");
		try{Thread.sleep(300);}catch(Exception e){e.printStackTrace();}
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		System.out.println("��������������������������������������������\n��                                        ��\n��                                        ��\n��                                        ��\n��                                        ��\n��                                        ��\n��                  ���� ����             ��\n��                  �� - O-��             ��\n��                  �� ) *(��   *         ��\n��                                        ��\n��                                        ��\n��������������������������������������������\n");
		try{Thread.sleep(300);}catch(Exception e){e.printStackTrace();}
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		System.out.println("��������������������������������������������\n��                                        ��\n��                                        ��\n��                                        ��\n��                                        ��\n��                                        ��\n��                  ���� ����             ��\n��                  �� - ~-��             ��\n��                  �� )  (��   *         ��\n��                                        ��\n��                                        ��\n��������������������������������������������\n");
		try{Thread.sleep(300);}catch(Exception e){e.printStackTrace();}
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		System.out.println("��������������������������������������������\n��                                        ��\n��                                        ��\n��                                        ��\n��                                        ��\n��                                        ��\n��                  ���� ����             ��\n��                  �� o ~o��             ��\n��                  �� )  (��   *         ��\n��                                        ��\n��                                        ��\n��������������������������������������������\n");
		try{Thread.sleep(300);}catch(Exception e){e.printStackTrace();}
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		System.out.println("��������������������������������������������\n��                                        ��\n��                                        ��\n��                                        ��\n��                                        ��\n��                                        ��\n��                        ���� ����       ��\n��                        �� o _o��       ��\n��                        �� ) *(��       ��\n��                                        ��\n��                                        ��\n��������������������������������������������\n");
		try{Thread.sleep(300);}catch(Exception e){e.printStackTrace();}
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		System.out.println("��������������������������������������������\n��                                        ��\n��                                        ��\n��                                        ��\n��                                        ��\n��                                        ��\n��                        ���� ����       ��\n��                        �� - O-��       ��\n��                        �� ) *(��       ��\n��                                        ��\n��                                        ��\n��������������������������������������������\n");
		try{Thread.sleep(300);}catch(Exception e){e.printStackTrace();}
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		System.out.println("��������������������������������������������\n��                                        ��\n��                                        ��\n��                                        ��\n��                                        ��\n��                                        ��\n��                        ���� ����       ��\n��                        �� - ~-��       ��\n��                        �� )  (��       ��\n��                                        ��\n��                                        ��\n��������������������������������������������\n");
		try{Thread.sleep(300);}catch(Exception e){e.printStackTrace();}
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		System.out.println("��������������������������������������������\n��                                        ��\n��                                        ��\n��                                        ��\n��                                        ��\n��                                        ��\n��                        ���� ����       ��\n��                        �� o ~o��       ��\n��                        �� )  (��       ��\n��                                        ��\n��                                        ��\n��������������������������������������������\n");
		try{Thread.sleep(500);}catch(Exception e){e.printStackTrace();}
				System.out.println("                                              ");
				������(8);���(2);����(1);
				System.out.println(HighState()+LowState());
				break;
			case 3:
				System.out.println("�䳢�� ����־���... ");
				System.out.println("                                              ");
				������(-10);���(4);�ǰ�(-5);����(2);
				System.out.println(HighState()+LowState());
				break;
			case 4:
				System.out.println("�Ʒ��� ���״�... ");
				System.out.println("                                              ");
				������(-10);���(-10);�ǰ�(1);
				System.out.println(HighState()+LowState());
				break;
			default:
				System.out.println("1~4 ����");
				time--;
				����(���());
				break;
		}
	}
	int Full(){return F;}
	int Mood(){return M;}
	int Health(){return H;}
	int Love(){return L;}
	
	//���°� ��ȭ
	void ������(int a){
		F=intCheck(F,a);
		if(intLow(F)){
			System.out.println("�谡 �ſ� ������.");
			���(-10);
			�ǰ�(-10);
			����(-10);
		}
		
	}
	void ���(int a){
		M=intCheck(M,a);
		if(intLow(M)){
			System.out.println("����� ���� ���ڴ�.");
			����(-10);
		}
	}
	void �ǰ�(int a){
		H=intCheck(H,a);
		if(intLow(H)){
			System.out.println("�ǰ��� ������.");
			���(-10);
			����(-5);
		}
		if(H*Math.random()<0.5){
			D=true;
			����();
		}
	}
	void ����(int a){
		H=intCheck(H,a);
	}
	void ����(){
		System.out.println("�䳢�� ���� �ɷȴ�.");
	}
	void ����(){
		System.out.println("�䳢�� �׾���...");
	}
	String HighState(){
		if(intMax()==F)
			return "�谡 �ҷ����̰�, ";
		else if(intMax()==M)
			return "����� ���ƺ��̰�, ";
		else
			return "�ǰ��� ���̰�, ";
	}
	String LowState(){
		if(intMin()==F)
			return "�谡 ���°Ͱ���.";
		else if(intMin()==M)
			return "����� �۰Ͱ���.";
		else
			return "�ǰ��� ���� �����Ͱ���.";
	}	
	int intCheck(int A,int B){//0~100 �Ǻ�
		A+=B;
		if(A>100)
			return 100;
		else if(A<0)
			return 0;
		else
			return A;
	}
	boolean intLow(int A){//���°��� 30�̸��̸� true
			if(A<30)
				return true;
			else
				return false;
	}
	int intMax(){//���� ���� ���°�
		int i=100;
		for(i=100;i>=0;i--){
			if(i==F||i==H||i==M)
				break;
		}
		return i;
	}
	int intMin(){//���� ���� ���°�
		int i=0;
		for(i=0;i<=100;i++){
			if(i==F||i==H||i==M)
				break;
		}
		return i;
	}
}