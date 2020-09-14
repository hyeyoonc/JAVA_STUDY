package first;

public class ExceptionExam2 {

	public static void main(String[] args) {
		int i = 10;
		int j = 0;
		try {
		int k = divide(i,j);
		System.out.print(k);
		}catch(Exception e) {
			System.out.print(e.toString());
		}

	}

	
	public static int divide(int i , int j) throws Exception{
		int k = i/j;
		return k;
		
		
		
	}
	
	
}
