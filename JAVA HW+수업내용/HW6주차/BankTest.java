class BankAccount{
	private String owner;
	private int accountNumber;
	private int balance;
	public void deposit(int a){
		balance+=a;
	}
	public void withdraw(int a){
		balance-=a;
	}
	public String getMoney(){
		return "현재 잔액는"+balance+ "원 입니다.";
	}
}
class BankTest{
	public static void main(String []args){
		BankAccount b = new BankAccount();
		b.deposit(10000);
		System.out.print(b.getMoney());
		b.withdraw(5000);
		System.out.print(b.getMoney());
	}
}