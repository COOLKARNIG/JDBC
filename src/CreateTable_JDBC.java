import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable_JDBC
{

	public static void main(String[] args)
	{

		try
		{
			String url = "jdbc:mysql://localhost:3306/jdbc";
			String username = "root";
			String password = "******";

			Connection con = DriverManager.getConnection(url, username, password);

			// create a query to create table in database

			String q = "create table table1(tid int(20) primary key auto_increment,"
					+ "tName varchar(200) not null, tCity varchar(200) not null)";

			// create statement to execute query.
			Statement stmt = con.createStatement();
			stmt.executeUpdate(q); // q will not return anything so execute update().
			System.out.println("Table created in database");
			con.close();

		} catch (Exception e)
		{
			e.printStackTrace();
		}

	}

}
