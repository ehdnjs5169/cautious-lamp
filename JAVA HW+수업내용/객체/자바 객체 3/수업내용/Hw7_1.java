class Hw7_1{
	public static void main (String [] args){
		int [] scores = new int [50];
		int [] hist = new int [10];
		for(int i=0; i<scores.length; i++){
			scores[i]=(int)(Math.random()*101);
			if (scores[i]==100) hist[9]++;
			else hist[scores[i]/10]++;
		}
		for(int i=0;i<10 ;i++){
			System.out.printf("%2d:", i*10+5);
			for(int j=0;j<hist[i];j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}