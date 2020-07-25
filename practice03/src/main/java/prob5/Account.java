package prob5;

public class Account {
	private String accountNO;
	private int balance;
	
	public Account(String string) {
		// TODO Auto-generated constructor stub
		accountNO = string;
		System.out.println(accountNO+" 계좌가 개설되었습니다.");
	}
	
	public String getAccountNO() {
		return accountNO;
	}
	public void setAccountNO(String accountNO) {
		this.accountNO = accountNO;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void save(int i) {
		// TODO Auto-generated method stub
		balance += i;
		System.out.println(accountNO+"계좌에"+ i +"만원 입금되습니다.");
	}

	public void deposit(int i) {
		// TODO Auto-generated method stub
		balance -= i;
		System.out.println(accountNO+"계좌에"+ i +"만원 출금되습니다.");
		
		
	}
	
}