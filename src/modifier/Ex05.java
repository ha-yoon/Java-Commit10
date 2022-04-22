package modifier;

public class Ex05 {

	static {
		System.out.println("static 블록");
		System.out.println("static 필드 초기화역할");
	}
	
	{
		System.out.println("인스턴스 블록");
		System.out.println("객체 생성시 호출되어 초기화 역할!");
	}
	
	public Ex05() {
		System.out.println("생성자");
		System.out.println("객체 생성시 호출되어 초기화 역할!");
	}
	
	public static void main(String[] args) {

		System.out.println("메인 메소드 시작!");
		
		Ex05 ex1 = new Ex05();
		
		System.out.println();
		
		Ex05 ex2 = new Ex05();
		
		System.out.println("메인 메소드 끝!");
	}

}
