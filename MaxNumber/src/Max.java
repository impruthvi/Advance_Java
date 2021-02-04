

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Max
 */
@WebServlet("/Max")
public class Max extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Max() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.print("Hello Word");
		String n1=request.getParameter("num1");
		String n2=request.getParameter("num2");
		
		int a,b;
		
		
		a = Integer.parseInt(n1);
		b = Integer.parseInt(n2);
		
		if(a<b) {
			out.print(b);
		}else {
			out.print(a);
		}
		
		
	}

}
