import java.util.ArrayList;
import java.util.Scanner;
public class Controller {
    ArrayList<Rubric> rubrics;//ArrayList to store new rubrics
	//ArrayList<Student> students;//ArrayList to store new students
	Scanner inputReader;
    public Controller() {
        rubrics = new ArrayList<>(); 
		//students = new ArrayList<>(); 
		inputReader = new Scanner(System.in);
    }
    
    public int getMenuChoice() {  // Menu options
		System.out.println("1. Create Rubric");
		System.out.println("2. Add Criterion");
		System.out.println("3. Add Student");
		System.out.println("4. Add Grade");
		System.out.println("5. Display Rubric");
		System.out.println("6. Display Rubric Statistics");
		System.out.println("7. Display Criterion Statistics");
		System.out.println("8. Exit");
		int option = inputReader.nextInt();
		inputReader.nextLine();
		return option;
	}

    public void createRubric() {  // Method that will create a rubric when name of rubric is entered 
		System.out.print("Enter Rubric Name: ");
		Rubric rubric = new Rubric(inputReader.nextLine());
		rubrics.add(rubric);
	}
    
    public Rubric getRubricByName(String rubricName) {  //Get rubric if  name entered matches rubric name saved in array
		for (Rubric rubric : rubrics) {
			if (rubric.getName().equals(rubricName)) {
				return rubric;
			}
		}
		return null;
	}
    
    public void addCriterion() { //Add a critation to any rubric created. Rubric name must be verified first
		System.out.print("Enter Rubric Name: ");
		Rubric rubric = getRubricByName(inputReader.nextLine());

		if (rubric == null) {
			System.err.println("No rubric found with this name");
			return;
		}

		System.out.println("Enter Criterion Name");
		rubric.getCriterion().add(inputReader.nextLine());
	}
    
    public static void main(String[] args) {

		int option = -1;
		Controller controller = new Controller();
		do {
			option = controller.getMenuChoice();

			switch (option) {
			case 1:
				controller.createRubric();
				break;
			case 2:
				controller.addCriterion();
				break;
			case 3:
				//controller.addStudent();
				break;
			case 4:
				//controller.addGrade();
				break;
			case 5:
				//controller.displayRubric();
				break;
			case 6:
				//controller.displayRubricStats();;
				break;
			case 7:
				//controller.displayCriteriaStats();
				break;
			case 8:
				break;
			}
		} while (option != 8);

		controller.inputReader.close();
	}
}

