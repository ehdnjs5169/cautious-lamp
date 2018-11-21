class bokSeats{
	public static void main(String [] args){
		boolean [][] seats = new boolean [10][20];
		System.out.println(seats[4][10]);
		for(int j=0; j<20; j++) System.out.print(seats[2][j]+"\t");
		System.out.println();
		System.out.println(seats.length);
		System.out.println(seats[4].length);
	}
}
