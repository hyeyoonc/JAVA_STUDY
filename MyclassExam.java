package first;

public class MyclassExam {

	public static void main(String[] args) {
		
		MyClass myclass = new MyClass();
		myclass.method1();
		myclass.method2(10);
		myclass.method3();
		int value = myclass.method3();
		System.out.println("method3이 출력한 값" + value);
		myclass.method4(5, 10);
		int value2 = myclass.method5(55);
		System.out.println("m5가 리턴한 값: "+ value2);
		
		

	}

}
