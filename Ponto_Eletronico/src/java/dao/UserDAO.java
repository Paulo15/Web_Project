/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.User;
import logic.Conexao;

/**
 *
 * @author felipe.correia
 */
public class UserDAO implements GenericDAO {

    @Override
    public void create(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public List<User> getListUser(){
        Conexao con = new Conexao();
        List<User> result = null;
        String SQL = "USE [PROGWEB_PROJETO]\n" +
                        "GO\n" +
                        "\n" +
                        "SELECT [ID]\n" +
                        "      ,[NAME]\n" +
                        "      ,[EMAIL]\n" +
                    "  FROM [dbo].[USUARIO]\n";
        
        try (PreparedStatement stm = con.getSqlConnection().prepareStatement(SQL)) {
            ResultSet rs = stm.executeQuery();
            result = null;
            result = new ArrayList<>();
            while (rs.next()){
                User u = new User();
                u.setEmail(rs.getString("EMAIL"));
                u.setLogin(rs.getString("LOGIN"));
                u.setName(rs.getString("NAME"));
                result.add(u);
            }
            rs.close();
        } catch (SQLException ex) {
            System.out.println("Deu ruim");
            ex.printStackTrace();
        }
        
        return result;
    }
    
    public User getUser(User user) throws SQLException{
        
        Conexao con = new Conexao();
        User u = new User();
           String SQL = "SELECT [ID]\n" +
                    "      ,[NAME]\n" +
                    "      ,[EMAIL]\n" +
                    "      ,[LOGIN]\n" +
                    "      ,[PASSWORD]\n" +
                    "  FROM [dbo].[USUARIO]\n" +
                    "  WHERE LOGIN = ? AND PASSWORD = ?\n";
            PreparedStatement stm = con.getSqlConnection().prepareStatement(SQL);
            stm.setString(1, user.getLogin().toString());
            stm.setString(2, user.getPassword().toString());
            
            ResultSet rs = stm.executeQuery();

            if (rs.next()){

                u.setEmail(rs.getString("EMAIL"));
                u.setLogin(rs.getString("LOGIN"));
                u.setName(rs.getString("NAME"));
            }
            rs.close();
            stm.close();
        
        return u;
    }

    @Override
    public List<Object> read() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
