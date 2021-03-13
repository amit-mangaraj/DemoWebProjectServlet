package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

import connection.MyConnection; 
import model.UserModel;

public class UserDao {

	public boolean insertUser(UserModel ud) throws Exception {

		Connection mc=MyConnection.getConnection(); 
		PreparedStatement ps=mc.prepareStatement("insert into USER values(?,?,?,?,?,?,?,?,?)");
		ps.setInt(1, ud.getId());
		ps.setString(2, ud.getFirstName());
		ps.setString(3, ud.getLastName());
		ps.setString(4, ud.getEmail());
		ps.setString(6, ud.getUsername());
		ps.setString(7, ud.getPassword());
		ps.setDate(8, ud.getRegdate());
		return ps.execute();
	}
	
}
