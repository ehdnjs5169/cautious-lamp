//�л����� ���� ��� ����ϴ� ���α׷�. 
import java.util.Scanner;
class D05112{
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
		
		System.out.println("������: "+scores[1]);
		//����޼ҵ� ȣ��
		changeScore(scores,70);
		System.out.println("������: "+scores[1]);
		changeScore(scores, 1,60);
		System.out.println("������ ���޼ҵ�: "+scores[1]);
		
		
	}
	
	/*static void changeScore(int before, int after){
		before=after;//�̷��� �ϸ� ������ü�� �ٲ��� �ʴ´�. */
	static void changeScore(int [] scores, int after){
		scores[1] = after;//������ ���� �������� ����
	}
	static void changeScore(int [] scores, int t, int after){
		
		scores[t]=after;
	}
	
	
	static double getAvrg(int [] scores){//��� ��ȯ�ϴ� �޼ҵ�: ������ �迭�� �޾Ƽ� �迭 ���ҵ��� ���(�Ǽ���)�� ��ȯ
		double sum=0;
		for(int i=0; i<scores.length;i++){
			scores[i] = (int)(Math.random()*101);
			sum += scores[i];
		}
		return sum/scores.length;
	}
}