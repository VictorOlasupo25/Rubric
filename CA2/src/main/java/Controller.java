public class Controller {
    ArrayList<Rubric> rubrics;//ArrayList to store new rubrics
	ArrayList<Student> students;//ArrayList to store new students
	Scanner inputReader;
    public Controller() {
        rubrics = new ArrayList<>(); 
		students = new ArrayList<>(); 
		inputReader = new Scanner(System.in);
    }

    public void createRubric() {  // Method that will create a rubric when name of rubric is entered 
		System.out.print("Enter Rubric Name: ");
		Rubric rubric = new Rubric(inputReader.nextLine());
		rubrics.add(rubric);
	}
}

