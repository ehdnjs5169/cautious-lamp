class StringManipulate{
	String Concat(String s1, String s2){
		return s1+s2;
	}
	
	void toUpper(String s){
		for(int i=0; i<s.length(); i++){
			if('a'<=s.charAt(i)&&'z'>=s.charAt(i)) System.out.print((char)(s.charAt(i)-32));
			else System.out.print(s.charAt(i));
		}
	}
	boolean equals(String s1, String s2){
		if(s1.length()!=s2.length()) return false;
		else{
			for(int i=0; s1.length()<i; i++){
				if (s1.charAt(i)!=s2.charAt(i)) return false;
			}
		
		}
		return true;
	}
}