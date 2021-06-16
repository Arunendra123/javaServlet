package servlet.batch;

import java.util.ArrayList;
import java.util.List;

public class StudentRecord {
	
	private  static StudentRecord obj;
    private List<Student> studentRecords;
    
    public static StudentRecord getObject() {
    	if(obj==null) {
    		    System.out.print("created object...");
    		    StudentRecord sr=new StudentRecord();
    		    sr.setStudentRecords(new ArrayList<Student>());
    	 		return sr;
    	}else {
    		return obj;
    	}
    }
    
	private StudentRecord() {
		super();
	}

	public List<Student> getStudentRecords() {
		return studentRecords;
	}

	public void setStudentRecords(List<Student> studentRecords) {
		this.studentRecords = studentRecords;
	}

	@Override
	public String toString() {
		return "StudentRecord [studentRecords=" + studentRecords + "]";
	}
}
