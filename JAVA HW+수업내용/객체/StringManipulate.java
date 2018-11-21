class StringManipulate{
	String str1,str2;
	
	String connect(String a, String b){
		return a+b;
	}
	
	void toUpper (String str){
		for(int i=0; i<str.length(); i++)
			if ('a'<=str.charAt(i)&&str.charAt(i)<='z') System.out.print((char)(str.charAt(i)-32));
			else System.out.print(str.charAt(i)); 
	}
	
	boolean equal (String s1, String s2){
		if (s1.length()!=s2.length()) return false;
		else
		{
			for(int i=0; i<s1.length(); i++)
				if(s1.charAt(i)!=s2.charAt(i)) return false;
		}
	return true;
	}	

}

/*boolean equal (String s1, String s2){
		if (s1.length()==s2.length()){
			for(int i=0; i<s1.length(); i++)
				if(s1.charAt(i)!=s2.charAt(i)) return false;
		}
	else return false;
	}	
*/
