/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author felipe.correia
 */
public class Papel {
    
    private int id;
    private String cargo;
    private Long nivelPermissao;

    public Long getNivelPermissao() {
        return nivelPermissao;
    }

    public void setNivelPermissao(Long nivelPermissao) {
        this.nivelPermissao = nivelPermissao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    
}
