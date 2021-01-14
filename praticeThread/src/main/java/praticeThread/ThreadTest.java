package praticeThread;

class MyThread extends Thread{
	//impements Runnalbe도 가능
	public void run() {
		
		int i;
		
		for(i=0; i<= 200; i++) {
			
			System.out.println(i + "\t");
			
			try {
				
				Thread.sleep(100);
				
			}catch (Exception e) {
				// TODO: handle exception
				
				e.printStackTrace();
			}
		}
		
	}
}

public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//메인쓰레드 먼저 실행
		System.out.println("start");
		MyThread th1 = new MyThread();
		MyThread th2 = new MyThread();
		
		//th1.start();
		//th2.start();
		
		//Mythread ruunner1 =new MyThread();
//		
//		Thread th1 = new Thread(runner1);
//		th1.start();
		
		Thread t = Thread.currentThread();
		
		
		System.out.println(t);
		System.out.println("end");
	}

}
