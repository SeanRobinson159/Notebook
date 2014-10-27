package notebook;
/**
 * 
 * @author Sean Robinson
 *
 */

public class Notebook{
	private String notebookName;
	private int numberOfSubjects;
	/**
	 * Constructors: () and (String, int)
	 */
	public Notebook(){
		notebookName = null;
		numberOfSubjects = -1;
	}
	
	public Notebook(String notebookName, int numberOfSubjects){
		this.notebookName =  notebookName;
		this.numberOfSubjects = numberOfSubjects;
	}

	public String getNotebookName() {
		return notebookName;
	}

	public void setNotebookName(String notebookName) {
		this.notebookName = notebookName;
	}

	public int getNumberOfSubjects() {
		return numberOfSubjects;
	}

	public void setNumberOfSubjects(int numberOfSubjects) {
		this.numberOfSubjects = numberOfSubjects;
	}
	
	

}
