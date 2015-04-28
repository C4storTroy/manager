package nz.co.c4stortroy.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/search")
public class SearchCompany extends HttpServlet {
    protected void doGet(HttpServletRequest request,
	    HttpServletResponse response)
		    throws ServletException, IOException {

	PrintWriter writer = response.getWriter();
	writer.println( "<html><body>");
	writer.println( "Result: <br/>");
	writer.println( "</body></html>");
    }
}
