package modifier;

class Person {
	
	static final String NATION = "KOREA";
	//정적 불변의 상수
	// 역할: 공용 데이터
	
	final String SSN;
	// 불변의 인스턴스 상수 
	
	String name;
	
	public Person(String ssn, String name) {
		this.SSN = ssn;
		this.name = name;
	}
	
}

public class Ex06 {

	public static void main(String[] args) {
		
		Person person = new Person("123456-1234567", "홍길동");
		
		System.out.println(Person.NATION);
		System.out.println(person.SSN);
		System.out.println(person.name);
		System.out.println();
		// 상수는 절대로 한번만 초기화 가능하고 수정이 안된다.
		//Person.NATION = "USA";
		//person.ssN = "111111-2222222";
		person.name = "홍길순";
		// static final(정적불변) 및 final(불변) 수정 불가 
		// name은 수정 가능
		
		System.out.println(Person.NATION);
		System.out.println(person.SSN);
		System.out.println(person.name);
		
		// 보통 프로그래밍에서 상수라는 용어는 static final 이다. 

	}

}
