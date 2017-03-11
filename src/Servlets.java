import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
/**
 * Created by Joel on 3/11/2017.
 */
//extends HttpServlet Class
public class Servlets extends HttpServlet {
// method of handling Get method request from server
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws ServletException, IOException
    {
        response.setIntHeader("Refresh", 5);

        response.setContentType("text/html");

        Calendar calendar = new GregorianCalendar();

        int hour = calendar.get(Calendar.HOUR);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);

        String time = hour+":"+ minute +":"+ second;

        PrintWriter out = response.getWriter();
        String title = "Auto Page Refresh using Servlet";
        String docType =
                "<!doctype html public \"-//w3c//dtd html 4.0 " +
                        "transitional//en\">\n";
        out.println(docType +
                "<html>\n" +
                "<head><title>" + title + "</title></head>\n"+
                "<body bgcolor=\"#f0f0f0\">\n" +
                "<h1 align=\"center\">" + title + "</h1>\n" +
                "<p>Current Time is: " + time + "</p>\n");
    }
// method of handling Post method request to post to server

    public void doPost(HttpServletRequest request,
                       HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
