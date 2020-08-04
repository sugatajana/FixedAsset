package FixedAssetProject.Model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class userMaster extends mShared {
	
	@Column(name = "userId")
	public long userId;
	
	public String userName;

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	} 
	
	

}
