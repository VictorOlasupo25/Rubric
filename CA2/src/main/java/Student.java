
import java.util.ArrayList;
import java.util.List;


public class Student {
	private ArrayList<Grade> grades; //Arraylist of grades
	private String name;

	public Student(String name) {
		this.name = name;
		this.grades = new ArrayList<>();
	}

	public ArrayList<Grade> getGrades() {
		return grades;
	}

	public String getName() {
		return name;
	}
	
	public Grade getGradeByRubric(Rubric rubric) {  // Grade can only be displayed when Rubric name is entered 
		for(Grade grade : grades) {
			if(grade.getRubric().equals(rubric)) {
				return grade;
			}
		}
		return null;
	}

}