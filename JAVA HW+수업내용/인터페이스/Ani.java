	class Ani{
	public static void main (String [] args){
		Animal animal []= {new Cat("�����"), new Dolphin("����"), new Dove("��ѱ�")};
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
		System.out.print("���� "+Name+"�̰�, ");
	}
}

class Cat extends Animal{
	
	Cat(String Name){
	super.Name=Name;
	}
	void move(){
		super.move();
		System.out.print("�޸��ϴ�.\n");
	}
}

class Dolphin extends Animal{
	
	Dolphin(String Name){
	super.Name=Name;
	}
	void move(){
		super.move();
		System.out.print("���Ĩ�ϴ�.\n");
	}
}

class Dove extends Animal{
	
	Dove(String Name){
	super.Name=Name;
	}
	void move(){
		super.move();
		System.out.print("���ƴٴմϴ�.\n");
	}
}
