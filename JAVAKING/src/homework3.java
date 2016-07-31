import java.util.Scanner;

public class homework3 {
	public static void main(String[] args) {
		int v1;
		int v2;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫 번째 값을 입력하세요.");
			v1 = scan.nextInt();
		System.out.print("두 번째 값을 입력하세요.");
			v2 = scan.nextInt();
		
		int t1=v1;//만약 fitstvalue보다 lastvalue가 작을 경우 temp1,2에 저장한다음 바꿔치기 하는 과정
		int t2=v2;
		int sum=0;
			if(v1<v2){
				v1 = t2;
				v2 = t1;
				for (int i=v2; i<v1+1; i++){
					sum += i;
			}
		}
		System.out.println("합계" + sum);
		scan.close();

	}		
		
}
