package tw.leonchen.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity @Table(name = "account")
@Component
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id ;
	@Column(name = "USERNAME")
	private String userName;
	@Column(name = "USERPWD")
	private String userPwd;
	
	public Account() {
		
	}
	public Account(String username,String userpwd) {
		this.userName= username;
		this.userPwd= userpwd;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	

}
