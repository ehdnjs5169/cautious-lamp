//�л����� ���� ��� ����ϴ� ���α׷�.
import java.util.Scanner;
class D05112{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		double total=0;
	
		//�л��� �Է¹޾�
		//�׸�ŭ�� �迭 ����
		//������ 0-100 ������ ������ �ʱ�ȭ
		//��� ���
		System.out.print("�л�����? ");
		int n = s.nextInt();
		
		
		int [] scores = new int[n];
		for(int i=0; i<scores.length;i++){
			scores[i] = (int)(Math.random()*101);
			total +=scores[i];
		}
		System.out.printf("����� %.2f\n", total/scores.length);
		
		System.out.print("�����: "+getAvrg(scores));
	
	}


	static double getAvrg(int [] arr){//��� ��ȯ�ϴ� �޼ҵ�: �������迭�޾� �迭���ҵ��� ����� ��ȯ
		double sum=0;
		for(int i=0; i<arr.length;i++){
			arr[i] = (int)(Math.random()*101);
			sum+=arr[i];
			
			}
			return sum/arr.length;
	}
}