import java.util.Scanner;
 
 
public class homework2 {
 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //System.in은기본입력장치
			System.out.println("단을입력하세요");
				int dan = scan.nextInt();//next는으로리턴받고여러타입에따라다만들어짐
			System.out.println();
				for(int i=0; i<dan*2; i++) {
					int blank = (dan-i) > 0 ? (dan-i) : -(dan-i);
					for(int j=0; j<blank; j++) {
						System.out.print(" ");
						}
				for(int j=0; j<2*(dan-blank)-1; j++){
					System.out.print("*");
					}
			System.out.println();
			scan.close();
		}
 
	}
}