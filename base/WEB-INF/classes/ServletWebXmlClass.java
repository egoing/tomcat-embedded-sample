import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class ServletWebXmlClass extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");// setting the content type
		PrintWriter pw = res.getWriter();// get the stream to write the data

//writing html in the stream  
		pw.println("<html><body>");
		pw.println("<h1>Welcome to ServletWebXmlClass</h1>");
		pw.println("<ul>\n" + 
				"		<li><a href=\"/app/\">JSP</a></li>\n" + 
				"		<li><a href=\"/app/servlet-web-xml\">web.xml</a></li>\n" + 
				"		<li><a href=\"/app/servlet-addservlet\">addServlet</a></li>\n" + 
				"	</ul>");
		pw.println("</body></html>");

		pw.close();// closing the stream
	}
}