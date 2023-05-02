import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateTable_JDBC
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

			// create a query to create table in database

			String q = "update table1 set tName=? ,tCity=? where tid=?";

			// create buffered reader object.

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Enter new name");
			String name = br.readLine();

			System.out.println("Enter new city");
			String city = br.readLine();

			System.out.println("Enter Id");
			int id = Integer.parseInt(br.readLine());

			// set the values to the query
			PreparedStatement pstmt = con.prepareStatement(q);
			
			pstmt.setString(1, name);
			pstmt.setString(2, city);
			pstmt.setInt(3, id);

			pstmt.executeUpdate();

			System.out.println("Table updated..");
			con.close();

		} catch (Exception e)
		{
			e.printStackTrace();
		}

	}

}
