class StudentTest{
	public static void main (String [] args){
	Subject [] subjects = {new Korean(100), new English(), new Mathematics(), new Science()}; 
	Student kim = new Student();
	for(int i=0; i< subjects.length; i++){
		kim.report(subjects[i]);
	}
	}
}
class Student{
	public void report(Subject s){
		System.out.printf("%s과목의 점수는 %d입니다.", s.getClass().getName(), s.getScore());
	}
}

class Subject{
private int score;

public Subject(){
	 this.score=(int)(Math.random()*101);
}
public Subject(int score){
	this.score=score;
}
public int getScore(){
	return score;
}
}

class Science extends Subject{
public Science(){}
public Science(int score){
	super(score);
}
}

class Mathematics extends Subject{
public Mathematics(){}
public Mathematics(int score){
	super(score);
}
}

class Korean extends Subject{
public Korean(){}
public Korean(int score){
	super(score);
}
}

class English extends Subject{
public English(){}
public English(int score){
	super(score);
}
}
