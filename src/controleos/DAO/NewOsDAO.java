/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleos.DAO;

import java.sql.*;
import controleos.Controller.NewOS;
import controleos.Connect.ConnectDB;

public class NewOsDAO {
        private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs; 
	private NewOS newos;
        
        
        //Cria conecção com o DB
        public NewOsDAO() throws Exception {
		// chama a classe ConnectionFactory e estabele uma conexÃ£o
		try {
                    System.out.println("conecçao iniciada");
			this.conn = ConnectDB.getConnection();
		} catch (Exception e) {
			throw new Exception("erro: \n" + e.getMessage());
		}
	}
        
        public String[] ProcuraClientePorNome(String nome) throws Exception{
            String dados[]=new String[3];
            try {
                String SQL = "SELECT id, nome, cpf FROM cliente where " + nome + " ;";
			conn = this.conn;
			ps = conn.prepareStatement(SQL);
			
                        ResultSet rs = ps.executeQuery();
                
                        while (rs.next()) {
                            dados[0] = rs.getString("id") + "     ";
                            dados[1] = rs.getString("nome")+ "     ";
                            dados[2] = rs.getString("cpf")+ "\n";
                            
                        }    
                
                        return dados;
                        
		} catch (SQLException sqle) {
			throw new Exception("Erro ao consultar os dados " + sqle);
		} finally {
			ConnectDB.closeConnection(conn, ps);
		}	
        }
        
        public void salvar(NewOS newos) throws Exception {
                if (newos == null)
			throw new Exception("O valor passado nao pode ser nulo");
		try {
                String SQL = "INSERT INTO ordem_de_servico (modelo_aparelho, numero_serie, observacoes, id_cliente) values (?, ?, ?, ?)";
			conn = this.conn;
			ps = conn.prepareStatement(SQL);
			ps.setString(1, newos.getModel());
			ps.setString(2, newos.getSerialNumber());
			ps.setString(3, newos.getObsCar());// campo de observações e caracteristicas sobre o aparelho
			ps.setInt(4, newos.getIdCli());
			ps.executeUpdate();
		} catch (SQLException sqle) {
			throw new Exception("Erro ao inserir dados " + sqle);
		} finally {
			ConnectDB.closeConnection(conn, ps);
		}	
	}
        
        
        
        
        
}
