package first;

public class ExceptionExam {

	public static void main(String[] args) {
		int i = 10;
		int j = 5;
		try {
		int k = i/ j;
		System.out.print(k);
		}catch(ArithmeticException e) {
			
			System.out.print("0���� ���� �� �����ϴ�."+e.toString());
		}finally {
			System.out.print("������ �߻��ߵ� ���ߵ� ������ ����");
		}
		
		System.out.print("main end");
		

	}

}
