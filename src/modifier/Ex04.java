package modifier;

import java.util.Scanner;

// Ticket 클래스를 만든다.
// 필드는 private static int seatNumber = 10; 이다.
// mainMachine 메소드가 있다.
// mainMachine 메소드는 티켓을 구입하는 메소드이다. 
// 매개변수로 티켓 수를 받아 좌석이 티켓 수 만큼 줄어들게 해주세요.


class Ticket {
	
	private static int seatNumber = 10;
	
	public void mainMachine(int ticketSu) {
		
		if( ticketSu > seatNumber ) {
			System.out.println("현재 남은 좌석 수는: " + seatNumber + "입니다.");
			System.out.println("티켓을 구입할 수 없습니다.");
			return;
		}
		
		seatNumber -= ticketSu;
		System.out.println("현재 남은 좌석 수는: " + seatNumber + "입니다.");
		
		if(seatNumber == 0) {
			System.out.println("티켓이 모두 소진되었습니다.");
			System.out.println("시스템을 종료합니다.");
			System.exit(0);
		}
		
	}
}


public class Ex04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Ticket ticketMachine1 = new Ticket();
		Ticket ticketMachine2 = new Ticket();
		
		while(true) {
			
			System.out.println("1.첫번째 티켓머신 2.두번째 티켓머신 3.종료");
			
			int choice = scan.nextInt();
			
			if(choice ==1) {
				System.out.println("티켓 구입 수: ");
				int su = scan.nextInt();
				ticketMachine1.mainMachine(su);
	
			}else if (choice == 2) {
				System.out.println("티켓 구입 수: 2");
				int su = scan.nextInt();
				ticketMachine1.mainMachine(su);
				
			}else if (choice == 3) {
				System.out.println("티켓 프로그램을 종료합니다.");
				System.exit(0);
			
			}else {
				System.out.println("잘못 입력 하였습니다.");
			}
		}

	}

}
