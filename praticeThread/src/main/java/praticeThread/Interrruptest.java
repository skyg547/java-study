package praticeThread;

public class Interrruptest extends Thread {
	public void run() {
		
		int i;
		for(i=0; i<100; i++) {
			
			System.out.println(i);
		}
		
		try {
			sleep(5000);
			
		}catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println(e);
			System.out.println("wake!!");
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interrruptest test = new Interrruptest();
		test.start();
		test.isInterrupted();
		System.out.println("end");
	}

}
