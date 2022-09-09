package model;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * 
 * Classe modelo -conexão com o banco 
 * 
 * @author Guilherme.afranca1
 *
 */
public class DAO {
	//Parametro de conexão 
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://10.26.49.136:33036/agendacontatos";
	private String user = "root";
	private String password = "123@senac";
	/**
	 * Método responssavel pela conexão
	 * @return con / null
	 */
	public Connection conectar() {
		//Objeto usado para conexão
		Connection con = null;
		//ttratamento de exceções
		try {
			//uso do Driver 
			Class.forName(driver);
			// estabelecer a conexão
			con = DriverManager.getConnection(url,user,password);
			return con;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
		
		
	}
}
