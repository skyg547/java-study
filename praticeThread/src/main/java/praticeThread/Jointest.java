package praticeThread;

public class Jointest extends Thread{

	int start;
	int end;
	int total;
	
	public Jointest(int start, int end) {
		
		this.start = start;
		this.end = end;
		
	}
	
	public void run() {
		int i;
		for(i=start; i<= end; i++) {
			
			total += i;
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jointest jt1 = new Jointest(1,50);
		Jointest jt2 = new Jointest(51, 100);
		
		jt1.start();
		jt2.start();
		
		try {
			jt1.join();
			jt2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int total = jt1.total + jt2.total;
		
		System.out.println("jt1.total = " + jt1.total);
		System.out.println("jt2.total = " + jt2.total);
		
		System.out.println(total);
		
	}

}
