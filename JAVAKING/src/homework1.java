import java.util.Scanner;

public class homework1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);//Scanner객체 생성
		System.out.print("변환할 문자는?");
			String acode = scan.nextLine();
				if (acode.length() == 0){
					System.out.print("종료합니다.");
					System.exit(0);
				}else{
					int b = acode.charAt(0);
					System.out.print(b);
		}
	}

}