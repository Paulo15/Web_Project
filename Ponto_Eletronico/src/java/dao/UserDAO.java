/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author Usuario
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

    @Override
    public List<Object> read() {
        String SQL = "USE [PROGWEB_PROJETO]\n" +
                        "GO\n" +
                        "\n" +
                        "SELECT [ID]\n" +
                        "      ,[NAME]\n" +
                        "      ,[EMAIL]\n" +
                    "  FROM [dbo].[USUARIO]\n" +
                    "GO\n" +
                    "";
            /*PreparedStatement stm = dataSource.getConnection().prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            stm.setString(1, c.getNome());
            stm.setString(2, c.getEmail());
            stm.setString(3, c.getSenha());
            int result = stm.executeUpdate();
            if (result == 0) {
                throw new RuntimeException("Falha ao inserir - registros duplicados");
            }
            ResultSet rs = stm.getGeneratedKeys();
            if (rs.next()) {
                c.setId(rs.getInt(1));
                for (Endereco e : c.getEnderecos()) {
                    e.setCliente(c);
                    SQL = "INSERT INTO tblEndereco values (null, ?,?,?,?,?,?,?,?,?,?)";
                    stm = dataSource.getConnection().prepareStatement(SQL);
                    stm.setString(1,e.getTipoLogradouro());
                    stm.setString(2,e.getLogradouro());
                    stm.setString(3,e.getNumero());
                    stm.setString(4,e.getComplemento());
                    stm.setString(5,e.getBairro());
                    stm.setString(6,e.getCidade());
                    stm.setString(7,e.getEstado());
                    stm.setString(8,e.getCep());
                    stm.setInt(9, e.getTipo());
                    stm.setInt(10, e.getCliente().getId());
                    stm.executeUpdate();
                }
            }

            rs.close();
            stm.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }*/
        return null;
    }
    
}
