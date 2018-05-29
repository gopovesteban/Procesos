package Program;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Gestor {

	public static void prueba() {
	String dbURL = "jdbc:sqlserver:SJOLTP214A\\SQLEXPRESS,144;Initial Catalog=DB_PROCESOS;Integrated Security=True" ;
{
	 
		try (Connection conn = DriverManager.getConnection(dbURL)) {
		     
			String sql = "INSERT INTO usuario (nombre, apellido, tipo, firma) VALUES (?, ?, ?, ?)";
			 
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1, "Esteban");
			statement.setString(2, "Gonzalez");
			statement.setString(3, "cliente");
			statement.setString(4, "vesgon");
			 
			int rowsInserted = statement.executeUpdate();
			if (rowsInserted > 0) {
			    System.out.println("A new user was inserted successfully!");
			}
		     
		} catch (SQLException ex) {
		    ex.printStackTrace();
		}
	
	
	
}
	}
	
	
	
}



