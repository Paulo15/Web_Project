/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logic.Conexao;
import model.Solicitacao;

/**
 *
 * @author felipe.correia
 */
public class SolicitacaoDAO {

    public Boolean createSol(Solicitacao sol) {
        Conexao con = new Conexao();
        String SQL = "INSERT INTO [dbo].[SOLICITACAO]\n" +
                    "           ([TIPO_SOLICITACAO]\n" +
                    "           ,[NOME_SOLICITANTE]\n" +
                    "           ,[APROVADOR]\n" +
                    "           ,[ETAPA]\n" +
                    "           ,[QTD_DIAS]\n" +
                    "           ,[DATA_INICIO]\n" +
                    "           ,[DATA_FIM]\n" +
                    "           ,[HORA_ENTRADA]\n" +
                    "           ,[HORA_INICIO_ALMOCO]\n" +
                    "           ,[HORA_FIM_ALMOCO]\n" +
                    "           ,[HORA_SAIDA]\n" +
                    "           ,[OBS])\n" +
                    " VALUES\n" +
                    " (?\n" +
                    " ,?\n" +
                    " ,?\n" +
                    " ,?\n" +
                    " ,?\n" +
                    " ,?\n" +
                    " ,?\n" +
                    " ,?\n" +
                    " ,?\n" +
                    " ,?\n" +
                    " ,?\n" +
                    " ,?)";
            try (PreparedStatement stm = con.getSqlConnection().prepareStatement(SQL)) {
                
                stm.setInt(1, sol.getTipoSolicitacao());
                stm.setString(2, sol.getNomeSolicitante());
                stm.setString(3, sol.getNomeSolicitante());
                stm.setLong(4, sol.getEtapa());
                if(sol.getQtddias() == null){
                    stm.setNull(5, java.sql.Types.INTEGER);
                }else{
                stm.setLong(5, sol.getQtddias());
                }
                
                if(sol.getDataInicio() == null){
                    stm.setNull(6, java.sql.Types.DATE);
                }else{
                stm.setTimestamp(6, sol.getDataInicio());
                }
                
                if(sol.getDataFim() == null){
                    stm.setNull(7, java.sql.Types.DATE);
                }else{
                stm.setTimestamp(7, sol.getDataFim());
                }
                
                if(sol.getHoraEntrada() == null){
                    stm.setNull(8, java.sql.Types.DATE);
                }else{
                stm.setTimestamp(8, sol.getHoraEntrada());
                }
                
                if(sol.getHoraInicioAlmoco() == null){
                    stm.setNull(9, java.sql.Types.DATE);
                }else{
                stm.setTimestamp(9, sol.getHoraInicioAlmoco());
                }
                
                if(sol.getHoraFimAlmoco() == null){
                    stm.setNull(10, java.sql.Types.DATE);
                }else{
                stm.setTimestamp(10, sol.getHoraFimAlmoco());
                }
                
                if(sol.getHoraSaida() == null){
                    stm.setNull(11, java.sql.Types.DATE);
                }else{
                stm.setTimestamp(11, sol.getHoraSaida());
                }
                
                if(sol.getObs() == null){
                    stm.setNull(12, java.sql.Types.VARCHAR);
                }else{
                    stm.setString(12, sol.getObs());
                }
                
                stm.executeUpdate();
                
                
            stm.close();
            return true;
            } catch (SQLException ex) {
            System.out.println("Deu ruim");
            ex.printStackTrace();
        }
            return false;
    }

    public void delete(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    public void updateAprovador(Solicitacao sol) {
        Conexao con = new Conexao();
        String SQL = "UPDATE [dbo].[SOLICITACAO]\n" +
                    "   SET [APROVADO] = ?\n" +
                    " WHERE ID = ?";
            try (PreparedStatement stm = con.getSqlConnection().prepareStatement(SQL)) {
                
                stm.setBoolean(1, sol.getAprovado());
                stm.setLong(2, sol.getId());
                
                stm.executeUpdate();
                
                
            stm.close();
            } catch (SQLException ex) {
            System.out.println("Deu ruim");
            ex.printStackTrace();
        }
    }

    public List<Solicitacao> getList() {
        Conexao con = new Conexao();
        List<Solicitacao> result = null;
        String SQL = "SELECT TOP 5 [ID]\n" +
                    "      ,[TIPO_SOLICITACAO]\n" +
                    "      ,[NOME_SOLICITANTE]\n" +
                    "      ,[APROVADOR]\n" +
                    "      ,[ETAPA]\n" +
                    "  FROM [dbo].[SOLICITACAO]\n"+
                    " ORDER BY ID DESC";
            try (PreparedStatement stm = con.getSqlConnection().prepareStatement(SQL)) {
            ResultSet rs = stm.executeQuery();
            result = null;
            result = new ArrayList<>();
            while (rs.next()){
                Solicitacao sol = new Solicitacao();
                sol.setNomeSolicitante(rs.getString("NOME_SOLICITANTE"));
                sol.setTipoSolicitacao(rs.getInt("TIPO_SOLICITACAO"));
                sol.setEtapa(rs.getLong("ETAPA"));
                sol.setAprovador(rs.getString("APROVADOR"));
                
                result.add(sol);
            }
            rs.close();
        } catch (SQLException ex) {
            System.out.println("Deu ruim");
            ex.printStackTrace();
        }
        
        return result;
    }

}
