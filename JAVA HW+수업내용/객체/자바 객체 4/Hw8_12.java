class Hw8_12{
	public static void main (String [] args){
		String a;
		for(int i=0; i<args.length; i++){
			for(int j=i+1; j<args.length; j++){
				if(args[i].length()<args[j].length()){
					a=args[i];
					args[i]=args[j];
					args[j]=a;
				}
				else if(args[i].length()==args[i+1].length()){
					if(args[i].compareTo(args[i+1])>0){
						a=args[i+1];
						args[i]=args[i+1];
						args[i]=a;
					}
				}
			}
		}
		for(int i=0; i<args.length; i++) System.out.print(args[i]);
	}
}
					
				