package modifier;

class Box {
	
	static int boxID = 0;
	int idNum = 0;
	
	public void increase() {
		boxID++;
		idNum++;
	}
}


public class Ex02 {

	public static void main(String[] args) {
		
		Box box1 = new Box();
		Box box2 = new Box();
		Box box3 = new Box();
		
		box1.increase();
		System.out.println("boxID: " + box1.boxID);
		System.out.println("idNum: " + box1.idNum);
		System.out.println();
		
		box2.increase();
		System.out.println("boxID: " + box1.boxID);
		System.out.println("idNum: " + box1.idNum);
		System.out.println();
		
		box3.increase();
		System.out.println("boxID: " + box1.boxID);
		System.out.println("idNum: " + box1.idNum);
		System.out.println();
		
		// 인스턴스 변수는 객체마다 공유되지 않는다.
		// static 변수는 모든 객체가 공유된다.
		System.out.println("boxID는: " + Box.boxID );
		// 정적필드는 원칙적으로 클래스명으로 접근 
		
		
	}

}
