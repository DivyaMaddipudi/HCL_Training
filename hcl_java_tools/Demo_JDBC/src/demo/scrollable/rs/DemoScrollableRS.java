package demo.scrollable.rs;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.jdbc.demo.ConnectionFactory;

public class DemoScrollableRS {
	
	public static void main(String[] args) {
		
		Connection conn = ConnectionFactory.getConnection();
		try {
			Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = stmt.executeQuery("select * from department");
			
			while(rs.next()) {
				System.out.println(rs.getString("dname"));
			}
			
			rs.absolute(1); // row you want to update like id.
			rs.updateString(2, "IT");
			rs.updateRow();
			rs.beforeFirst();
			System.out.println("--------------------------------");
		
			while(rs.next()) {
				System.out.println(rs.getString("dname"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
