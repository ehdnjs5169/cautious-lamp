class Hw5_2{
	public static void main (String []args){
		StringManipulate s = new StringManipulate();
		String a,b,c;
		a="abckde";
		b="abckde";
		c="abcedk";
		System.out.println(s.Concat(a,b));
		s.toUpper(b);
		System.out.println(b.equals(c));
		System.out.println(a.equals(b));
	}
}
