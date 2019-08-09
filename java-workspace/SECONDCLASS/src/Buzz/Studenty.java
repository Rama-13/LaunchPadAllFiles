package Buzz;

public class Studenty {

	private  int studentid;
	private  String studentName;
	private int fees;
	private int marks;

	public Studenty()
	{
		this.studentid = 0;
		this.studentName = "Idiot";
		this.fees = 0;
		this.marks = 0;
	}

	public Studenty(int studentid, String studentName, int fees, int marks) {
		this();
		this.studentid = studentid;
		this.studentName = studentName;
		this.fees = fees;
		this.marks = marks;
	}

	public Studenty(int studentid, String studentName, int fees) {
		this();
		this.studentid = studentid;
		this.studentName = studentName;
		this.fees = fees;
	}

	public Studenty(int studentid, String studentName) {
		this();
		this.studentid = studentid;
		this.studentName = studentName;
	}

	public static void main(String []args) {

		Studenty student = new Studenty(678, "rama");
		System.out.println(student.studentid + student.studentName);


	}

	

}


