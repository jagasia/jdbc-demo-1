import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class App {

	public static void main(String[] args) throws SQLException {
		Driver driver = new com.mysql.jdbc.Driver();
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jfs004","root","");
		//run queries. For that, I will represent the query as an object. Statement is used for object representation of SQL statements
		Statement st=con.createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM Branch");
		while(rs.next())
		{
			System.out.println(rs.getString(1)+"\t"+rs.getString(2));
		}
		con.close();
		DriverManager.deregisterDriver(driver);
	}

}
