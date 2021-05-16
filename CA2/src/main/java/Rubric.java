import java.util.ArrayList;

public class Rubric {
	
	private String name;
	private ArrayList<String> criterion;
	
	
	public Rubric(String name) {
		this.name = name;
		criterion = new ArrayList<>();
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public ArrayList<String> getCriterion() {
		return criterion;
	}


	public void setCriterion(ArrayList<String> criterion) {
		this.criterion = criterion;
	}
	
	@Override
	public String toString() {
		String toString = String.format("%25s", " ");
		for(String criteria : criterion) {
			toString += String.format("%25s", criteria);
		}
		return toString.trim();
	}
}
