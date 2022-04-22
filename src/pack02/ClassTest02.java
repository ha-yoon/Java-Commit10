package pack02;

import pack01.A; // pack01에서 A를 가져오다.
//import pack01.B; // 똑같이 pack01에 있는 B는 가져올 수 없음(default)

public class ClassTest02 {

	public static void main(String[] args) {
	
		A a = new A();
		System.out.println("클래스 A의 x: " + a.x);

		//B b = new B(); // import 자체가 안됨 
	}

}
