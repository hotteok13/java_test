package test.pre1;
import java.util.InputMismatchException;//InputMismatchException 예외처리 클래스
import java.util.Scanner;


public class test1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);//입력
		int n=0,m=0;
		while(true) {
			try {
				System.out.println("곱하고자 하는 두 수의 입력 >>");
				n=scanner.nextInt();
				m=scanner.nextInt();
				break;
			}
			catch(InputMismatchException e) {	//nextInt()로 입력 받은게 정수가 아니면 작동
				System.out.println("실수를 입력하면 아니아니 아니되오!");
				scanner.nextLine();	//토큰 제거
				continue;
			}
		}
		System.out.println(n+"x"+m+"="+n*m);
		scanner.close();
	}

}
