package cinemar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class BD {
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/cinema";
	static final String USER = "root";
 	static final String PASS= "root";
 	
 	public ArrayList<String> consultar(String consulta) {
 		Connection conn=null;
 		Statement stmt = null;
 		try {
 			Class.forName(JDBC_DRIVER);
 			conn = DriverManager.getConnection(DB_URL,USER,PASS);
 			stmt = conn.createStatement();
 			ResultSet resultado = stmt.executeQuery(consulta);
 			ArrayList<String> resultados = new ArrayList<String>();
 			while (resultado.next()) {
 				String auxiliar = resultado.getString("nombre");
 				resultados.add(auxiliar);
 				auxiliar = resultado.getString("genero");
 				resultados.add(auxiliar);
 				auxiliar = resultado.getString("sinopsis");
 				resultados.add(auxiliar);
 			}
 			resultado.close(); 			
 			stmt.close();
 			conn.close();
 			return resultados;
 			
 		}catch(SQLException se){
			 // Resolver errores para JDBC
			 se.printStackTrace();
		 }catch(Exception e){
			 // Resolver errores para Class.forName
			 e.printStackTrace();
		 }finally{
		 // Bloque finalmente utilizado para cerrar recursos
		 try{
			 if(stmt!=null)
				 stmt.close();
		 }catch(SQLException se2){
		 }// Nada que podamos hacer
		 try{
			 if(conn!=null)
				 conn.close();
		 }catch(SQLException se){
		 se.printStackTrace();
		 	} //cierra finally try
		 } //cierra try
		 System.out.println("Goodbye!");
		return null;
 	}
 	
 	/*public static void main(String[] args) {
		Connection conn=null;
 		Statement stmt = null;
 		try {
 			Class.forName(JDBC_DRIVER);
 			System.out.println("Conectando a la base de datos...");
 			conn = DriverManager.getConnection(DB_URL,USER,PASS);
 			stmt = conn.createStatement();
 			String sql;
 			sql = "SELECT * FROM pelicula";
 			ResultSet resultado = stmt.executeQuery(sql);
 			while (resultado.next()) {
 				String Name = resultado.getString("nombre");
 				System.out.println("Nombre: "+Name);
 			}
 			resultado.close();
 			stmt.close();
 			conn.close();
 			
 		}catch(SQLException se){
			 // Resolver errores para JDBC
			 se.printStackTrace();
		 }catch(Exception e){
			 // Resolver errores para Class.forName
			 e.printStackTrace();
		 }finally{
		 // Bloque finalmente utilizado para cerrar recursos
		 try{
			 if(stmt!=null)
				 stmt.close();
		 }catch(SQLException se2){
		 }// Nada que podamos hacer
		 try{
			 if(conn!=null)
				 conn.close();
		 }catch(SQLException se){
		 se.printStackTrace();
		 	} //cierra finally try
		 } //cierra try
		 System.out.println("Goodbye!");
	}*/
}