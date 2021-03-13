package model;

import java.sql.Date;

public class UserModel {
	private int  id;
	private String FirstName;
	private String LastName;
	private String email;
	private String username;
	private String Password;
	private Date regdate;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public UserModel(int id, String firstName, String lastName, String email, String username, String password,
			Date regdate) {
		super();
		this.id = id;
		FirstName = firstName;
		LastName = lastName;
		this.email = email;
		this.username = username;
		Password = password;
		this.regdate = regdate;
	}
	public UserModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "UserDao [id=" + id + ", FirstName=" + FirstName + ", LastName=" + LastName + ", email=" + email
				+ ", username=" + username + ", Password=" + Password + ", regdate=" + regdate + "]";
	}
}
