import java.util.Scanner;

class search{
	Scanner s = new Scanner(System.in);
	
	String inputString (String s1){
		System.out.print(s1);
		return s.nextLine();
	}
	
	void searchKeyword (String sentence, String keyword){
		int i, cnt=1, n=0;
		System.out.print("�˻� ���: ");
		for (i=0; i<sentence.length()-keyword.length(); i++){
			if (sentence.charAt(i)==' ') cnt++;
		if (keyword.equalsIgnoreCase(sentence.substring(i,i+keyword.length()))){//if (sentence.substring(i,i+keyword.length()).equalsIgnoreCase.(keyword))
			System.out.print(cnt+"��°, ");
			n++;
		}	
	}
	if (n>0) System.out.println("\b\b �������� "+keyword+"�� �˻��Ǹ�, ��"+n+"ȸ �˻��Ǿ����ϴ�.");
	else System.out.println("�׷� �ܾ�� �����ϴ�.");
}
}
	