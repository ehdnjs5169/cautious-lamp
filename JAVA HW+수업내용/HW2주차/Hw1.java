import java.util.Scanner;
public class Hw1{
	public static void main(String[] args){
			int quo,res;
			Scanner s=new Scanner(System.in);
			System.out.print("일억미만의 수");
			res=s.nextInt();
			quo= res/10000;
			res= res%10000;
			if (quo>1) System.out.printf("%d만",quo);
			else if (quo==1) System.out.print("만");
			
			quo=res/1000;
			res=res%1000;
			
			if (quo>1) System.out.printf("%d천",quo);
			else if (quo==1) System.out.print("천");
			
			quo=res/100;
			res=res%100;
			
			if (quo>1) System.out.printf("%d백", quo);
			else if (quo==1) System.out.print("백");
			
			quo=res/10;
			res=res%10;
			
			if (quo>1) System.out.printf("%d십", quo);
			else if (quo==1) System.out.print("십");
			
			quo=res%10;
			
			if (res !=0)System.out.printf("%d입니다\n", res);
	}
}
		
			
			
				
			
			
			
			
		
		
		
		
		
		
		
		
		
		
		/*int num,a,b,c,d,e,f;
		System.out.print("몇");
		Scanner s= new Scanner(System.in);
		a=s.nextInt();
		b=a/10000;
		c=(a-b*10000)/1000;
		d=(a-b*10000-c*1000)/100;
		e=(a-b*10000-c*1000-d*100)/10;
		f=(a-b*10000-c*1000-d*100-e*10);
		System.out.printf("%d만 %d천 %d백 %d십 %d입니다", b,c,d,e,f);
	}
}*/

		