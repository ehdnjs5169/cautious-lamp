class seats{
	public static void main (String [] args){
	boolean [][] seats = new boolean [10][20];//[][]행,열 
	System.out.println(seats[2][4]);
	for(int j=0; j<20; j++) System.out.print(seats[2][j]+"\t");
	System.out.println();//2열 전체 예매상황
	System.out.println(seats.length);//행개수가 나옴
	System.out.println(seats[5].length);//열개수가 나옴
}
}
	