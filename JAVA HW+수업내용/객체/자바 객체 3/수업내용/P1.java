import java.util.Scanner;
class P1{
	static Scanner s = new Scanner(System.in);
	public static void main(jmj){
		System.out.print("�迭�� ũ��");
		
		int n = s.nextInt();
		double [] arr = new double[n];
		
		
	ini1(arr);
		//���
		priArr(arr);
		//�ʱ�ȭ 2
		//ini2(arr);
		//���
		//priArr(arr);
		//��� ������ �� ���
		System.out.println("��� ������ ��: "+sumArr(arr));
		//���� ū ���� ���
		System.out.println("���� ū ����: "+maxArr(arr));		
		//���� ū ������ ù ��° �ε��� ���
		System.out.println("���� ū ������ ù��° �ε���: "+minIndexOfMax(arr));
		//shuffleArr(arr);
		//priArr(arr);
		R1(arr);
		priArr(arr);
		L1(arr);
		priArr(arr);
		LN(arr);
		priArr(arr);
		RN(arr);
		priArr(arr);
		
	}
	static void ini1(double [] arr){
		for(int i=0; i<arr.length; i++){
			
			System.out.println(i+1+"��° ����");
			arr[i]=s.nextDouble();
		}
	}
	
	static void ini2(double [] arr){
		for(int i=0; i<arr.length;i++){
			arr[i]=Math.random()*10;
		}
	}
	
	static void priArr(double [] arr){
		/*for(int i=0; i<arr.length;i++){
		System.out.println(arr[i])*/
		for(double d:arr){
			System.out.println(d);
		}
	}
	
	static double sumArr(double [] arr){
		double sum=0;
		for(int i=0;i<arr.length;i++){
			sum+=arr[i];
		}
		return sum;
	}
	
	static double maxArr(double [] arr){
		double max=arr[0];
		for(double d:arr){
			if (max<d) max=d;
		}
		return max;
	}
	
	static int minIndexOfMax(double [] arr){
		double max=arr[0];
		int index = 0;
		for(int i=0; i<arr.length;i++){
		if (max<arr[i]) {
			max=arr[i]; 
			index=i;
		}
		}
		return index;
	}
	static void shuffleArr(double [] arr){
		double tmp;
		int index;
		for(int i=0; i<arr.length;i++){
			tmp=arr[i];
			index=(int)(Math.random()*arr.length);
			arr[i]=arr[index];
			arr[index]=tmp;
		}
	}
	
	static void R1(double [] arr){
		/*for(int i=arr.length-1 ; i>0; i--){
		if(i==1) arr[0]=arr[arr.length-1]; 
		else arr[i]=arr[i-1];*/
		int a=arr.length-1;
		double b=arr[a];
		for(int i=a;i>0;i--){
		arr[i]=arr[i-1];
		}
		arr[0]=b;
		}
		
	static void L1(double [] arr){
		double a=arr[0];
		
		for(int i=0; i<arr.length-1; i++){
			
			arr[i]=arr[i+1];
	}
	arr[arr.length-1]=a;
		
	}
	
	static void LN(double [] arr){
		System.out.println("�� �� �·� �̵��Ͻðڽ��ϱ�");
		int k=s.nextInt();
		k=k%arr.length;
		double [] nArr = new double [k];
		
		for(int i=0; i<k; i++){
			nArr[i]=arr[i];
		}
		for(int i=0; i<arr.length-k; i++){
			arr[i]=arr[k+i];
		}
		for(int i=0 ; i<k ;i++){
			arr[arr.length-k+i]=nArr[i];
		}
	}
	
	static void RN(double [] arr){
		System.out.println("�� ĭ �������� �̵���Ű�ڽ��ϱ�?");
		int k=s.nextInt();
		double [] mArr = new double [k];
		k%=arr.length;
		for(int i=0; i<k; i++){
			mArr[i]=arr[arr.length-k+i];
		}
		for(int i=arr.length; i>k; i--){
			arr[i-1] =arr[i-k-1];
		}
		for(int i=0; i<k ;i++){
			arr[i]=mArr[i];
		}
	}
	}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
			
			
			
			
			
			
			