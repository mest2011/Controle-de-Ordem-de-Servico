/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleos;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author mest2
 */
public class OSDAO {
    public OSDAO(){
        
    }
    
    public void salvar(Os os) throws SQLException{
        ConnectDB bd = new ConnectDB();
        
            if(bd.abreConexao()){
                String sql ="INSERT INTO ordem_servico (modelo_aparelho, numero_serie, observacoes, id_cliente) values ";
                sql+= "('"+os.getModelo()+"', '"+os.getSerial()+"', '"+os.getObs()+"', "+os.getIdCliente()+");";
                
                PreparedStatement stmt = bd.conn.prepareStatement(sql);
                
                stmt.executeUpdate();
                
            }
        
    }
    
    public String[][] buscaOs() throws SQLException{
        ConnectDB bd = new ConnectDB();
        String[][] array = null;
        int lines = 20;
        if(bd.abreConexao()){
            
                String sql ="SELECT * FROM ordem_servico inner join cliente ON ordem_servico.id_cliente = cliente.id";
                
                PreparedStatement stmt = bd.conn.prepareStatement(sql);
                
                ResultSet rs = stmt.executeQuery();
                
              
            
            int count = 0; 
            array = new String[lines][8];
           
            while(rs.next()){
                //System.out.println("rrrrrrrrrrr"); 
                
                array[count][0]=rs.getString(1);
                //System.out.println(rs.getString(1));
                array[count][1]=rs.getString("modelo_aparelho");
                //System.out.println(rs.getString("modelo_aparelho"));
                array[count][2]=rs.getString("numero_serie");
                //System.out.println(rs.getString("numero_serie"));
                array[count][3]=rs.getString("observacoes");
                //System.out.println(rs.getString("observacoes"));
                array[count][4]=rs.getString("id_cliente");
                //System.out.println(rs.getString("id_cliente"));
                array[count][5]=rs.getString("nome");
                //System.out.println(rs.getString("nome"));
                array[count][6]=rs.getString("telefone");
                //System.out.println(rs.getString("telefone"));
                array[count][7]=rs.getString("celular");
                //System.out.println(rs.getString("celular"));
                
                count++;
            }
                
              
            }
        return array;
    } 
    
    public void update(Os os) throws SQLException{
        ConnectDB bd = new ConnectDB();
           if (bd.abreConexao()) {
                String sql = "UPDATE ordem_servico SET modelo_aparelho = '"+os.getModelo()+"', numero_serie = '"+os.getSerial()+"', observacoes = '"+os.getObs();
                        sql += "' WHERE id = "+os.getId()+";";
                System.out.println(sql);
                PreparedStatement stmt = bd.conn.prepareStatement(sql);
                
                stmt.executeUpdate();
            }
           
       
    }
}
