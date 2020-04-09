import java.util.ArrayList;
import java.util.List;

public class Faculty {
	String facultyName;
	List<Student> studentList;
	public Faculty(String name) {
		this.facultyName = name;
		this.studentList = new ArrayList<Student>();
	}
	public void addStudent(Student s) {
		this.studentList.add(s);
	}
	public void removeStudent(Student s) {
		this.studentList.remove(s);
	}
	public double facultyAvergae() {
		double avg=0;
		for(Student student : studentList) {
			avg+=student.getAverage();
		}
		return (avg/this.studentList.size());
	}

}
