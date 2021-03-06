import java.util.ArrayList;

public class Grade {

	private ArrayList<Integer> grades;
	private Rubric rubric;
	public Grade(Rubric rubric) {
		this.rubric = rubric;
		this.grades = new ArrayList<>();
	}
	public ArrayList<Integer> getGrades() {
		return grades;
	}
	public void setGrades(ArrayList<Integer> grades) {
		this.grades = grades;
	}
	public Rubric getRubric() {
		return rubric;
	}
	public void setRubric(Rubric rubric) {
		this.rubric = rubric;
	}
	
	@Override
	public String toString() {
		String toString = String.format("%25s", " ");
		for(Integer grade : grades) {
			toString += String.format("%25d", grade);
		}
		return toString.trim();
	}
	
	
	
}