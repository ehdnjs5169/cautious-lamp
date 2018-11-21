import java.util.Scanner;
class StudentTest{
	public static void main(String [] args){
	Scanner s= new Scanner(System.in);
	String name;
	int age;
	double score;
	
	name=s.nextLine();
	age=s.nextInt();
	score=s.nextDouble();
	Student st = new Student(name, age, score);
	System.out.print(st.getScore());
	st.setScore(4.3);
	System.out.print(st.getScore());
	}
}
class Student{
	private String name;
	private int age;
	private double score;
	
	String getName(String name){
		return name;
	}
	int getAge(){
		return age;
	}
	double getScore(){
		return score;
	}
	void setName(String s){name =s;}
	void setAge(int i){
		if(i>=0&&i<200) age=i;
		else age = 0;}
	void setScore(double d){
		if(d>=0&&d<=4.3)score=d;
		else d=3.0;}
	Student(){}
	Student(String a,int b, double c){
		setName(a);
		setAge(b);
		setScore(c);
	}
}