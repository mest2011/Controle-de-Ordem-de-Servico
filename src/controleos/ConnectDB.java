/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
 
public class ConnectDB {
    private String SQL = "";
    public Connection con = null;
    private final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private final String DBNAME = "ControleOS"; 
    private final String URL = "jdbc:mysql://localhost:3306/" + DBNAME;
    private final String LOGIN = "root";
    private final String SENHA = "";
     
    public boolean abreConexao() {
		try {
			Class.forName(DRIVER);
			con = DriverManager.getConnection(URL, LOGIN, SENHA);
			//System.out.println("Classe BD - Conectou");
			return true;
		} catch (ClassNotFoundException e) {
			System.out.println("Classe BD - Driver nao encontrado " + e.toString());
			return false;
		} catch (SQLException e) {
			System.out.println("Classe BD - Falha ao conectar " + e.toString());
			return false;
		}
	}

    private void close() {
        try {
			con.close();
			System.out.println("Classe BD - Desconectou");
		} catch (SQLException e) {			
		}
    }
    
    public boolean login(String login , String senha) {
        ConnectDB bd= new ConnectDB();
        String[] dados = new String[2]; 
	if(bd.abreConexao()) {
	try {
            String sql="";
	
                sql = "SELECT login, senha FROM login_key WHERE login = '" + login + "';";
					
                PreparedStatement stmt = bd.con.prepareStatement(sql);
		
                ResultSet rs = stmt.executeQuery();
                
                while (rs.next()) {
                    dados[0] = rs.getString("login");
                    dados[1] = rs.getString("senha");
                }    
                
                
                //System.out.println("consulta feita");
                if (login.equals(dados[0]) && senha.equals(dados[1])) {
                    rs.close();
                    stmt.close();
                    bd.close();
                    return true;
                }else{
                   rs.close();
                   stmt.close();
                   bd.close(); 
                   JOptionPane.showMessageDialog(null, "Usuário ou senha inválida!", "Login", JOptionPane.WARNING_MESSAGE);
                }
	
        }catch (Exception e) {
            System.out.println(e.toString());
            JOptionPane.showMessageDialog(null, "Usuário ou senha inválida!", "Login", JOptionPane.WARNING_MESSAGE);
            return false;
            }
        }
            else {
                System.out.println("Erro ao conectar");
            }
        return false;
        }

    public String[][] searchUser(){
      int contaUsuarios = 0;
      String[][] dados = new String[4][50];
      ConnectDB bd=new ConnectDB();
      
      if(bd.abreConexao()) {
	try {
            String sql="";
	
                sql = "SELECT id, nome, login, hierarquia FROM login_key;";
					
                PreparedStatement stmt = bd.con.prepareStatement(sql);
		
                ResultSet rs = stmt.executeQuery();
                
                while (rs.next()) {
                    dados[0][contaUsuarios] = rs.getString("id");
                    dados[1][contaUsuarios] = rs.getString("nome");
                    dados[2][contaUsuarios] = rs.getString("login");
                    dados[3][contaUsuarios] = rs.getString("hierarquia");
                    contaUsuarios++;
                }    
                
                
        }catch (Exception e) {
            System.out.println(e.toString());
            }
        }
            else {
                System.out.println("Erro ao conectar");
            }
             
             bd.close();
        return dados; 
    }
    
    public void incluirCliente(String[] dados){
      ConnectDB bd=new ConnectDB();
      if(bd.abreConexao()) {
	try {
            String sql="INSERT INTO cliente(nome, cpf, dataNascimento, endereco, cidade, numero, cep, telefone, celular)values(";
            String virgula=",";
            String asterisco="'";
                sql += asterisco+dados[0]+asterisco+virgula+dados[1]+virgula+asterisco+dados[2]+asterisco+virgula+asterisco+dados[3]+asterisco+virgula;
		sql += asterisco+dados[4]+asterisco+virgula+dados[5]+virgula+dados[6]+virgula+asterisco+dados[7]+asterisco+virgula+asterisco+dados[8]+asterisco+");";		
                PreparedStatement stmt = bd.con.prepareStatement(sql);
		          System.out.println(sql);
                stmt.executeUpdate(sql);
             
            stmt.close();    
        }catch (Exception e) {
            System.out.println(e.toString());
            JOptionPane.showMessageDialog(null, "Os dados não foram salvos!", "Salvo", JOptionPane.ERROR_MESSAGE);
            }
        }
            else {
                JOptionPane.showMessageDialog(null, "Os dados não foram salvos!", "Salvo", JOptionPane.ERROR_MESSAGE);
                System.out.println("Erro ao conectar");
            }
        
        bd.close();
        JOptionPane.showMessageDialog(null, "Dados Salvos com sucesso!", "Salvo", JOptionPane.INFORMATION_MESSAGE);
    }

    public void QueryLogin(String usuario){  
        try{  
            ConnectDB bd = new ConnectDB();
            String SQL = "select login, senha from login where id = '" +  
                    usuario + "'";  
            
            PreparedStatement stmt = bd.con.prepareCall(SQL);
            
            ResultSet rs = stmt.executeQuery();
            
            String n = rs.getString(usuario);
            JOptionPane.showMessageDialog(null, n );
        }  
        catch(SQLException ex){  
            ex.printStackTrace();  
        }  
    }

    public String [][] searchClient(String parametro, String pesquisa){
      int contaUsuarios = 0;
      String[][] dados = new String[11][50];
      ConnectDB bd=new ConnectDB();
      
      if(bd.abreConexao()) {
	try {
            String sql="SELECT id, nome, cpf, dataNascimento, endereco, cidade, numero, cep, telefone, celular";
	
                sql += " FROM cliente WHERE " + parametro +  pesquisa + ";";
					
                PreparedStatement stmt = bd.con.prepareStatement(sql);
		
                ResultSet rs = stmt.executeQuery();
                
                while (rs.next()) {
                    dados[0][contaUsuarios] = Integer.toString(contaUsuarios);
                    dados[1][contaUsuarios] = rs.getString("id");
                    dados[2][contaUsuarios] = rs.getString("nome");
                    dados[3][contaUsuarios] = rs.getString("cpf");
                    dados[4][contaUsuarios] = rs.getString("dataNascimento");
                    dados[5][contaUsuarios] = rs.getString("endereco");
                    dados[6][contaUsuarios] = rs.getString("cidade");
                    dados[7][contaUsuarios] = rs.getString("numero");
                    dados[8][contaUsuarios] = rs.getString("cep");
                    dados[9][contaUsuarios] = rs.getString("telefone");
                    dados[10][contaUsuarios] = rs.getString("celular");
                    contaUsuarios++;
                }    
                
                
        }catch (Exception e) {
            System.out.println(e.toString());
            }
        }
            else {
                System.out.println("Erro ao conectar");
            }
             
             bd.close();
             dados[0][49]= Integer.toString(contaUsuarios);
        return dados; 
    }

    void alterarCliente(String[] dados) {
        ConnectDB bd=new ConnectDB();
      if(bd.abreConexao()) {
	try {
            String sql="UPDATE cliente SET ";
            String virgula=",";
            String asterisco="'";
                sql += " nome="+asterisco+dados[0]+asterisco+virgula
                        +" cpf="+dados[1]+virgula
                        + " dataNascimento="+asterisco+dados[2]+asterisco+virgula
                        +" endereco="+asterisco+dados[3]+asterisco+virgula;
		sql += " cidade="+asterisco+dados[4]+asterisco+virgula
                        +" numero="+dados[5]+virgula
                        +" cep="+dados[6]+virgula
                        +" telefone="+asterisco+dados[7]+asterisco+virgula
                        +" celular="+asterisco+dados[8]+asterisco+" where id = " + dados[9] +";";		
                PreparedStatement stmt = bd.con.prepareStatement(sql);
		          System.out.println(sql);
                stmt.executeUpdate(sql);
             
            stmt.close();    
        }catch (Exception e) {
            System.out.println(e.toString());
            JOptionPane.showMessageDialog(null, "Os dados não foram salvos!", "Salvo", JOptionPane.ERROR_MESSAGE);
            }
        }
            else {
                JOptionPane.showMessageDialog(null, "Os dados não foram salvos!", "Salvo", JOptionPane.ERROR_MESSAGE);
                System.out.println("Erro ao conectar");
            }
        
        bd.close();
        JOptionPane.showMessageDialog(null, "Dados Salvos com sucesso!", "Salvo", JOptionPane.INFORMATION_MESSAGE);
    }

    void deleteClient(String id) {
        ConnectDB bd=new ConnectDB();
      if(bd.abreConexao()) {
	try {
            String sql="DELETE FROM cliente WHERE id = ";
                sql += id +";";		
                PreparedStatement stmt = bd.con.prepareStatement(sql);
		          System.out.println(sql);
                stmt.executeUpdate(sql);
             
            stmt.close();    
        }catch (Exception e) {
            System.out.println(e.toString());
            JOptionPane.showMessageDialog(null, "Os dados não foram salvos!", "Salvo", JOptionPane.ERROR_MESSAGE);
            }
        }
            else {
                JOptionPane.showMessageDialog(null, "Os dados não foram salvos!", "Salvo", JOptionPane.ERROR_MESSAGE);
                System.out.println("Erro ao conectar");
            }
        
        bd.close();
        JOptionPane.showMessageDialog(null, "Dados Salvos com sucesso!", "Salvo", JOptionPane.INFORMATION_MESSAGE);
    }

    
}
