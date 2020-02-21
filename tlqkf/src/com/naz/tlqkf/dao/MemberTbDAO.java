package com.naz.tlqkf.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;

import com.naz.tlqkf.vo.MemberTbVO;

public class MemberTbDAO {	
	public int memberInsert(MemberTbVO vo) {	// db에 값 보내는거
		String driver = "oracle.jdbc.driver.OracleDriver";	// 드라이버 설정 (mysql인지 오라클인지 그런거)
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe"; // ip, port, sid 필수
		String user="babo";									// 접속 db id
		String password="bako";								// 접속 db pw
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
	
	
	
	public List<MemberTbVO> getMembers() {	// db에서 가져오는거
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user="babo";
		String password="bako";
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<MemberTbVO> list = new ArrayList<MemberTbVO>();
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			String query = "select * from memberTb";
			pstmt = con.prepareStatement(query);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				MemberTbVO vo = new MemberTbVO();
				vo.setUserName(rs.getString("userName"));
				vo.setUserId(rs.getString("userId"));
				vo.setUserPw(rs.getString("userPw"));
				vo.setUserAddr(rs.getString("userAddr"));
				list.add(vo);
			}
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally{
			if(rs != null)
				try { rs.close(); } catch (SQLException e) { }
			
			if(pstmt != null)
				try { pstmt.close(); } catch (SQLException e) { }
				
			if(con != null)
				try { con.close(); } catch (SQLException e) { }
		}
		
		return list;
	}

	
	public int memberInsert(String id) {	// db에서 삭제 - 근데 구현 못함
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe"; // ip, port, sid 필수
		String user="babo";
		String password="bako";
		Connection con = null;
		PreparedStatement pstmt = null;
		int inct=0;
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			String query = "delete memberTb where userId = ?";
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, id);
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
