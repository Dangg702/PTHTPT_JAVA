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
	        String sql = "SELECT * FROM dict WHERE word = ? OR mean = ?"; 
	        PreparedStatement pstm = conn.prepareStatement(sql);
	        pstm.setString(1, word);
	        pstm.setString(2, word); // nếu input không phải là từ mà là nghĩa, thì sẽ tìm các từ có nghĩa này
	        
	        ResultSet rs = pstm.executeQuery();
	        
	        while (rs.next()) {                 
	            String foundWord = rs.getString("word");
	            String foundMean = rs.getString("mean");
	            // Kiểm tra đầu vào là từ hay nghĩa và in ra tương ứng
	            if (word.equalsIgnoreCase(foundWord)) {
	                result = foundMean;
	            } else if (word.equalsIgnoreCase(foundMean)) {
	                result = foundWord;
	            }
	        }
	        
	        conn.close();
	        pstm.close();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return result;
	}
}
