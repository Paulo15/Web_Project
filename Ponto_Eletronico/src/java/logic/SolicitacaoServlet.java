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


public class SolicitacaoServlet extends HttpServlet {

    

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String paginaDestino="/form.html?MAX_FILE_SIZE=4194304\"";
        try {

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm");
            
            
            Conexao con = new Conexao();
            String Nome = request.getParameter("txtNome");
            String Sobrenome = request.getParameter("txtSobrenome");
            String QtdDias = request.getParameter("txtQtdDias");
            String DatIni = request.getParameter("txtDatIni");
            String DatFin = request.getParameter("txtDatFin");
            String HEntrada = request.getParameter("txtHoraEntrada");
            String HIAlmoco = request.getParameter("txtHoraIniAlmoco");
            String HFAlmoco = request.getParameter("txtHoraFinAlmoco");
            String HSaida = request.getParameter("txtHoraSaida");
            String Obs = request.getParameter("txtObs");
            
            Solicitacao NewSolic = new Solicitacao();
            SolicitacaoDAO dao = new SolicitacaoDAO();
            
            NewSolic.setNomeSolicitante(Nome+Sobrenome);
            NewSolic.setQtddias(Long.parseLong(QtdDias));
            NewSolic.setEtapa(1L);
            
            if(DatIni != "" && DatFin != ""){
            Timestamp dataInicio = new Timestamp(((java.util.Date)sdf.parse(DatIni)).getTime());
            Timestamp dataFim = new Timestamp(((java.util.Date)sdf.parse(DatFin)).getTime());
            NewSolic.setTipoSolicitacao(1);
            NewSolic.setDataInicio(dataInicio);
            NewSolic.setDataFim(dataFim);
            }
            
            if(HEntrada != "" && HIAlmoco != "" && HFAlmoco != "" && HSaida != ""){
            Timestamp HoraEn = new Timestamp(((java.util.Date)sdf1.parse(HEntrada)).getTime());
            Timestamp HoraIAlm = new Timestamp(((java.util.Date)sdf1.parse(HIAlmoco)).getTime());
            Timestamp HoraFAlm = new Timestamp(((java.util.Date)sdf1.parse(HFAlmoco)).getTime());
            Timestamp HoraSaida = new Timestamp(((java.util.Date)sdf1.parse(HSaida)).getTime());
            NewSolic.setTipoSolicitacao(2);
            NewSolic.setHoraEntrada(HoraEn);
            NewSolic.setHoraInicioAlmoco(HoraIAlm);
            NewSolic.setHoraFimAlmoco(HoraFAlm);
            NewSolic.setHoraSaida(HoraSaida);
            }
            
            if(NewSolic.getTipoSolicitacao() == null){
                NewSolic.setTipoSolicitacao(3);
            }

            NewSolic.setObs(Obs);
           
            Boolean result = dao.createSol(NewSolic);
            if(result == true){
             paginaDestino = "/pagina_principal.html";
            }else{
                paginaDestino = "/erro.jsp";
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
    
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/pagina_principal.jsp");
            /* business logic */
            /*DataSource ds = new DataSource();
            GenericDAO dao = new ProdutoDAO(ds);
            List<Object> lista = dao.read();
            ds.getConnection().close();
            System.out.println("Tamanho da lista = " + lista.size());
            request.setAttribute("Lista", lista);

            dispatcher.forward(request, response);
                    */
        } catch (Exception ex) {

        }

    }

}
