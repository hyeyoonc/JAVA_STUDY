package first;

public class BusExam3 {

	public static void main(String[] args) {
		Car4 c = new Bus();
		c.run();
	//	c.ppangppang();
		
		Bus bus = (Bus)c ;
		bus.run();
		bus.ppangppang();
		

	}

}
