import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Select_JDBC
{

	public static void main(String[] args)
	{

		// prepared statement(interface):dynamic query.

		try
		{
			String url = "jdbc:mysql://localhost:3306/jdbc";
			String username = "root";
			String password = "******";

			Connection con = DriverManager.getConnection(url, username, password);

			// create a query to get data  table in database

			String q = "select * from table1";

			Statement stmt = con.createStatement();
			ResultSet set = stmt.executeQuery(q);

			while (set.next())
			{
				int id = set.getInt(1);
				String name = set.getString(2);
				String city = set.getNString(3);
				System.out.println(id + " : " + name + " : " + city);
			}

			con.close();

		} catch (Exception e)
		{
			e.printStackTrace();
		}

	}

}
