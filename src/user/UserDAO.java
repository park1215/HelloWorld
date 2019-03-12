package user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import util.DatabaseUtil;

public class UserDAO {
	//accessing DATABASE itself
	
	public int join(String userId, String userPassword){
		
		String SQL = "INSERT INTO USER VALUES(?, ?)";
		try {
		Connection conn = DatabaseUtil.getConnection();
		PreparedStatement pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1,  userId);
			pstmt.setString(2,  userPassword);
			return pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return -1;
	}
}
