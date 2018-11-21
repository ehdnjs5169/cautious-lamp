public class festivaltest{
	public static void main(String [] args){
		int a = 30;
		int b = 30;
		int c = 30;
		
		int d = 40;//이것은 애정도 입니다.
		festival f = new festival();
		
		f.progress(a, b, c);
		d = f.reward(d);
		System.out.print(d);
		
	}
}