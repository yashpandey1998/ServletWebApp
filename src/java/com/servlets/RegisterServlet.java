
package com.servlets;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;

import javax.servlet.http.*;


public class RegisterServlet extends HttpServlet{
    
    @Override
    public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
        res.setContentType("text/html");
        PrintWriter out=res.getWriter();
        out.println("<h2>Welcome to register servlet</h2>");
        
    }
    
}
