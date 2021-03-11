package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connection.MyConnection;
import model.TeamModel;
import model.TeamModel;

public class TeamDao {
	public boolean insertTeam(TeamModel t) throws Exception {

		Connection mc=MyConnection.getConnection(); 
		PreparedStatement ps=mc.prepareStatement("insert into Team values(?,?,?,?)");
		ps.setInt(1, t.getTeam_id());
		ps.setString(2, t.getTeamname());
		ps.setString(3, t.getOwnername());
		ps.setString(4, t.getCoachname());
		return ps.execute();
	}
	
	public List<TeamModel> viewAllTeam() throws Exception
	{
		List<TeamModel>li=new ArrayList<TeamModel>();
		Connection mc=MyConnection.getConnection(); // TRanfers control to another 
		Statement ps=mc.createStatement();
		ResultSet rs=ps.executeQuery("select * from Team");
		 while(rs.next()) {
             li.add(new TeamModel(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4)));
         }
		return li;
	}
	
	public TeamModel getTeamById(int id) throws Exception {
		TeamModel t=new TeamModel();
		List<TeamModel> li=viewAllTeam();
		for(TeamModel tm:li) {
			if(tm.getTeam_id() == id) {
				t.setTeam_id(id);
				t.setTeamname(tm.getTeamname());
				t.setOwnername(tm.getOwnername());
				t.setCoachname(tm.getCoachname());
			}
		}
		
		return t;
	}

	public boolean updateTeam(int pid, String pname, String oname, String cname) throws Exception {
		// TODO Auto-generated method stub
		Connection mc=MyConnection.getConnection(); 
		PreparedStatement ps=mc.prepareStatement("UPDATE Team SET Teamname=?,ownername=?,coachname=? where Teamid=?");
		ps.setString(1, pname);
		ps.setString(2, oname);
		ps.setString(3, cname);
		ps.setInt(4, pid);
		return ps.execute();
	}
	
	
}
