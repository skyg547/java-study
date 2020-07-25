package prob04;

public class Depart extends Employee {
	private String department;
	
	public Depart(String string, int i, String string2) {
		super(string, i);
		department = string2;
	}

	
	public void getInformation() {
		// TODO Auto-generated method stub
		super.getInformation();
		System.out.println("부서:"+department);
	}
	
	
}