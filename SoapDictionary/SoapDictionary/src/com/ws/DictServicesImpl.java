package com.ws;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.jws.WebService;

@WebService(endpointInterface = "com.ws.DictServices")
public class DictServicesImpl implements DictServices{
	@Override
	public String dictENtoVn(String word) {
		String result = null;
		
		try {
			Connection conn = JDBCUtil.getConnection();
			
			String sql = "SELECT * FROM dict Where word = ?"; 
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, word);
						
			ResultSet rs = pstm.executeQuery();
			
			while (rs.next()) {				 
				result=word.toUpperCase()  + ": " + rs.getString("mean");
			}
			conn.close();
			pstm.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
}
