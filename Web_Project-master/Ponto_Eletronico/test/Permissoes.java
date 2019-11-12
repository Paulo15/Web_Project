/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author felipe.correia
 */
public class Permissoes {
        
    private String login;
    private String papel;
    private Long nivelPermissao;
    
    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPapel() {
        return papel;
    }

    public void setPapel(String papel) {
        this.papel = papel;
    }
    
     public Long getNivelPermissao() {
        return nivelPermissao;
    }

    public void setNivelPermissao(Long nivelPermissao) {
        this.nivelPermissao = nivelPermissao;
    }
    
}
