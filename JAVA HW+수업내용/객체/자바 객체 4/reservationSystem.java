import java.util.Scanner;

class reservationSystem{
	static Scanner s = new Scanner(System.in);
	public static void main (String [] args){
		boolean [][] arr = new boolean [10][10];
		ini(arr);
		showReservation(arr);
		char reservation;
		while(true){
			System.out.print("������ �Ͻðڽ��ϱ�(Y/y, N/n)?");
			reservation = s.next().charAt(0);
			if(reservation=='y'||reservation=='Y') reserve(arr);
			else if(reservation=='N'||reservation=='n') {System.out.println("����ý����� �����մϴ�."); break;}
			else System.out.println("�߸� �Է��ϼ̽��ϴ�.");
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
			System.out.println("���� ���� ����");
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
			System.out.println("�� ��: ");
			a=s.next().toLowerCase().charAt(0);
			if(a>='a'&&a<='j')  break;
			System.out.print("a�� j������ ���ڸ� �Է����ּ���");
				}
				row=(int)(a-'a');
				
			while(true){
			System.out.println("�� ��: ");
			col=s.nextInt();
			if(col>=1&&col<=10) break;
			System.out.println("1�̻� 10������ ���ڸ� �Է����ּ���");
			}
			if(arr[row][col]==false) {
				arr[row][col]=true; 
			System.out.printf("%d�� %d���¼��� ������ �����Ͽ����ϴ�!.",row+1, col+1);
			break;
			}
			else System.out.println("�̹� ����� �¼��Դϴ�. �ٸ�	�¼��� �Է����ּ���");
			}
			
		
		}
	
}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			