/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleos.Connect;


import java.sql.*;
/**
 *
 * @author mest2
 */
public class ConnectDB {

    private String SQL = "";
    public Connection con = null;
    private final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private final String DBNAME = "ControleOS"; 
    private final String URL = "jdbc:mysql://localhost:3306/" + DBNAME;
    private final String LOGIN = "root";
    private final String SENHA = "";
    
     
    public static Connection getConnection() throws Exception {

		try {

			// indica qual Ã© o banco de dados que estou utilizando e seu driver

			Class.forName("com.mysql.cj.jdbc.Driver");

			// estabelece a conexao e retorna uma conexao

			String url = "jdbc:mysql://localhost:3306/ControleOS";
			String login = "root";
			String senha = "";
			return DriverManager.getConnection(url,login,senha);
		} catch (Exception e) {
			throw new Exception("Nao conectado!"+e.getMessage());
		}
	}
    
    // fecha uma conexÃ£o de trÃªs formas: conn, stmt, rs
    public static void closeConnection(Connection conn, Statement stmt,
			ResultSet rs) throws Exception {
		close(conn, stmt, rs);
	}
    
    public static void closeConnection(Connection conn, Statement stmt)
			throws Exception {
		close(conn, stmt, null);
	}

    public static void closeConnection(Connection conn) throws Exception {
		close(conn, null, null);
	}
    
    
    private static void close(Connection conn, Statement stmt, ResultSet rs)
			throws Exception {
		try {
			if (rs != null)
				rs.close();
			if (stmt != null)
				stmt.close();
			if (conn != null)
				conn.close();
		} catch (Exception e) {
			throw new Exception(e.getMessage());
                }
    }
}
