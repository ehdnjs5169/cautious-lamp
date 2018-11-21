class Hw8_1{
	public static void main (String [] args){
	String a;
	if (args.length==0) {System.out.print("입력된 문자열이 없습니다."); return;}
	
	
	for(int i=0; i<args.length-1; i++){
		for(int j=i+1; j<args.length; j++){
			if(args[i].length()<args[j].length()){
		a=args[i];
		args[i]=args[j];
		args[j]=a;
			}	
			else if(args[i].length()==args[j].length()){
			if(args[i].compareTo(args[j])>0){
					a=args[i];
					args[i]=args[j];
					args[j]=a;
				}
			}
		}
	}
	
	for(String s:args) System.out.printf("%s\t",s);
	}
}
			
			
			
			
			
			
			
			
			
			