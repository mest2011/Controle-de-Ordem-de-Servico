/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleos.Usuario;

/**
 *
 * @author mest2
 */
public class Usuario {
    private int id;
    private String nome;
    private String login;
    private String senha;
    //private String hierarquia;

    public Usuario() {
        
    }
    
    public Usuario(int id, String nome, String login, String senha, String hierarquia) {
        this.id = id;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        //this.hierarquia = hierarquia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    /*public String getHierarquia() {
        return hierarquia;
    }

    public void setHierarquia(String hierarquia) {
        this.hierarquia = hierarquia;
    }*/
    
    
    
    
}
