import java.io.*;
import java.util.Scanner;

public class Test{
	private static Cfunction c = new Cfunction();
	static Scanner s = new Scanner(System.in);
	static 세탁기 [] a    = new 세탁기[5];
	
	public static void main(String [] args){

		 for(int i = 0 ; i<a.length ; i++){		a[i] = new 세탁기(i+1);}	//세탁기 객체 생성
		 File loadsetting = new File("machineset.txt");	// 세탁기사용,세탁기용량,세제량,섬유유연제량
		 
		 try{
			 if(!loadsetting.exists())		//파일생성 및 초기화
		 	{
			 PrintWriter newfile = new PrintWriter(loadsetting);
			 for(int i = 0 ; i < 5 ; i ++)
				 newfile.println("0 0 0 0");
			 newfile.close();
		 	}
		 	
		 	Scanner load = new Scanner(loadsetting);		//세탁기설정 로드
		 	for(int i = 0 ; i < 5 ; i ++){
		 		int temp = Integer.parseInt(load.next());
		 		if(temp == 2)
		 			a[i].set세탁기사용(1);
		 		else
		 			a[i].set세탁기사용(temp);
		 		a[i].set용량(Integer.parseInt(load.next()));
		 		a[i].set세제량(Integer.parseInt(load.next()));
		 		a[i].set섬유유연제량(Integer.parseInt(load.next()));
		 	}
		 	load.close();
		 
		 }catch(Exception e){e.printStackTrace();}
		  
		 
		 mainGround();
		 
		 

	}


	static void mainGround(){																// 초기화면
		c.clsFunction();
		관리.backGround();
		
		c.gotoxy(22,1);System.out.printf("┌─────────────────────────┐");
		c.gotoxy(22,2);System.out.printf("│　　　　　　　　세탁기 관리 프로그램　　　　　　　│");
		c.gotoxy(22,3);System.out.printf("└─────────────────────────┘");
		c.gotoxy(40,9);System.out.printf("Java Term Project");
		c.gotoxy(65,15);System.out.printf("2012104372 김준하");
		c.gotoxy(65,16);System.out.printf("2009104011 조진용");
		c.gotoxy(65,17);System.out.printf("2011098046 이민형");
		c.gotoxy(65,18);System.out.printf("2015113693 이규민");
		c.gotoxy(6,25);System.out.printf(" 계속하려면 Enter를 눌러주세요");
		s.nextLine();
		관리.clearScreen();
		관리.logNew(); // 로그인화면으로 가야하나 임시로 리스트로감
			
	}
}
