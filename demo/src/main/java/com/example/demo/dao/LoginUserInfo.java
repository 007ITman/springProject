package com.example.demo.dao;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//加盐加密算法追加后，需要重新做一个表，这个DTO也需要重新生成
@Entity
@Table(name="LOGINUSERINFO")
public class LoginUserInfo {

	@Id
	@Column(name="USERID")
	//声明自增已经自增策略
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public String userID;

	@Column(name="USERNAME")
	public String userName;

	@Column(name="USERPASSWORD")
	public String userPassWord;

	@Column(name="CREATETIME")
	public Date createTime;

	@Column(name="UPDATETIME")
	public Date updateTime;

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassWord() {
		return userPassWord;
	}

	public void setUserPassWord(String userPassWord) {
		this.userPassWord = userPassWord;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}
