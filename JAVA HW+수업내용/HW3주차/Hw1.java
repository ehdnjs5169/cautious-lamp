public class Hw1{
	public static void main(String []args){
		int i;
		for (i=1;i<20;i+=2){
			if(i<=9){ System.out.printf("x값이 %d일때 f(x)=%d\n",i,i*i-9*i+2);}
			else if (i>9) {System.out.printf("x값이 %d일때 f(x)=%d\n",i, 2*i-4);}
		}
	}
}
			