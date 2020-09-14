package first;

public class ExceptionExam {

	public static void main(String[] args) {
		int i = 10;
		int j = 5;
		try {
		int k = i/ j;
		System.out.print(k);
		}catch(ArithmeticException e) {
			
			System.out.print("0으로 나눌 수 없습니다."+e.toString());
		}finally {
			System.out.print("오류가 발생했든 안했든 무조건 실행");
		}
		
		System.out.print("main end");
		

	}

}
