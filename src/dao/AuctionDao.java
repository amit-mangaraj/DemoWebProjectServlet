package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connection.MyConnection;
import model.AuctionModel;
import model.PlayerModel;
import model.AuctionModel;

public class AuctionDao {
	public boolean insertAuctionDetails(AuctionModel am) throws Exception {

		Connection mc=MyConnection.getConnection(); 
		PreparedStatement ps=mc.prepareStatement("insert into Auction values(?,?,?,?,?)");
		ps.setInt(1,am.getAuctionid());
		ps.setInt(2,am.getPlayerid());
		ps.setInt(3, am.getTeamid());
		ps.setInt(4, am.getAuctionYear());
		ps.setInt(5, am.getSoldfor());

		return ps.execute();
	}
	
	public List<AuctionModel> viewAllAuction() throws Exception
	{
		List<AuctionModel>li=new ArrayList<AuctionModel>();
		Connection mc=MyConnection.getConnection(); // TRanfers control to another 
		Statement ps=mc.createStatement();
		ResultSet rs=ps.executeQuery("select * from Auction");
		 while(rs.next()) {
             li.add(new AuctionModel(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getInt(4),rs.getInt(5)));
         }
		return li;
	}
	
	public AuctionModel getAuctionById(int id) throws Exception {
		AuctionModel p=new AuctionModel();
		List<AuctionModel> li=viewAllAuction();
		for(AuctionModel pm:li) {
			if(pm.getAuctionid() == id) {
				p.setAuctionid(id);
				p.setPlayerid(pm.getPlayerid());
				p.setTeamid(pm.getTeamid());
				p.setAuctionYear(pm.getAuctionid());
				p.setSoldfor(pm.getSoldfor());
			}
		}
		
		return p;
	}

	public boolean updateAuction(int aid, int pid, int tid, int year, int soldFor) throws Exception {
		// TODO Auto-generated method stub
		Connection mc=MyConnection.getConnection(); 
		PreparedStatement ps=mc.prepareStatement("UPDATE Auction SET Player_id=?,Teamid=?,Actyear=?,amount=? where Auctid=?");
		ps.setInt(1, pid);
		ps.setInt(2, tid);
		ps.setInt(3,year);
		ps.setInt(4, soldFor);
		ps.setInt(5, aid);
		return ps.execute();
	}
}
