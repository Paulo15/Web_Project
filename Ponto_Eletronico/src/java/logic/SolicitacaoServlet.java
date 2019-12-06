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
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import model.User;


public class SolicitacaoServlet extends HttpServlet {

    

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
        try {

            Conexao con = new Conexao();
            
            String nome = request.getParameter("");
            String sobrenome = request.getParameter("");
            String tipo = request.getParameter("");
            String qtddias = request.getParameter("");
            String dataInicio = request.getParameter("");
            String dataFim = request.getParameter("");
            String horaEntrada = request.getParameter("");
            String horaAlmocoEntrada = request.getParameter("");
            String horaAlmocoFim = request.getParameter("");
            String horaSaida = request.getParameter("");
            String obs = request.getParameter("");
            
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm");
            Timestamp dataIniciots = new Timestamp(((java.util.Date)sdf.parse(dataInicio)).getTime());
            Timestamp dataFimts = new Timestamp(((java.util.Date)sdf.parse(dataFim)).getTime());
            Timestamp horaEntradats = new Timestamp(((java.util.Date)sdf1.parse(horaEntrada)).getTime());
            Timestamp horaAlmocoEntradats = new Timestamp(((java.util.Date)sdf1.parse(horaAlmocoEntrada)).getTime());
            Timestamp horaAlmocoFimts = new Timestamp(((java.util.Date)sdf1.parse(horaAlmocoFim)).getTime());
            Timestamp horaSaidats = new Timestamp(((java.util.Date)sdf1.parse(horaSaida)).getTime());
            
            
            Solicitacao sol = new Solicitacao();
            sol.setNomeSolicitante(nome+sobrenome);
            sol.setTipoSolicitacao(Integer.parseInt(tipo));
            sol.setQtddias(Long.parseLong(tipo));
            sol.setDataInicio(dataIniciots);
            sol.setDataFim(dataFimts);
            sol.setHoraEntrada(horaEntradats);
            sol.setHoraInicioAlmoco(horaAlmocoEntradats);
            sol.setHoraFimAlmoco(horaAlmocoFimts);
            sol.setHoraSaida(horaSaidats);
            sol.setObs(obs);
            
            SolicitacaoDAO dao = new SolicitacaoDAO();
            dao.createSol(sol);
           
            String Teste = "teste";
        } catch (Exception ex) {
            System.out.println("Deu ruim");
            ex.printStackTrace();
        }
    }
}
