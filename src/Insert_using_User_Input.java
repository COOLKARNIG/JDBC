import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Insert_using_User_Input
{

	public static void main(String[] args)
	{

		// prepared statement(interface):dynamic query.

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

			// create buffered reader object.

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter your name");
			String name = br.readLine();

			System.out.println("Enter city");
			String city = br.readLine();

			// set the values to the query

			stmt.setString(1, name);
			stmt.setString(2, city);

			stmt.executeUpdate();

			System.out.println("Data inserted in Table");
			con.close();

		} catch (Exception e)
		{
			e.printStackTrace();
		}

	}

}
