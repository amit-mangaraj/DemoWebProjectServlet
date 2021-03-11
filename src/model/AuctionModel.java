package model;

public class AuctionModel {
private int auctionid;
private int playerid;
private int teamid;
private int  auctionYear;
private int soldfor;
public int getAuctionid() {
	return auctionid;
}
public void setAuctionid(int auctionid) {
	this.auctionid = auctionid;
}
public int getPlayerid() {
	return playerid;
}
public void setPlayerid(int playerid) {
	this.playerid = playerid;
}
public int getTeamid() {
	return teamid;
}
public void setTeamid(int teamid) {
	this.teamid = teamid;
}
public int getAuctionYear() {
	return auctionYear;
}
public void setAuctionYear(int auctionYear) {
	this.auctionYear = auctionYear;
}
public int getSoldfor() {
	return soldfor;
}
public void setSoldfor(int soldfor) {
	this.soldfor = soldfor;
}
public AuctionModel(int auctionid, int playerid, int teamid, int auctionYear, int soldfor) {
	super();
	this.auctionid = auctionid;
	this.playerid = playerid;
	this.teamid = teamid;
	this.auctionYear = auctionYear;
	this.soldfor = soldfor;
}
public AuctionModel() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "AuctionModel [auctionid=" + auctionid + ", playerid=" + playerid + ", teamid=" + teamid + ", auctionYear="
			+ auctionYear + ", soldfor=" + soldfor + "]";
}


}
