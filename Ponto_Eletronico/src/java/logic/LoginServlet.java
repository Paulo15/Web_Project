package logic;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import dao.GenericDAO;
import dao.SolicitacaoDAO;
import dao.UserDAO;
import model.Solicitacao;
import model.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import model.User;


public class LoginServlet extends HttpServlet {

    

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String paginaDestino="/index.html";
        try {

            Conexao con = new Conexao();
            String Usuario = request.getParameter("txtLogin");
            String Senha = request.getParameter("txtSenha");
            
            User UserLogin = new User();
            UserDAO dao = new UserDAO();
            
            UserLogin.setLogin(Usuario);
            UserLogin.setPassword(Senha);
            User result = new User();
            result = (User) dao.getUser(UserLogin);
            
            
            if(!result.getName().isEmpty()){
                SolicitacaoDAO sol = new SolicitacaoDAO();
                List<Solicitacao> listSol;
                listSol = sol.getList();
                request.setAttribute("listSol", listSol);
                paginaDestino = "/pagina_principal.jsp";
            }
            
             
        } catch (Exception ex) {
            System.out.println("Deu ruim");
            ex.printStackTrace();
        }
            finally {
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(paginaDestino);
            dispatcher.forward(request, response);
        }
    }
}
