import java.util.Scanner;

class reservationSystem{
	static Scanner s = new Scanner(System.in);
	public static void main (String [] args){
		boolean [][] arr = new boolean [10][10];
		ini(arr);
		showReservation(arr);
		char reservation;
		while(true){
			System.out.print("예약을 하시겠습니까(Y/y, N/n)?");
			reservation = s.next().charAt(0);
			if(reservation=='y'||reservation=='Y') reserve(arr);
			else if(reservation=='N'||reservation=='n') {System.out.println("예약시스템을 종료합니다."); break;}
			else System.out.println("잘못 입력하셨습니다.");
		}
	}
		
		
		
		public static void ini(boolean [][] arr){
			int a=0;
			for(int i=0 ; i<10; i++){
				for(int j=0; j<10; j++){
					a=(int)(Math.random()*2);
					if(a==0) arr[i][j]=false;
					else arr[i][j] = true;
				}
			}
		}
		
		public static void showReservation (boolean [][] arr){
			System.out.println("현재 예약 상태");
			for(int i=0; i<10; i++){
				for(int j=0; j<10; j++){
					if(arr[i][j]==false) System.out.print(" ");
					else System.out.print("X");
				}
				System.out.println();
			}
		}
		
		public static void reserve(boolean [][] arr){
			char a;
			int col,row;
			
			
			while(true){
				while(true){
			System.out.println("몇 행: ");
			a=s.next().toLowerCase().charAt(0);
			if(a>='a'&&a<='j')  break;
			System.out.print("a와 j사이의 문자를 입력해주세요");
				}
				row=(int)(a-'a');
				
			while(true){
			System.out.println("몇 열: ");
			col=s.nextInt();
			if(col>=1&&col<=10) break;
			System.out.println("1이상 10이하의 숫자를 입력해주세요");
			}
			if(arr[row][col]==false) {
				arr[row][col]=true; 
			System.out.printf("%d행 %d열좌석의 예약을 성공하였습니다!.",row+1, col+1);
			break;
			}
			else System.out.println("이미 예약된 좌석입니다. 다른	좌석을 입력해주세요");
			}
			
		
		}
	
}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			