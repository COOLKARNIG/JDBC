import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Insert_into_JDBC
{

	public static void main(String[] args)
	{
               //prepared statement(interface):dynamic query.

		try
		{
			String url = "jdbc:mysql://localhost:3306/jdbc";
			String username = "root";
			String password = "Gk@14496";

			Connection con = DriverManager.getConnection(url, username, password);

			// create a query to create table in database

			String q = "insert into table1(tName,tCity)values(?,?)";

			// get prepared statement object
			PreparedStatement stmt = con.prepareStatement(q);

			// set the values to the query

			stmt.setString(1, "Yogesh Tak");
			stmt.setString(2, "Bhusawal");

			stmt.executeUpdate();

			System.out.println("Data inserted in Table");
			con.close();

		} catch (Exception e)
		{
			e.printStackTrace();
		}

	}

}
