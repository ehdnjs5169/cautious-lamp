import java.util.Scanner;
class search{
	Scanner s = new Scanner(System.in);
	String inputString(String s1){
		
		System.out.print(s1);
		return s.nextLine();
	}
	
	void searchkeyword(String sentence, String keyword){
		int i, n=0,cnt=1;
		
		System.out.print("�˻����:");
		
		for(i=0; i<sentence.length()-keyword.length(); i++){
			if(sentence.charAt(i)==' ') cnt++;
			
			if(keyword.equalsIgnoreCase(sentence.substring(i,i+keyword.length()))){
				System.out.print(cnt+"��°, ");
				n++;
			}
		}
		if(n>0){
	System.out.print("\b\b ��������"+keyword+"�� �˻��Ǿ�, ��"+n+"ȸ �˻��˴ϴ�.");
		}
		else System.out.print("�� 0ȸ �˻��˴ϴ�.");
	}
}