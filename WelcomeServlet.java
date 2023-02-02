package Programming;

import java.io.IOException;  
import java.io.PrintWriter;  
  
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
  


public class WelcomeServlet extends HttpServlet 
{  
protected void doPost(HttpServletRequest request, HttpServletResponse response)  
    throws ServletException, IOException {  
  
    //response.setContentType("text/html");  
    //PrintWriter out = response.getWriter();  
          
    String uname=request.getParameter("un");  
    
    String pws =request.getParameter("pw");
    
    PrintWriter out = response.getWriter();
   // out.print("Welcome "+n);  
    
    out.print("<html><body>"+"<h1>Welcome to new page"
    +" "+uname+""+" "+"</h1></body></html>");
          
   // out.close();  
    }  
  
}  


