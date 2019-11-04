/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleos;

import controleos.Usuario.Usuario;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author mest2
 */
public class UsuarioDAO {

    public UsuarioDAO() {
        
    }
    public void gravar( String nome, String login, String senha) throws SQLException {
        ConnectDB bd = new ConnectDB();
      
            if (bd.abreConexao()) {
                String sql="INSERT INTO login_key(nome, login, senha) values ('"+nome+"','"+login+"','"+senha+"')";

                PreparedStatement stmt = bd.conn.prepareStatement(sql);

                stmt.executeUpdate(sql);   
            } else {
            JOptionPane.showMessageDialog(null, "Error!");
            }
            bd.conn.close();
    }
    
    public String[][] pesquisar(int id, String nome, String login) throws SQLException{
        ConnectDB bd = new ConnectDB();
        String[][] array = null; 
        if (bd.abreConexao()) {
            String sql = "SELECT * FROM login_key ";
            if (id > 0) {
                sql += "WHERE id = "+ id;
            } else if(nome.length() > 0){
                sql += "WHERE nome LIKE '"+ nome + "%'";
            }else if(login.length() > 0){
                sql += "WHERE login LIKE '"+ login +"%'";
            }else{
                //JOptionPane.showMessageDialog(null, "Insera dados para fazer uma pesquisa!");
            }
            sql += " ORDER BY id desc";
            
            PreparedStatement stmt = bd.conn.prepareStatement(sql);
            
            ResultSet rs =  stmt.executeQuery();
            int lines = 20;
            
            int count =0; 
            array = new String[lines][4];
           
            while(rs.next()){
                //System.out.println("rrrrrrrrrrr"); 
                
                array[count][0]=rs.getString("id");
                //System.out.println(rs.getString("id")+ "teste");
                array[count][1]=rs.getString("login");
                //System.out.println(rs.getString("login"));
                array[count][2]=rs.getString("nome");
                //System.out.println(rs.getString("nome"));
                array[count][3]=rs.getString("senha");
                //System.out.println(rs.getString("senha"));
                
                count++;
            }
                
            return array;
            
            
            
        } else {
            JOptionPane.showMessageDialog(null, "Error!");
        }
        bd.conn.close();
        return array;
   }         
    
   public void altera(Usuario usuario){
       ConnectDB bd = new ConnectDB();
       try {
           if (bd.abreConexao()) {
                String sql = "UPDATE login_key SET nome = '"+usuario.getNome()+"', login = '"+usuario.getLogin();
                        if(usuario.getSenha() != null){
                            sql += "', senha = '"+usuario.getSenha();
                        }
                        sql += "' WHERE id = "+usuario.getId()+";";
                System.out.println(sql);
                PreparedStatement stmt = bd.conn.prepareStatement(sql);
                
                stmt.executeUpdate();
           
                JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
            }
           
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Error!");
       }
       
   }

    void delete(Usuario user) {
        try {
            ConnectDB bd = new ConnectDB();
            if(bd.abreConexao()) {
                    String sql = "DELETE FROM login_key WHERE id = "+user.getId()+" ;";  


                    PreparedStatement stmt = bd.conn.prepareStatement(sql);

                    stmt.executeUpdate();


                    bd.conn.close();
                    JOptionPane.showMessageDialog(null, "Excluído com Sucesso" );
                
                        
            }  
        } catch (Exception e) {
            e.printStackTrace(); 
            JOptionPane.showMessageDialog(null, "Não Excluído" );
        }
    }
    
}
