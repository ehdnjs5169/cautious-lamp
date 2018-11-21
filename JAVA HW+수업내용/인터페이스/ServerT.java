import java.util.Scanner;
class ServerT{
	public static void main(String [] args){
	Server server = new Server();
	server.Service();
	
	
	}
}
class Server{
	private String pw="java";
	private Control [] c= new Control [5];
	private Scanner sc = new Scanner(System.in);
	
	Server(){
		c[0]=new Gas();
		c[1]=new Boiler();
		c[2]=new Light();
		c[3]=new Cooker();
		c[4]=new Refrigerlator();
		
	}
	
	private boolean logIn(){
		String userPw;
		boolean pass=false;
		
		for(int i=0; i<3; ){
			
			System.out.print("��й�ȣ�� �Է��Ͻÿ�");
			userPw=sc.nextLine();
			pass=userPw.equals("java");
		if (pass){
			System.out.println("������ �����ϼ̽��ϴ�.");
			break;
		}
		else {
			i++; 
		System.out.println("��й�ȣ�� " +i+"ȸ �߸� �Է��ϼ̽��ϴ�.");
		if(i==3) System.out.println("�������� ��û�� �����մϴ�.");
		}
		}
		return pass;
	}
	
		public void Service(){
			if(logIn()){
				while(true){
					System.out.println("================================");
					System.out.println("����/�Ͱ�/����");
					String ser = sc.nextLine();
					switch(ser){
						case "����":
						goOut();
						break;
					
						case "�Ͱ�":
						comeHome();
						break;
						
						case "����":
						System.out.println("Ȩ������ ������ �����մϴ�.");
						break;
						break;
						default:
						System.out.println("�߸��� ����Դϴ�.");
					}
					
					}
				}
			else System.out.println("�α��� ���� �۵��Ұ�");
				
			}
		
	
	private void goOut(){
		for(int i=0; i<c.length; i++){
			c[i].turnOff();
		}
	}
	
	private void comeHome(){
		for(int i=0; i<c.length; i++){
			c[i].turnOn();
		}
	}
}

interface Control{
	void turnOff();
	void turnOn();
	}

abstract class Fire implements Control{
public void turnOff(){System.out.println( this.getClass().getName()+": �����ϴ�.");}
public void turnOn() {System.out.println(this.getClass().getName()+": �����ϴ�.");}	
}

class Gas extends Fire{
	public void turnOff(){System.out.println(this.getClass().getName()+": ��� ��� ����");}
}
class Boiler extends Fire{}
class Light extends Fire{}
class Cooker extends Fire{
	public void turnOn(){System.out.println(this.getClass().getName()+ ": ����� ����");}
}

class Refrigerlator implements Control{
	public void turnOff(){
		System.out.println(this.getClass().getName()+": ������ ����.");
	}
	public void turnOn(){
		System.out.println(this.getClass().getName()+": ���� ������ �������.");
	}
}
	
	
	