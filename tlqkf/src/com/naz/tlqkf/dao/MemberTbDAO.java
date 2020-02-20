package com.naz.tlqkf.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;

import com.naz.tlqkf.vo.MemberTbVO;

public class MemberTbDAO {
	public int memberInsert(MemberTbVO vo) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user="babo";
		String password="bako";
		Connection con = null;
		PreparedStatement pstmt = null;
		int inct=0;
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			String query = "insert into memberTb values(?, ?, ?, ?)";
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, vo.getUserName());
			pstmt.setString(2, vo.getUserId());
			pstmt.setString(3, vo.getUserPw());
			pstmt.setString(4, vo.getUserAddr());
			inct = pstmt.executeUpdate();
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally{
			if(pstmt != null)
				try { pstmt.close(); } catch (SQLException e) { }
				
			if(con != null)
				try { con.close(); } catch (SQLException e) { }
		}
		
		return inct;
	}

}
