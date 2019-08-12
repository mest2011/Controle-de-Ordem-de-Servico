/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleos;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author mest2
 */
@Entity
@Table(name = "login_key", catalog = "controleos", schema = "")
@NamedQueries({
    @NamedQuery(name = "LoginKey.findAll", query = "SELECT l FROM LoginKey l"),
    @NamedQuery(name = "LoginKey.findById", query = "SELECT l FROM LoginKey l WHERE l.id = :id"),
    @NamedQuery(name = "LoginKey.findByNome", query = "SELECT l FROM LoginKey l WHERE l.nome = :nome"),
    @NamedQuery(name = "LoginKey.findByLogin", query = "SELECT l FROM LoginKey l WHERE l.login = :login"),
    @NamedQuery(name = "LoginKey.findBySenha", query = "SELECT l FROM LoginKey l WHERE l.senha = :senha"),
    @NamedQuery(name = "LoginKey.findByHierarquia", query = "SELECT l FROM LoginKey l WHERE l.hierarquia = :hierarquia")})
public class LoginKey implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "login")
    private String login;
    @Column(name = "senha")
    private String senha;
    @Column(name = "hierarquia")
    private Short hierarquia;

    public LoginKey() {
    }

    public LoginKey(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        String oldLogin = this.login;
        this.login = login;
        changeSupport.firePropertyChange("login", oldLogin, login);
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        String oldSenha = this.senha;
        this.senha = senha;
        changeSupport.firePropertyChange("senha", oldSenha, senha);
    }

    public Short getHierarquia() {
        return hierarquia;
    }

    public void setHierarquia(Short hierarquia) {
        Short oldHierarquia = this.hierarquia;
        this.hierarquia = hierarquia;
        changeSupport.firePropertyChange("hierarquia", oldHierarquia, hierarquia);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LoginKey)) {
            return false;
        }
        LoginKey other = (LoginKey) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "controleos.LoginKey[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
