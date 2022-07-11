package forstprogram;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/PracticServlet")
public class PracticServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	String name=request.getParameter("uname");
	int rollno=Integer.parseInt(request.getParameter("rno"));
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cdac", "root", "cdac");
		PreparedStatement st = conn.prepareStatement ("insert into st_record(name,rollno) values(?,?)");
		st.setString(1, name);
		st.setInt(2, rollno);
		st.executeUpdate();
		conn.close();
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	}

	

}
