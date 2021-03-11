package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import connection.MyConnection;
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
}
