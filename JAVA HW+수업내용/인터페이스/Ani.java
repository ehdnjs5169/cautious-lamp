	class Ani{
	public static void main (String [] args){
		Animal animal []= {new Cat("고양이"), new Dolphin("돌고래"), new Dove("비둘기")};
		for(Animal a: animal) a.move();
	}
}
class Animal{
	String Name;
	public Animal(){}
	public Animal(String Name){
		this.Name=Name;
	}
	void move(){
		System.out.print("나는 "+Name+"이고, ");
	}
}

class Cat extends Animal{
	
	Cat(String Name){
	super.Name=Name;
	}
	void move(){
		super.move();
		System.out.print("달립니다.\n");
	}
}

class Dolphin extends Animal{
	
	Dolphin(String Name){
	super.Name=Name;
	}
	void move(){
		super.move();
		System.out.print("헤엄칩니다.\n");
	}
}

class Dove extends Animal{
	
	Dove(String Name){
	super.Name=Name;
	}
	void move(){
		super.move();
		System.out.print("날아다닙니다.\n");
	}
}
