class Figure{
	protected double area;
	protected double circleAround;
	Figure(){}
	Figure(double area, double circleAround){
	this.area=area;
	this.circleAround=circleAround;
}
	public String toString(){
		return String.format("이 도형은 %s이고, 넓이는 %f, 둘레는 %f입니다.",this.getClass().getName(), area, circleAround);
	}
}

class Circle extends Figure{
protected double radius;
Circle(){
super(Math.PI,Math.PI*2);
	radius=1;
}

Circle(double r){
	radius = r;
super(Math.PI*r*r, 2*Math.PI*r);	
}
public String toString(){
	return super.toString()+"이 원의 반지름은"+radius+"입니다.";
}
}

class EquilateralTriangle extends Figure{
protected double side;
protected double height;

EquilateralTriangle(){
	super(Math.sqrt(3)/4,3);
	this.side=side;
}	

EquilateralTriangle(double s){
	super(Math.sqrt(3)/4*s,3*s);
	side=s;
}
public String toString(){
	return super.toString()+ 이 정삼각형의 한 변의 길이는"+s+"입니다.";
}

}

class Test{
	public static void main(String [] args){
	Circle c = new Circle(3);
	System.out.print(c);
	EquilateralTriangle t = new EquilateralTriangle(3);
	System.out.print(t);
}
}