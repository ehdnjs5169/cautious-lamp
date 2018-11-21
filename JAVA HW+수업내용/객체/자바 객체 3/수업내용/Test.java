import java.util.Scanner;
class Test{
	static Scanner s = new Scanner(System.in);
	public static void main (String [] args){
		
		System.out.print("배열의 개수:");
		int n=s.nextInt();
		double [] arr = new double [n];
		
	}
		
		static void ini1(double [] arr){
		for(int i=0; i<arr.length; i++){
		System.out.println(i+1+"번째 수");
		arr[i]=s.nextDouble();
		}
	}
	
		static void ini2(double [] arr){
		for(int i=0; i<arr.length; i++){
			arr[i]=(Math.random()*10);
		}
		}
		
		static void priArr(double [] arr){
			for(int i = 0;i<arr.length;i++)
			System.out.print(arr[i]);
		}
		
		static double sumArr(double [] arr){
			double sum=0;
			for(int i=0;i<arr.length;i++){
				sum+=arr[i];
			}
		return sum;
		}
		
		static double maxArr(double [] arr){
			double max=0;
			for(double d:arr){
				if(max<d) max=d;
			}
			return max;
		}
		static int minIndexOfMax(double [] arr){
			int index=0;
			double max=0;
			for(int i=0; i< arr.length; i++){
				if(max<arr[i]) max=arr[i]; index=i;
			}
			return index;
		}
}
		
