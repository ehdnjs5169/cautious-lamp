import java. util. Scanner;
class TwoDimen{
	static Scanner s = new Scanner(System.in);
	public static void main(String [] args){
	int row, col;
	
	System.out.print("��");
	row= s.nextInt();
	System.out.print("��");
	col= s.nextInt();
		
	int [][] arr = new int [row][col];
	iniArr(arr);
	priArr(arr);
	sumArr(arr);
	sumByCol(arr);
	System.out.println(largestRow(arr));
	int [] index = indexOfMax(arr);
	System.out.printf("���� ū ������ �ε����� %d�� %d�� �����Դϴ�.\n",index[0]+1,index[1]+1);
	randomShuffle(arr);
	priArr(arr);
	
	
	}
	public static void iniArr(int [][] arr){
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
		System.out.printf("%d�� %d��: ",i+1,j+1);
		arr[i][j]=s.nextInt();
		}
		}
	}
	
	public static void priArr(int [][] arr){
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				System.out.printf("%d\t",arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void sumArr(int [][] arr){
		int sum=0;
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				sum+=arr[i][j];
			}
		}
		System.out.println(sum);
	}
	
	public static void sumByCol(int [][] arr){
		
		for(int j=0; j<arr[0].length; j++){
			int sum=0;
			for(int i=0; i<arr.length; i++){
				sum+=arr[i][j];
			}
			System.out.print(sum);//row, col �� �� �޼��忡�� ȣ���Ϸ���?
		}
		System.out.println();
	}
			
	public static int largestRow(int [][] arr){
		int a=0;
		int max=0, sum;
		for(int i=0; i<arr.length; i++){
			sum=0;
			for(int j=0; j<arr[i].length; j++){
				sum+=arr[i][j];
			}
			if (max<sum) {max=sum; a=i+1;}
		}
		return a;
	}
	
	public static int [] indexOfMax(int [][] arr){
		int max=arr[0][0];
		int [] index = {0,0};
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				if (max<arr[i][j]){
					max=arr[i][j];
					index[0]=i;
					index[1]=j;
				}
			}
		}
		return index;
	}
	
	public static void randomShuffle(int [][] arr){
		int a, row,col;
		for(int i=0; i< arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				row=(int)(Math.random()*arr.length);
				col=(int)(Math.random()*arr[i].length);
				a=arr[i][j];
				arr[i][j]=arr[row][col];
				arr[row][col]=a;
			}
		}
	}
		
			
		
	
	
	
}
	
		