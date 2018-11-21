import java.io.IOException;
import java.util.Scanner;

class 饜郭{
	//private static Cfunction c = new Cfunction();
	private	int F;
	private int M;
	private int H;
	private int L;
	static int time;
	static int day;
	private boolean D;
	
	Scanner s=new Scanner(System.in);
	Weather W= new Weather();
	
	public 饜郭(){
		F=50;
		M=50;
		H=50;
		L=50;
		time=0;
		day=0;
		
		D=false;
	}
	
	void 鼻鷓轎溘(){
		System.out.println(String.format("          ん虜馬 : %3d                   晦碟  :%3d\n",F,M));
		System.out.println("              ");
		System.out.println(String.format("          勒鬼   : %3d                   韓煽  :%b\n",H,D));
	}
	void Time(){
		if(time%3==0){
			time=0;
			day++;
			System.out.println(day+"橾簞 陳檜 嫩懊棻.");
			System.out.println("螃棺 陳噢朝 "+W.Weather());
		}
		switch(time%3){
			case 0: System.out.println("嬴藹檜棻. 鼠歷擊 й梱?");break;
			case 1: System.out.println("薄褕檜棻. 鼠歷擊 й梱?");break;
			case 2: System.out.println("盪喔檜棻. 鼠歷擊 й梱?");break;
			default: break;
		}
		time++;
		
	}
	int 貲滄(){
		Time();
		System.out.println("1.骯疇ж晦   2.詳檜輿晦   3.啾嬴輿晦   4.�こ蠅炱�");
		//c.gotoxy(10,29);
		int order=s.nextInt();
		return order;
	}
	
	void 擬港(int order)throws IOException, InterruptedException{
		switch(order){
			case 1:
				System.out.println("饜郭諦 骯疇擊 ц棻... ");
				System.out.println("                                              ");
				ん虜馬(-5);晦碟(2);勒鬼(2);擁薑(1);
				System.out.println(HighState()+LowState());
				break;
			case 2:
				System.out.println("饜郭縑啪 詳檜蒂 鍍棻...");
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		System.out.println("忙式式式式式式式式式式式式式式式式式式式式忖\n弛                                        弛\n弛      ~饜郭 酈辦晦~                     弛\n弛                                        弛\n弛                                        弛\n弛                                        弛\n弛〃○ 〃○             1. 啪歜 蝶顫お    弛\n弛〃o w o○             2. 啪歜 撲貲      弛\n弛〃)   (○             3. 啪歜 謙猿      弛\n弛                                        弛\n弛                                        弛\n戌式式式式式式式式式式式式式式式式式式式式戎\n");
		try{Thread.sleep(500);}catch(Exception e){e.printStackTrace();}
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		System.out.println("忙式式式式式式式式式式式式式式式式式式式式忖\n弛                                        弛\n弛                                        弛\n弛                                        弛\n弛                                        弛\n弛                                        弛\n弛〃○ 〃○                               弛\n弛〃o w o○                               弛\n弛〃)   (○                               弛\n弛                                        弛\n弛                                        弛\n戌式式式式式式式式式式式式式式式式式式式式戎\n");
		try{Thread.sleep(500);}catch(Exception e){e.printStackTrace();}
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		System.out.println("忙式式式式式式式式式式式式式式式式式式式式忖\n弛                                        弛\n弛                                        弛\n弛                                        弛\n弛                                        弛\n弛                                        弛\n弛〃○ 〃○                               弛\n弛〃 o wo○                               弛\n弛〃)   (○      *    *    *    *         弛\n弛                                        弛\n弛                                        弛\n戌式式式式式式式式式式式式式式式式式式式式戎\n");
		try{Thread.sleep(300);}catch(Exception e){e.printStackTrace();}
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		System.out.println("忙式式式式式式式式式式式式式式式式式式式式忖\n弛                                        弛\n弛                                        弛\n弛                                        弛\n弛                                        弛\n弛                                        弛\n弛      〃○ 〃○                         弛\n弛      〃 o _o○                         弛\n弛      〃 ) *(○     *    *    *         弛\n弛                                        弛\n弛                                        弛\n戌式式式式式式式式式式式式式式式式式式式式戎\n");
		try{Thread.sleep(300);}catch(Exception e){e.printStackTrace();}
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		System.out.println("忙式式式式式式式式式式式式式式式式式式式式忖\n弛                                        弛\n弛                                        弛\n弛                                        弛\n弛                                        弛\n弛                                        弛\n弛      〃○ 〃○                         弛\n弛      〃 - O-○                         弛\n弛      〃 ) *(○     *    *    *         弛\n弛                                        弛\n弛                                        弛\n戌式式式式式式式式式式式式式式式式式式式式戎\n");
		try{Thread.sleep(300);}catch(Exception e){e.printStackTrace();}
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		System.out.println("忙式式式式式式式式式式式式式式式式式式式式忖\n弛                   A                     弛\n弛                                        弛\n弛                                        弛\n弛                                        弛\n弛                                        弛\n弛      〃○ 〃○                         弛\n弛      〃 - ~-○                         弛\n弛      〃 )  (○     *    *    *         弛\n弛                                        弛\n弛                                        弛\n戌式式式式式式式式式式式式式式式式式式式式戎\n");
		try{Thread.sleep(300);}catch(Exception e){e.printStackTrace();}
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		System.out.println("忙式式式式式式式式式式式式式式式式式式式式忖\n弛                                        弛\n弛                                        弛\n弛                                        弛\n弛                                        弛\n弛                                        弛\n弛      〃○ 〃○                         弛\n弛      〃 o ~o○                         弛\n弛      〃 )  (○     *    *    *         弛\n弛                                        弛\n弛                                        弛\n戌式式式式式式式式式式式式式式式式式式式式戎\n");
		try{Thread.sleep(300);}catch(Exception e){e.printStackTrace();}
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		System.out.println("忙式式式式式式式式式式式式式式式式式式式式忖\n弛                                        弛\n弛                                        弛\n弛                                        弛\n弛                                        弛\n弛                                        弛\n弛            〃○ 〃○                   弛\n弛            〃 o _o○                   弛\n弛            〃 ) *(○    *    *         弛\n弛                                        弛\n弛                                        弛\n戌式式式式式式式式式式式式式式式式式式式式戎\n");
		try{Thread.sleep(300);}catch(Exception e){e.printStackTrace();}
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		System.out.println("忙式式式式式式式式式式式式式式式式式式式式忖\n弛                                        弛\n弛                                        弛\n弛                                        弛\n弛                                        弛\n弛                                        弛\n弛            〃○ 〃○                   弛\n弛            〃 - O-○                   弛\n弛            〃 ) *(○    *    *         弛\n弛                                        弛\n弛                                        弛\n戌式式式式式式式式式式式式式式式式式式式式戎\n");
		try{Thread.sleep(300);}catch(Exception e){e.printStackTrace();}
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		System.out.println("忙式式式式式式式式式式式式式式式式式式式式忖\n弛                                        弛\n弛                                        弛\n弛                                        弛\n弛                                        弛\n弛                                        弛\n弛            〃○ 〃○                   弛\n弛            〃 - ~-○                   弛\n弛            〃 )  (○    *    *         弛\n弛                                        弛\n弛                                        弛\n戌式式式式式式式式式式式式式式式式式式式式戎\n");
		try{Thread.sleep(300);}catch(Exception e){e.printStackTrace();}
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		System.out.println("忙式式式式式式式式式式式式式式式式式式式式忖\n弛                                        弛\n弛                                        弛\n弛                                        弛\n弛                                        弛\n弛                                        弛\n弛            〃○ 〃○                   弛\n弛            〃 o ~o○                   弛\n弛            〃 )  (○    *    *         弛\n弛                                        弛\n弛                                        弛\n戌式式式式式式式式式式式式式式式式式式式式戎\n");
		try{Thread.sleep(300);}catch(Exception e){e.printStackTrace();}
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		System.out.println("忙式式式式式式式式式式式式式式式式式式式式忖\n弛                                        弛\n弛                                        弛\n弛                                        弛\n弛                                        弛\n弛                                        弛\n弛                  〃○ 〃○             弛\n弛                  〃 o _o○             弛\n弛                  〃 ) *(○   *         弛\n弛                                        弛\n弛                                        弛\n戌式式式式式式式式式式式式式式式式式式式式戎\n");
		try{Thread.sleep(300);}catch(Exception e){e.printStackTrace();}
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		System.out.println("忙式式式式式式式式式式式式式式式式式式式式忖\n弛                                        弛\n弛                                        弛\n弛                                        弛\n弛                                        弛\n弛                                        弛\n弛                  〃○ 〃○             弛\n弛                  〃 - O-○             弛\n弛                  〃 ) *(○   *         弛\n弛                                        弛\n弛                                        弛\n戌式式式式式式式式式式式式式式式式式式式式戎\n");
		try{Thread.sleep(300);}catch(Exception e){e.printStackTrace();}
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		System.out.println("忙式式式式式式式式式式式式式式式式式式式式忖\n弛                                        弛\n弛                                        弛\n弛                                        弛\n弛                                        弛\n弛                                        弛\n弛                  〃○ 〃○             弛\n弛                  〃 - ~-○             弛\n弛                  〃 )  (○   *         弛\n弛                                        弛\n弛                                        弛\n戌式式式式式式式式式式式式式式式式式式式式戎\n");
		try{Thread.sleep(300);}catch(Exception e){e.printStackTrace();}
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		System.out.println("忙式式式式式式式式式式式式式式式式式式式式忖\n弛                                        弛\n弛                                        弛\n弛                                        弛\n弛                                        弛\n弛                                        弛\n弛                  〃○ 〃○             弛\n弛                  〃 o ~o○             弛\n弛                  〃 )  (○   *         弛\n弛                                        弛\n弛                                        弛\n戌式式式式式式式式式式式式式式式式式式式式戎\n");
		try{Thread.sleep(300);}catch(Exception e){e.printStackTrace();}
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		System.out.println("忙式式式式式式式式式式式式式式式式式式式式忖\n弛                                        弛\n弛                                        弛\n弛                                        弛\n弛                                        弛\n弛                                        弛\n弛                        〃○ 〃○       弛\n弛                        〃 o _o○       弛\n弛                        〃 ) *(○       弛\n弛                                        弛\n弛                                        弛\n戌式式式式式式式式式式式式式式式式式式式式戎\n");
		try{Thread.sleep(300);}catch(Exception e){e.printStackTrace();}
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		System.out.println("忙式式式式式式式式式式式式式式式式式式式式忖\n弛                                        弛\n弛                                        弛\n弛                                        弛\n弛                                        弛\n弛                                        弛\n弛                        〃○ 〃○       弛\n弛                        〃 - O-○       弛\n弛                        〃 ) *(○       弛\n弛                                        弛\n弛                                        弛\n戌式式式式式式式式式式式式式式式式式式式式戎\n");
		try{Thread.sleep(300);}catch(Exception e){e.printStackTrace();}
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		System.out.println("忙式式式式式式式式式式式式式式式式式式式式忖\n弛                                        弛\n弛                                        弛\n弛                                        弛\n弛                                        弛\n弛                                        弛\n弛                        〃○ 〃○       弛\n弛                        〃 - ~-○       弛\n弛                        〃 )  (○       弛\n弛                                        弛\n弛                                        弛\n戌式式式式式式式式式式式式式式式式式式式式戎\n");
		try{Thread.sleep(300);}catch(Exception e){e.printStackTrace();}
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		System.out.println("忙式式式式式式式式式式式式式式式式式式式式忖\n弛                                        弛\n弛                                        弛\n弛                                        弛\n弛                                        弛\n弛                                        弛\n弛                        〃○ 〃○       弛\n弛                        〃 o ~o○       弛\n弛                        〃 )  (○       弛\n弛                                        弛\n弛                                        弛\n戌式式式式式式式式式式式式式式式式式式式式戎\n");
		try{Thread.sleep(500);}catch(Exception e){e.printStackTrace();}
				System.out.println("                                              ");
				ん虜馬(8);晦碟(2);擁薑(1);
				System.out.println(HighState()+LowState());
				break;
			case 3:
				System.out.println("饜郭諦 啾嬴輿歷棻... ");
				System.out.println("                                              ");
				ん虜馬(-10);晦碟(4);勒鬼(-5);擁薑(2);
				System.out.println(HighState()+LowState());
				break;
			case 4:
				System.out.println("�こ藝� 衛儷棻... ");
				System.out.println("                                              ");
				ん虜馬(-10);晦碟(-10);勒鬼(1);
				System.out.println(HighState()+LowState());
				break;
			default:
				System.out.println("1~4 摹鷗");
				time--;
				擬港(貲滄());
				break;
		}
	}
	int Full(){return F;}
	int Mood(){return M;}
	int Health(){return H;}
	int Love(){return L;}
	
	//鼻鷓高 滲��
	void ん虜馬(int a){
		F=intCheck(F,a);
		if(intLow(F)){
			System.out.println("寡陛 衙辦 堅Щ棻.");
			晦碟(-10);
			勒鬼(-10);
			擁薑(-10);
		}
		
	}
	void 晦碟(int a){
		M=intCheck(M,a);
		if(intLow(M)){
			System.out.println("晦碟檜 跪衛 釭際棻.");
			擁薑(-10);
		}
	}
	void 勒鬼(int a){
		H=intCheck(H,a);
		if(intLow(H)){
			System.out.println("勒鬼檜 寰謠棻.");
			晦碟(-10);
			擁薑(-5);
		}
		if(H*Math.random()<0.5){
			D=true;
			韓煽();
		}
	}
	void 擁薑(int a){
		H=intCheck(H,a);
	}
	void 韓煽(){
		System.out.println("饜郭陛 煽縑 勘溜棻.");
	}
	void 避擠(){
		System.out.println("饜郭陛 避歷棻...");
	}
	String HighState(){
		if(intMax()==F)
			return "寡陛 碳楝爾檜堅, ";
		else if(intMax()==M)
			return "晦碟檜 謠嬴爾檜堅, ";
		else
			return "勒鬼п 爾檜堅, ";
	}
	String LowState(){
		if(intMin()==F)
			return "寡陛 堅Ъ匙偽棻.";
		else if(intMin()==M)
			return "晦碟檜 雌匙偽棻.";
		else
			return "勒鬼檜 謠雖 彊擎匙偽棻.";
	}	
	int intCheck(int A,int B){//0~100 っ滌
		A+=B;
		if(A>100)
			return 100;
		else if(A<0)
			return 0;
		else
			return A;
	}
	boolean intLow(int A){//鼻鷓高檜 30嘐虜檜賊 true
			if(A<30)
				return true;
			else
				return false;
	}
	int intMax(){//陛濰 堪擎 鼻鷓高
		int i=100;
		for(i=100;i>=0;i--){
			if(i==F||i==H||i==M)
				break;
		}
		return i;
	}
	int intMin(){//陛濰 雪擎 鼻鷓高
		int i=0;
		for(i=0;i<=100;i++){
			if(i==F||i==H||i==M)
				break;
		}
		return i;
	}
}