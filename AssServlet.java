package firstprogram;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AssServlet")
public class AssServlet extends HttpServlet {
	
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int i1=Integer.parseInt(request.getParameter("num1"));
		int i2=Integer.parseInt(request.getParameter("num2"));
		
		if(request.getParameter("add1")!=null) {
			int res1=i1+i2;
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			
			out.write("<html><body>");
			out.write("<h1>Addition</h1>");
			out.write("<h1>"+res1+"</h1>");
			out.write("<body><html>");
			
		}else if(request.getParameter("div1")!=null){
			int res2=i1 - i2;
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.write("<html><body>");
			out.write("<h1>Divison</h1>");
			out.write("<h1>"+res2+"</h1>");
			out.write("<body><html>");
			
		}else if(request.getParameter("mult")!=null){
			int res3=i1 * i2;
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.write("<html><body>");
			out.write("<h1>Multiplication</h1>");
			out.write("<h1>"+res3+"</h1>");
			out.write("<body><html>");
			
		
		} else if(request.getParameter("div2")!=null){
		int res4 = i1 / i2;
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.write("<html><body>");
		out.write("<h1>Division</h1>");
		out.write("<h1>"+res4+"</h1>");
		out.write("<body><html>");
		
	}else {
		int res1 = i1 + i2;
		int res2 = i1 - i2;
		int res3 = i1 * i2;
		int res4 = i1 / i2;
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.write("<html><body>");
		out.write(" <h1>Addition</h1>");
		out.write("<h1>" + res1 + "</h1>");
		out.write("</body></html>");
		out.write("<html><body>");
		out.write(" <h1>Substraction</h1>");
		out.write("<h1>" + res2 + "</h1>");
		out.write("</body></html>");
		out.write("<html><body>");
		out.write(" <h1>Multiplicaton</h1>");
		out.write("<h1>" + res3 + "</h1>");
		out.write("</body></html>");
		out.write("<html><body>");
		out.write(" <h1>Division</h1>");
		out.write("<h1>" + res4 + "</h1>");
		out.write("</body></html>");

	}
		
}
}
