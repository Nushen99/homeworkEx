
public class Student {
	
	public String name;
	public double gpa1;
	public double gpa2;

	Student(String name, double gpa1, double gpa2) {
		this.name = name;
		this.gpa1 = gpa1;
		this.gpa2 = gpa2;
	}
	public double cumulative() {
		return (gpa1 + gpa2)/2;
	}
	public String getName() {
		return name;
	}

}
