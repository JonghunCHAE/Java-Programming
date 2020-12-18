
public class StarShip {
	public static void main(String[] args) {
		System.out.println("별을찍는다 이말이야.");
		for(int i=1; i<4+1; i++) {
			for(int j =0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}
}
