import java.io.*;
import java.util.Scanner;

public class Test{
	private static Cfunction c = new Cfunction();
	static Scanner s = new Scanner(System.in);
	static ��Ź�� [] a    = new ��Ź��[5];
	
	public static void main(String [] args){

		 for(int i = 0 ; i<a.length ; i++){		a[i] = new ��Ź��(i+1);}	//��Ź�� ��ü ����
		 File loadsetting = new File("machineset.txt");	// ��Ź����,��Ź��뷮,������,������������
		 
		 try{
			 if(!loadsetting.exists())		//���ϻ��� �� �ʱ�ȭ
		 	{
			 PrintWriter newfile = new PrintWriter(loadsetting);
			 for(int i = 0 ; i < 5 ; i ++)
				 newfile.println("0 0 0 0");
			 newfile.close();
		 	}
		 	
		 	Scanner load = new Scanner(loadsetting);		//��Ź�⼳�� �ε�
		 	for(int i = 0 ; i < 5 ; i ++){
		 		int temp = Integer.parseInt(load.next());
		 		if(temp == 2)
		 			a[i].set��Ź����(1);
		 		else
		 			a[i].set��Ź����(temp);
		 		a[i].set�뷮(Integer.parseInt(load.next()));
		 		a[i].set������(Integer.parseInt(load.next()));
		 		a[i].set������������(Integer.parseInt(load.next()));
		 	}
		 	load.close();
		 
		 }catch(Exception e){e.printStackTrace();}
		  
		 
		 mainGround();
		 
		 

	}


	static void mainGround(){																// �ʱ�ȭ��
		c.clsFunction();
		����.backGround();
		
		c.gotoxy(22,1);System.out.printf("������������������������������������������������������");
		c.gotoxy(22,2);System.out.printf("��������������������Ź�� ���� ���α׷�����������������");
		c.gotoxy(22,3);System.out.printf("������������������������������������������������������");
		c.gotoxy(40,9);System.out.printf("Java Term Project");
		c.gotoxy(65,15);System.out.printf("2012104372 ������");
		c.gotoxy(65,16);System.out.printf("2009104011 ������");
		c.gotoxy(65,17);System.out.printf("2011098046 �̹���");
		c.gotoxy(65,18);System.out.printf("2015113693 �̱Թ�");
		c.gotoxy(6,25);System.out.printf(" ����Ϸ��� Enter�� �����ּ���");
		s.nextLine();
		����.clearScreen();
		����.logNew(); // �α���ȭ������ �����ϳ� �ӽ÷� ����Ʈ�ΰ�
			
	}
}
