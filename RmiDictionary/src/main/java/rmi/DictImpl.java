package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DictImpl extends UnicastRemoteObject implements IDict {

	protected DictImpl() throws RemoteException {
		super();
	}

	public String dictENtoVn(String word) throws RemoteException {
		String result = null;
		
		try {
			//Bước 1: tạo kết nối đến CSDL
			Connection connection = JDBCUtil.getConnection();
			
//			//Bước 2: tạo đối tượng statement
//			Statement statement = connection.createStatement();

			//Bước 3 thực thi câu lệnh sql
			String sql = "SELECT * FROM dict JOIN detail ON dict.id = detail.id Where word = ?"; 
			PreparedStatement pstm = connection.prepareStatement(sql);
			pstm.setString(1, word);
						
			ResultSet rs = pstm.executeQuery();
			
			while (rs.next()) {				 
				String x = rs.getString("detail");
				System.out.println(x);
				result = x;
			}
			//Bước 4 xử lý
			System.out.println("Bạn đã thực thi: "+ sql);
			if(result == null) {
				result = "Không tìm thấy từ cần tra!";
			}
			//bước 5: đóng kết nối
			JDBCUtil.closeConnection(connection);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	public int addWord(String word, String mean) throws RemoteException {
		int result = 0;
		try {
			Connection connection = JDBCUtil.getConnection();
			
			String sql = "Insert into dict(id, word, mean) Values(?, ?, ?)";
			PreparedStatement pstmt = connection.prepareStatement(sql);

			pstmt.setString(2, word);
			pstmt.setString(3, mean);
			
			pstmt.executeUpdate();
			
			System.out.println("Bạn đã thực thi: "+ sql);
			System.out.println("Add word successfully");
			result = 1;
			JDBCUtil.closeConnection(connection);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public int updateMean(String word, String mean) throws RemoteException {
		int result = 0;
		try {
			Connection connection = JDBCUtil.getConnection();
			
			String sql = "update dict set mean = ? where word = ?";
			PreparedStatement pstmt = connection.prepareStatement(sql);

			pstmt.setString(1, mean);
			pstmt.setString(2, word);
			
			pstmt.executeUpdate();
			
			System.out.println("Bạn đã thực thi: "+ sql);
			System.out.println("Update mean successfully");
			result = 1;
			JDBCUtil.closeConnection(connection);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public int delete(String word) throws RemoteException {
		int result = 0;
		try {
			Connection connection = JDBCUtil.getConnection();
			
			String sql = "delete from dict where word = ?";
			PreparedStatement pstmt = connection.prepareStatement(sql);

			pstmt.setString(1, word);
			
			pstmt.executeUpdate();
			
			System.out.println("Bạn đã thực thi: "+ sql);
			System.out.println("Delete word successfully");
			result = 1;
			JDBCUtil.closeConnection(connection);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
