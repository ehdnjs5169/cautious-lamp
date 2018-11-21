import java.util.Scanner;

class search{
	Scanner s = new Scanner(System.in);
	
	String inputString (String s1){
		System.out.print(s1);
		return s.nextLine();
	}
	
	void searchKeyword (String sentence, String keyword){
		int i, cnt=1, n=0;
		System.out.print("검색 결과: ");
		for (i=0; i<sentence.length()-keyword.length(); i++){
			if (sentence.charAt(i)==' ') cnt++;
		if (keyword.equalsIgnoreCase(sentence.substring(i,i+keyword.length()))){//if (sentence.substring(i,i+keyword.length()).equalsIgnoreCase.(keyword))
			System.out.print(cnt+"번째, ");
			n++;
		}	
	}
	if (n>0) System.out.println("\b\b 어절에서 "+keyword+"가 검색되며, 총"+n+"회 검색되었습니다.");
	else System.out.println("그런 단어는 없습니다.");
}
}
	