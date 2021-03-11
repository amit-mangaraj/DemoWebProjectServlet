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
import model.PlayerModel;
import model.TeamModel;

public class PlayerDao {
	public boolean insertPlayer(PlayerModel p) throws Exception {

		Connection mc=MyConnection.getConnection(); 
		PreparedStatement ps=mc.prepareStatement("insert into Player values(?,?,?,?,?,?,?,?,?)");
		ps.setInt(1, p.getPlayer_id());
		ps.setString(2, p.getPname());
		ps.setString(3, p.getSkills());
		ps.setDate(4, p.getDateofBirth());
		ps.setInt(5, p.getRuns());
		ps.setInt(6, p.getWickets());
		ps.setInt(7, p.getNoOfMatches());
		ps.setString(8, p.getNationality());
		ps.setInt(9,p.getTeamid());

		return ps.execute();
	}
	
	
	public List<PlayerModel> viewAll() throws Exception
	{
		List<PlayerModel>li=new ArrayList<PlayerModel>();
		Connection mc=MyConnection.getConnection(); // TRanfers control to another 
		Statement ps=mc.createStatement();
		ResultSet rs=ps.executeQuery("select * from player");
		 while(rs.next()) {
             li.add(new PlayerModel(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDate(4),rs.getInt(5),rs.getInt(6),
            		 rs.getInt(7),rs.getString(8),rs.getInt(9)));
         }
		return li;
	}
	
	public PlayerModel getPlayerById(int id) throws Exception {
		PlayerModel p=new PlayerModel();
		List<PlayerModel> li=viewAll();
		for(PlayerModel pm:li) {
			if(pm.getPlayer_id() == id) {
				p.setPlayer_id(id);
				p.setPname(pm.getPname());
				p.setSkills(pm.getSkills());
				p.setDateofBirth(pm.getDateofBirth());
				p.setRuns(pm.getRuns());;
				p.setWickets(pm.getWickets());
				p.setNoOfMatches(pm.getNoOfMatches());
				p.setNationality(pm.getNationality());
				p.setTeamid(pm.getTeamid());
			}
		}
		
		return p;
	}

	public boolean updatePlayer(int pid, String pname, String skill, Date dob, int wic, int runs, int matches, String pcountry,
			int tid) throws Exception {
		// TODO Auto-generated method stub

		Connection mc=MyConnection.getConnection(); 
		PreparedStatement ps=mc.prepareStatement("UPDATE Player SET Pname=?,skills=?,DateofBirth=?,runs=?,wickets=?,noOfMatches=?,nationality=?,Teamid=? where Player_id=?");
		ps.setString(1, pname);
		ps.setString(2,skill);
		ps.setDate(3,dob);
		ps.setInt(4, runs);
		ps.setInt(5, wic);
		ps.setInt(6,matches);
		ps.setString(7, pcountry);
		ps.setInt(8, tid);
		ps.setInt(9,pid);

		return ps.execute();
	}
}
