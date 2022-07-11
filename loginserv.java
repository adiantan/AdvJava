package firstprogram;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/loginserv")
public class loginserv extends HttpServlet {
	
       
    
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name= request.getParameter("username");
		String email=request.getParameter("email");
		int mobileno= Integer.parseInt(request.getParameter("mobileno"));
		int password=Integer.parseInt(request.getParameter("password"));
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cdac", "root", "cdac");
			PreparedStatement st = conn.prepareStatement ("insert into customer(name, email, mobileno,  password) values(?, ?, ?, ?)");
			st.setString(1, name); //substituting ? with actual value
			st.setString(2, email);
			st.setInt(3, mobileno);
			st.setInt(4, password);
			st.executeUpdate();
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		PrintWriter out = response.getWriter();
		out.write("<html><body>");
		out.write("<h1>Registration successful!</h1>");
		out.write("</body></html>");
		
		
		
	}

	

}
