package prob02;

public class Book {
	
	private int stateCode = 1;
	// 재고있음 1 0 대여중
	private int bookNum;
	private String bookName;
	private String bookMan;
	

	public Book(int bookNum, String bookName, String bookMan) {
		// TODO Auto-generated constructor stub
		this.bookMan = bookMan;
		this.bookName = bookName;
		this.bookNum = bookNum;		
		stateCode = 1;
	}

	public int getBookNo() {
		// TODO Auto-generated method stub
		return bookNum;
	}

	public void rent() {
		// TODO Auto-generated method stub
		if (stateCode == 0) {
			System.out.println("대여할수없습니다.");
		} else {
			stateCode = 0;
			System.out.println(bookName+"대여 되었습니다.");
		}
	}
	
	public void print() {
		String str = "재고있음";
		if (stateCode == 0) {
			str = "대여중";
			
		}
		System.out.println("책 제목:"+bookName+", 작가:"+bookMan+", 대여 유무:"+str);
	}
	

}
