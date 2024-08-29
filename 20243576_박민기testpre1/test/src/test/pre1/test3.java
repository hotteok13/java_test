package test.pre1;
import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		String n="";
		while(true) {
			System.out.print("가위 바위 보!>>");
			n = scanner.next();
			if(n.equals("그만")) {//n이 "그만"인지 확인하는 String내에 있는 함수
				System.out.println("게임을 종료합니다...");
				break;
			}
			String []str= {"가위","바위","보"};
			int rand=(int)(Math.random()*3);//랜덤 값 0~2
			if(str[rand].equals("가위")) {
				
				if(n.equals("가위")) {
					System.out.println("사용자 = "+n+", 컴퓨터 = "+str[rand]+", 비겼습니다.");
				}
				else if(n.equals("바위")) {
					System.out.println("사용자 = "+n+", 컴퓨터 = "+str[rand]+", 사용자가 이겼습니다.");
				}
				else if(n.equals("보")){
					System.out.println("사용자 = "+n+", 컴퓨터 = "+str[rand]+", 컴퓨터가 이겼습니다.");
				}
			}
			else if(str[rand].equals("바위")) {
				if(n.equals("바위")) {
					System.out.println("사용자 = "+n+", 컴퓨터 = "+str[rand]+", 비겼습니다.");
				}
				else if(n.equals("보")) {
					System.out.println("사용자 = "+n+", 컴퓨터 = "+str[rand]+", 사용자가 이겼습니다.");
				}
				else if(n.equals("가위")) {
					System.out.println("사용자 = "+n+", 컴퓨터 = "+str[rand]+", 컴퓨터가 이겼습니다.");
				}
			}
			else if(str[rand].equals("보")) {
				if(n.equals("보")) {
					System.out.println("사용자 = "+n+", 컴퓨터 = "+str[rand]+", 비겼습니다.");
				}
				else if(n.equals("가위")) {
					System.out.println("사용자 = "+n+", 컴퓨터 = "+str[rand]+", 사용자가 이겼습니다.");
				}
				else if(n.equals("바위")) {
					System.out.println("사용자 = "+n+", 컴퓨터 = "+str[rand]+", 컴퓨터가 이겼습니다.");
				}
			}
			
		}
		scanner.close();
	}

}
