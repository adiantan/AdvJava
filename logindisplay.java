package firstprogram;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Srecice.LoginService;


@WebServlet("/logindisplay")
public class logindisplay extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("username");
		String pasword=request.getParameter("password");
		
		LoginService loginService = new LoginService();
		boolean isValid = loginService.loginCheck(name, pasword);
		
		if(isValid)
			response.sendRedirect("welcome.html");
		else
			response.sendRedirect("login1.html");
		
		
		
	}

	

}
