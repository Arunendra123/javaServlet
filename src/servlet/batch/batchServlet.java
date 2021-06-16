package servlet.batch;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class batchServlet extends HttpServlet {

	private static final long serialVersionUID = 2978109444209893606L;

	@Override
    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
    	Student st=new Student();
    	st.setName(req.getParameter("name"));
    	st.setRollNo(Integer.parseInt(req.getParameter("rollno")));
    	StudentRecord.getObject().getStudentRecords().add(st);
    	
    	//response...............................................
    	PrintWriter out=res.getWriter();
    	out.println("Student Name : "+st.getName());
        out.println("Student RollNo : "+st.getRollNo());
    	out.print("Record added...");
    	//.......................................................
    }
	
	@Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
    	Student st=new Student();
    	st.setName(req.getParameter("name"));
    	st.setRollNo(Integer.parseInt(req.getParameter("rollno")));
    	StudentRecord.getObject().getStudentRecords().add(st);
    	
    	//response...............................................
    	PrintWriter out=res.getWriter();
    	out.println("Student Name : "+st.getName());
        out.println("Student RollNo : "+st.getRollNo());
    	out.print("Record added...");
    	//.......................................................
    }
	
	@Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
    	Student st=new Student();
    	st.setName(req.getParameter("name"));
    	st.setRollNo(Integer.parseInt(req.getParameter("rollno")));
    	StudentRecord.getObject().getStudentRecords().add(st);

    	//response...............................................
    	PrintWriter out=res.getWriter();
    	out.println("Student Name : "+st.getName());
        out.println("Student RollNo : "+st.getRollNo());
    	out.print("Record added...");
    	//.......................................................
    }
}
