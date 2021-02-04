

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Home_Cookie
 */
@WebServlet("/Home_Cookie")
public class Home_Cookie extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Home_Cookie() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String a = request.getParameter("cookes");
		
		out.print("Welcome to home page"+" " + a+"</br>");
		
		out.print("<a href='Home_Cookie\'>Home_Cookie</a><br>"+"<a href='Secound_page\'>Page 2</a><br>");
		Cookie c = new Cookie("username",a);
		
		response.addCookie(c);
		
	}

}
