package first;

public class EnumExam {
	public static final String Male = "MALE";
	public static final String FEMALE = "FEMALE";
	
	
	public static void main(String[] args) {
		String gender1;
		gender1 = EnumExam.Male;
		gender1 = EnumExam.FEMALE;
		
		gender1 = "boy";

	}

}

enum Gender{
	MALE,FEMALE;
}