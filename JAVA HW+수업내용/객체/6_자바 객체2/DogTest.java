//ũ��
class Dog{
	private int size;//private�� �ܺο��� �Ժη� ������ �� ������ �Ѵ�.
	//�ʵ��� ���ľ�(����������)�� private�� �Ѱ�
	//pivate�ʵ忡 ���� ������ ������� ����ϱ� ���� getter�� setter�� ����Ѵ�.
	
	int getSize(){//getter�� ����-> size�� ��ȯ���� int��.
	return size;
	}
	void setSize(int s){//setter�� ����
	if(s<=0||s>10)size = 5;
	else size = s;
	}
}

class DogTest{
	public static void main(String [] args){
		Dog d = new Dog();
		/*System.out.println(d.size);
		//�������� ũ�⸦ -10���� �α�
		d.size=-10;
		System.out.println("�������� �����Դ� "+d.size);
		//�������� ũ�⸦ 8000���� �α�
		*/
		System.out.print(d.getSize());
		d.setSize(-8);
		System.out.print(d.getSize());
		}
}