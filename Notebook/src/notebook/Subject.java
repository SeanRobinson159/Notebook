package notebook;

public class Subject extends Notebook{
	private String subjectName;
	
	public Subject(){
		this.subjectName = null;
	}
	public Subject(String subjectName){
		this.subjectName = subjectName;
	}
	
	
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	
	

}
