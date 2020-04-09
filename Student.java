import java.util.List;

class Student {
	String index;
	String firstName;
	String lastName;
	List<Integer> grades;
	public Student(String index, String firstName, String lastName, List<Integer> grades) {
		this.index = index;
		this.firstName = firstName;
		this.lastName = lastName;
		this.grades = grades;
	}
	
	public String getIndex() {
		return index;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public List<Integer> getGrades() {
		return grades;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setGrades(List<Integer> grades) {
		this.grades = grades;
	}

	public double getAverage() {
		double avg=0,c=0;
		for(int grade : grades) {
			avg+=grade;
			c++;
		}
		return (avg/c);
	}

	public int ECTSCredits() {
		int ects=0;
		for(int grade: grades) {
			if(grade>5) {
				ects+=6;
			}
		}
		return ects;
	}
}