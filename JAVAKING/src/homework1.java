import java.util.Scanner;

public class homework1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);//Scanner媛앹껜 �깮�꽦
		System.out.print("스캐너다스캐너?");
			String acode = scan.nextLine();
				if (acode.length() == 0){
					System.out.print("스캐너다 이말이야.");
					System.exit(0);
				}else{
					int b = acode.charAt(0);
					System.out.print(b);
					System.out.print("hi");
		}
	}

}
