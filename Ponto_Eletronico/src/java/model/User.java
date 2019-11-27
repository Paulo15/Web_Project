/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


public class User implements java.io.Serializable{
    private String login;
    private String password;
    private String name;
    private String email;

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return the senha
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param senha the senha to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the nome
     */
    public String getName() {
        return name;
    }

    /**
     * @param nome the nome to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
