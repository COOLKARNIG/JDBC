import java.sql.*;

public class Connection_JDBC
{

	public static void main(String[] args)
	{
		try
		{
			String url = "jdbc:mysql://localhost:3306/jdbc";
			String username = "root";
			String password = "Gk@14496";

			Connection con = DriverManager.getConnection(url, username, password);

			if (con.isClosed())
			{
				System.out.println("System is closed..");
			} else
			{
				System.out.println("Connection created..");
			}
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
