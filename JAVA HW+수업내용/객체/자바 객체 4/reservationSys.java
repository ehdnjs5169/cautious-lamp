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
				System.out.println("��");
		a=s.nextInt();
		if(a>='a'&&a<='j') break;
			}
		System.out.println("��");
		col=s.nextInt();
		
		
		if(arr[row][col]==false){ 
		System.out.println("�����Ͻðڽ��ϱ�?(Y/y,N/n)");
		a=s.next().toLowerCase.charAt(0);
		if(a=='n') {System.out.println("����ý����� �����մϴ�."); break;}
		else arr[row][col]=true; System.out.printf("%d�� %d�� �¼� ���࿡ �����Ͽ����ϴ�!",row+1,col+1);
		priArr(arr);
		}
		
	
	
	
	
	
	
	
	
}
	