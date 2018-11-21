import java.util.Scanner;
class reservationSys{
	static Scanner s = new Scanner(System.in);
	public static void main(String [] args){
			boolean [][] arr = new boolean [10][10];
			
			iniArr(arr);
			showArr(arr);
			
	}
	public static void iniArr(boolean [][] arr){
		for(int i=0; i<10; i++){
			for(int j=0; j<10; j++){
				if((int)(Math.random()*2)==0) arr[i][j]=false;
				else arr[i][j]= true;
			}
		}
	}
	
	public static void showArr(boolean [][] arr){
		for(int i=0; i<10; i++){
			for(int j=0; j<10; j++){
				if(arr[i][j]==false) System.out.print(" ");
				else System.out.print("X");
			}
			System.out.println();
		}
	}
	
	public static void reserve(boolean [][] arr){
		int row, col;
		char a;
		while(true){
			while(true){
				System.out.println("행");
		a=s.nextInt();
		if(a>='a'&&a<='j') break;
			}
		System.out.println("열");
		col=s.nextInt();
		
		
		if(arr[row][col]==false){ 
		System.out.println("예약하시겠습니까?(Y/y,N/n)");
		a=s.next().toLowerCase.charAt(0);
		if(a=='n') {System.out.println("예약시스템을 종료합니다."); break;}
		else arr[row][col]=true; System.out.printf("%d행 %d열 좌석 예약에 성공하였습니다!",row+1,col+1);
		priArr(arr);
		}
		
	
	
	
	
	
	
	
	
}
	