

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Secound_page
 */
@WebServlet("/Secound_page")
public class Secound_page extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Secound_page() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		Cookie ck[] = request.getCookies();
		
		
//		for more then 1 cookie
//		for(int i = 0;i<ck.length;i++) {
//			out.print("<br>"+ck[i].getName()+" "+ck[i].getValue());
//		}
		
		

		out.print("<a href='Home_Cookie\'>Home_Cookie</a><br>"+"<a href='Secound_page\'>Page 2</a><br>");
		out.print("welcome Secound_page"+" " + ck[0].getValue());
	}

}
