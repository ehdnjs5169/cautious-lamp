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
			
			System.out.print("비밀번호를 입력하시오");
			userPw=sc.nextLine();
			pass=userPw.equals("java");
		if (pass){
			System.out.println("인증에 성공하셨습니다.");
			break;
		}
		else {
			i++; 
		System.out.println("비밀번호를 " +i+"회 잘못 입려하셨습니다.");
		if(i==3) System.out.println("서버연결 요청을 종료합니다.");
		}
		}
		return pass;
	}
	
		public void Service(){
			if(logIn()){
				while(true){
					System.out.println("================================");
					System.out.println("외출/귀가/종료");
					String ser = sc.nextLine();
					switch(ser){
						case "외출":
						goOut();
						break;
					
						case "귀가":
						comeHome();
						break;
						
						case "종료":
						System.out.println("홈서버와 연결을 종료합니다.");
						break;
						break;
						default:
						System.out.println("잘못된 명령입니다.");
					}
					
					}
				}
			else System.out.println("로그인 실패 작동불가");
				
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
public void turnOff(){System.out.println( this.getClass().getName()+": 꺼집니다.");}
public void turnOn() {System.out.println(this.getClass().getName()+": 켜집니다.");}	
}

class Gas extends Fire{
	public void turnOff(){System.out.println(this.getClass().getName()+": 잠금 모드 설정");}
}
class Boiler extends Fire{}
class Light extends Fire{}
class Cooker extends Fire{
	public void turnOn(){System.out.println(this.getClass().getName()+ ": 취사모드 설정");}
}

class Refrigerlator implements Control{
	public void turnOff(){
		System.out.println(this.getClass().getName()+": 꺼지지 않음.");
	}
	public void turnOn(){
		System.out.println(this.getClass().getName()+": 우유 부족함 사오세요.");
	}
}
	
	
	