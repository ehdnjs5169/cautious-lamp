class seats{
	public static void main (String [] args){
	boolean [][] seats = new boolean [10][20];//[][]��,�� 
	System.out.println(seats[2][4]);
	for(int j=0; j<20; j++) System.out.print(seats[2][j]+"\t");
	System.out.println();//2�� ��ü ���Ż�Ȳ
	System.out.println(seats.length);//�ళ���� ����
	System.out.println(seats[5].length);//�������� ����
}
}
	