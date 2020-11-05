package demo.transaction_management;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jdbc.demo.ConnectionFactory;

public class TransactionManagement {
	
	public static void main(String[] args) {
		
		Connection connection = null;
		
		try {
			connection = ConnectionFactory.getConnection();
			connection.setAutoCommit(false);
			PreparedStatement pstm = connection.prepareStatement("update account set balance = balance -10 where id = ?");
			pstm.setInt(1, 1);
			pstm.executeUpdate();
			
			pstm = connection.prepareStatement("update account set balance = balance +10 where id = ?");
			pstm.setInt(1, 2);
			pstm.executeUpdate();
			connection.commit();
		} catch (SQLException e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		
	}

}
