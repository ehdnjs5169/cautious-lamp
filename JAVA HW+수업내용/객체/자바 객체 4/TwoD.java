import java.util.Scanner;
class TwoD{
	static Scanner s = new Scanner(System.in);
	public static void main(String [] args){
		
	 System.out.print("�� ����");
	 int a=s.nextInt();
	 System.out.print("�� ����");
	 int b=s.nextInt();
	int [][] arr = new int [a][b];
	iniArr(arr);
	printArr(arr);
	
	}
	static void iniArr(int [][] arr){
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				System.out.printf("%d��, %d���� ����: ",i+1,j+1);
				arr[i][j]=s.nextInt();
			}
		}
	}
	static void printArr(int [][] arr){
		for(int i=0; i< arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
		
		System.out.printf("%d\t", arr[i][j]);
		}
		System.out.println();
	}
}
	static void sumByCol(int [][] arr){//col: ��
	int sum=0;
	for(int j=0; j<arr[0].length;j++){
		sum=0;
	for(int i=0; i<arr.length;i++){
		sum+=arr[i][j];
	}//j���� ��
	System.out.println("������:"+sum);
	}
}
}






















