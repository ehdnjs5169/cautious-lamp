//크기
class Dog{
	private int size;//private가 외부에서 함부로 접근할 수 없도록 한다.
	//필드의 수식어(접근지정자)는 private로 둘것
	//pivate필드에 대한 접은을 어느정도 허용하기 위해 getter와 setter를 사용한다.
	
	int getSize(){//getter의 일종-> size의 반환형이 int다.
	return size;
	}
	void setSize(int s){//setter의 일종
	if(s<=0||s>10)size = 5;
	else size = s;
	}
}

class DogTest{
	public static void main(String [] args){
		Dog d = new Dog();
		/*System.out.println(d.size);
		//강아지의 크기를 -10으로 두기
		d.size=-10;
		System.out.println("강아지의 몸무게는 "+d.size);
		//강아지의 크기를 8000으로 두기
		*/
		System.out.print(d.getSize());
		d.setSize(-8);
		System.out.print(d.getSize());
		}
}