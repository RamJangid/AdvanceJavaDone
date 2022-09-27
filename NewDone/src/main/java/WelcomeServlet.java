
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/WelcomeServlet")
public class WelcomeServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("*********tart doGet***********");
		
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		out.print("<html><body>");
		
		out.print("<h1>Hello, this is Done in Hello Servlet</h1>");
		out.print("<h4>Will be Done</h4>");
		
		out.print("</body></html>");
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		System.out.println("*********Finish doGet***********");
	}


}
