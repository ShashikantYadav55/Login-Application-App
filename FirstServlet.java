package Programming;

import java.io.IOException;  
import java.io.PrintWriter;  
  
import javax.servlet.RequestDispatcher;  
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
  
  
public class FirstServlet extends HttpServlet {  
public void doPost(HttpServletRequest request, HttpServletResponse response)  
        throws ServletException, IOException {  
  
    //response.setContentType("text/html");  
    //PrintWriter out = response.getWriter();  
          
    String uname=request.getParameter("un");  
    String pword=request.getParameter("pw"); 
    
    PrintWriter out = response.getWriter();
          
    if(pword.equals("Rocky")){  
        RequestDispatcher rd=request.getRequestDispatcher("welcome");  
        rd.forward(request,response);  
    }  
    else{  
        out.print("<html><body><h1>Sorry username or password incorrect"+"</h1></body></html>");  
        RequestDispatcher rd=request.getRequestDispatcher("index.html");  
        rd.include(request,response);  
    }  
          
    //out.close();  
    }  
}  



