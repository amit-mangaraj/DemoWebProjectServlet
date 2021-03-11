package model;

import java.sql.Date;

public class PlayerModel {
	private int Player_id;
	private String Pname;
	private String skills;
	private Date DateofBirth;
	private int runs;
	private int wickets;
	private int noOfMatches;
	
	private String nationality;
	private int teamid;
	public int getPlayer_id() {
		return Player_id;
	}
	public void setPlayer_id(int player_id) {
		Player_id = player_id;
	}
	public String getPname() {
		return Pname;
	}
	public void setPname(String pname) {
		Pname = pname;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	public Date getDateofBirth() {
		return DateofBirth;
	}
	public void setDateofBirth(Date dateofBirth) {
		DateofBirth = dateofBirth;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public int getWickets() {
		return wickets;
	}
	public void setWickets(int wickets) {
		this.wickets = wickets;
	}
	public int getNoOfMatches() {
		return noOfMatches;
	}
	public void setNoOfMatches(int noOfMatches) {
		this.noOfMatches = noOfMatches;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public int getTeamid() {
		return teamid;
	}
	public void setTeamid(int teamid) {
		this.teamid = teamid;
	}
	public PlayerModel(int player_id, String pname, String skills, Date dateofBirth, int runs, int wickets,
			int noOfMatches, String nationality, int teamid) {
		super();
		Player_id = player_id;
		Pname = pname;
		this.skills = skills;
		DateofBirth = dateofBirth;
		this.runs = runs;
		this.wickets = wickets;
		this.noOfMatches = noOfMatches;
		this.nationality = nationality;
		this.teamid = teamid;
	}
	public PlayerModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "PlayerModel [Player_id=" + Player_id + ", Pname=" + Pname + ", skills=" + skills + ", DateofBirth="
				+ DateofBirth + ", runs=" + runs + ", wickets=" + wickets + ", noOfMatches=" + noOfMatches
				+ ", nationality=" + nationality + ", teamid=" + teamid + "]";
	}
	
	
	
}
