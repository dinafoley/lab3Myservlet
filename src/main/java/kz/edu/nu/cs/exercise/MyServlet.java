package kz.edu.nu.cs.exercise;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
//import java.sql.Date;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = { "/myservlet" })
public class MyServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    static ArrayList<String> serv = new ArrayList<String>();

    public MyServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	
    	Date date = new Date( );
        PrintWriter writer = response.getWriter();
        String a = date +"";
        
    	serv.add(request.getContextPath());
    	serv.add(request.getServerName());
    	serv.add(request.getRequestURI());
    	serv.add(a);
       
    	writer.println(" " + serv);
        
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
