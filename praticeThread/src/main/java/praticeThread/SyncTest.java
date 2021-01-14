package praticeThread;

import org.omg.CORBA.PUBLIC_MEMBER;

class Bank{
	
	private int money = 10000;
	
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public synchronized void saveMoney(int save) {
		synchronized (this) {
			int m = this.getMoney();
			
			try {
				Thread.sleep((3000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			setMoney(m+ save);
		}
		
		
	}

	public synchronized void minusMoney(int minus){
		int m = this.getMoney();
		
		try {
			Thread.sleep(200);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		setMoney(m - minus);
	}
}


class Park extends Thread{
	
	public void run() {
		
		synchronized (SyncTest.myBank) {

			System.out.println("Start Save");
			SyncTest.myBank.saveMoney(3000);
			System.out.println("save Money: "+ SyncTest.myBank.getMoney());
		}
		
	}
}


class ParkWife extends Thread{
	public void run() {
		
		System.out.println("start Minus");
		SyncTest.myBank.saveMoney(1000);
		System.out.println("minus Money: "+ SyncTest.myBank.getMoney());
		
	}
	
}
public class SyncTest {
	public static Bank myBank = new Bank();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Park p = new Park();
		
		p.start();
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ParkWife pw = new ParkWife();
				
		pw.start();
	}

}
