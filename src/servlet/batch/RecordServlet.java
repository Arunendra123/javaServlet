package servlet.batch;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RecordServlet extends HttpServlet {

	private static final long serialVersionUID = 2978109444209893606L;

	@Override
    public void service(HttpServletRequest req, HttpServletResponse res) {
    	for(Student st: StudentRecord.getObject().getStudentRecords()) {
    		System.out.println("Student Name :"+st.getName());
    		System.out.println("Student RollNo :"+st.getRollNo());
    	}
    	System.out.print("Record added...");
    }
}
