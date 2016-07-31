import java.util.Scanner;

public class homework4 {
	public static void main(String[] args) {
		int fv;
		int lv;
		int i=1;
		int GCD = i;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫 번째 수를 입력하세요.");
			fv = scan.nextInt();
		System.out.print("두 번째 수를 입력하세요.");
			lv = scan.nextInt();
		
		int t1 = fv;//만약 fitstvalue보다 lastvalue가 작을 경우 temp1,2에 저장한다음 바꿔치기 하는 과정
		int t2 = lv;
			if(fv<lv){
				fv = t2;
				lv = t1;
			}
			
			while(i>0) { //최대공약수 GCD를 구해서 입력하는 과정
				i = fv % lv;
				fv = lv;
				lv = i;
				i = GCD;
				System.out.println(GCD);
		}
		scan.close();	
	}
	
}
