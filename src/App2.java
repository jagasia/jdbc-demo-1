import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.driver.OracleDriver;

public class App2 {

	public static void main(String[] args) throws SQLException {
		OracleDriver driver = new oracle.jdbc.driver.OracleDriver();
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM EMPLOYEES");
		while(rs.next())
		{
			System.out.println(rs.getString(1)+"\t"+rs.getString(2));
		}
		DriverManager.deregisterDriver(driver);

	}

}
