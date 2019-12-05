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
public class SolicitacaoDAO implements GenericDAO{

    public void create(Solicitacao sol) {
        Conexao con = new Conexao();
        List<Solicitacao> result = null;
        String SQL = "INSERT INTO [dbo].[SOLICITACAO]\n" +
                    " ([ID]\n" +
                    " ,[TIPO_SOLICITACAO]\n" +
                    " ,[NOME_SOLICITANTE]\n" +
                    " ,[APROVADOR]\n" +
                    " ,[ETAPA])\n" +
                    " VALUES\n" +
                    " (?\n" +
                    " ,?\n" +
                    " ,?\n" +
                    " ,?\n" +
                    " ,?)";
            try (PreparedStatement stm = con.getSqlConnection().prepareStatement(SQL)) {
                
                stm.setInt(1, sol.getTipoSolicitacao());
                stm.setString(2, sol.getNomeSolicitante());
                stm.setString(3, sol.getNomeSolicitante());
                stm.setLong(4, sol.getEtapa());
                stm.executeUpdate();
            } catch (SQLException ex) {
            System.out.println("Deu ruim");
            ex.printStackTrace();
        }
    }

    @Override
    public void delete(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Solicitacao> getList() {
        Conexao con = new Conexao();
        List<Solicitacao> result = null;
        String SQL = "SELECT [ID]\n" +
                    "      ,[TIPO_SOLICITACAO]\n" +
                    "      ,[NOME_SOLICITANTE]\n" +
                    "      ,[APROVADOR]\n" +
                    "      ,[ETAPA]\n" +
                    "  FROM [dbo].[SOLICITACAO]\n";
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

    @Override
    public List<Object> read() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void create(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
