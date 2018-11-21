import java.util.Scanner;
class search{
	Scanner s = new Scanner(System.in);
	String inputString(String s1){
		
		System.out.print(s1);
		return s.nextLine();
	}
	
	void searchkeyword(String sentence, String keyword){
		int i, n=0,cnt=1;
		
		System.out.print("검색결과:");
		
		for(i=0; i<sentence.length()-keyword.length(); i++){
			if(sentence.charAt(i)==' ') cnt++;
			
			if(keyword.equalsIgnoreCase(sentence.substring(i,i+keyword.length()))){
				System.out.print(cnt+"번째, ");
				n++;
			}
		}
		if(n>0){
	System.out.print("\b\b 어절에서"+keyword+"가 검색되어, 총"+n+"회 검색됩니다.");
		}
		else System.out.print("총 0회 검색됩니다.");
	}
}