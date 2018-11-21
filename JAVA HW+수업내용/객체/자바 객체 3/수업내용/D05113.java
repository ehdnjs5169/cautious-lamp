//�л����� ���� ��� ����ϴ� ���α׷�. 
import java.util.Scanner;
class D05113{
	static Scanner s = new Scanner(System.in);
	
	public static void main(String [] args){
		
		System.out.print("�迭 ũ��: ");
		int n = s.nextInt();
		double [] dArr = new double[n];
		
		//�ʱ�ȭ 1
		init1(dArr);
		//���
		printArr(dArr);
		//�ʱ�ȭ 2
		init2(dArr);
		//���
		printArr(dArr);
		//��� ������ �� ���
		System.out.println("��� ������ ��: "+sumArr(dArr));
		//���� ū ���� ���
		System.out.println("���� ū ����: "+largestElt(dArr));		
		//���� ū ������ ù ��° �ε��� ���
		System.out.println("���� ū ������ ù��° �ε���: "+minIndexOfMax(dArr));		
	}
	
	static void init1(double [] arr){//1��
		for(int i=0; i<arr.length; i++){
			System.out.print(i+1+"��° ����: ");
			arr[i] = s.nextDouble();
		}
	}
	static void init2(double [] arr){//2��
		for(int i=0; i<arr.length;i++){
			arr[i] = Math.random()*10;
		}
	}
	static void printArr(double [] arr){//3��
		for(double d:arr){
			System.out.println(d);
		}
	}
	static double sumArr(double [] arr){//4��
		double sum=0;
		for(double d:arr){
			sum += d;
		}
		return sum;
	}
	static double largestElt(double [] arr){//5��
		double max = arr[0];
		for(double d:arr){
			if(max<d) max = d;
		}
		return max;
	}
	static int minIndexOfMax(double [] arr){//6��: �ִ񰪵� �Ű������� ������ ���, �ƴ� ��� 
		double max = arr[0];
		int index=0;
		for(int i=0; i<arr.length; i++){
			if(max<arr[i]){
				max = arr[i];
				index = i;
			}
		}
		return index;
	}
	
	
	
	
}






