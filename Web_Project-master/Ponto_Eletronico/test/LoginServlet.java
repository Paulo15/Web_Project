
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Paulo
 */
public class LoginServlet extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String login = request.getParameter("txtLogin");
        String senha = request.getParameter("txtSenha");
        RequestDispatcher dispatcherOk = getServletContext().getRequestDispatcher("/ok.html");
        RequestDispatcher dispatcherEr = getServletContext().getRequestDispatcher("/erro.html");
        if (login.equals("user") && senha.equals("1234")){
            dispatcherOk.forward(request, response);
        }
        else{
           dispatcherEr.forward(request, response);
                    
        }  
    }
    
}
