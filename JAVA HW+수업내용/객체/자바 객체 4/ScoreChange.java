//�л����� ���� ��� ����ϴ� ���α׷�. 
import java.util.Scanner;
class ScoreChange{
	public static void main(String [] args){
		//�л��� �Է¹޾� 
		//�� ��ŭ�� �迭 ����
		//������ 0-100 ������������ �ʱ�ȭ
		//��� ���
		
		Scanner s = new Scanner(System.in);
		System.out.print("�л���: ");
		int n = s.nextInt();
		int [] scores = new int[n];
		
		
		System.out.printf("���: %.2f\n", getAvrg(scores));
		
	}
	
	static double getAvrg(int [] arr){//��� ��ȯ�ϴ� �޼ҵ�: ������ �迭�� �޾Ƽ� �迭 ���ҵ��� ���(�Ǽ���)�� ��ȯ
		double sum=0;
		for(int i=0; i<arr.length;i++){
			arr[i] = (int)(Math.random()*101);
			sum += arr[i];
		}
		return sum/arr.length;
	}
}