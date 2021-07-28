package com.example.demo.dto;

import java.io.Serializable;

public class LoginDto implements Serializable {

	private static final long serialVersionUID = 1L;

	/** ユーザアカウント */
	private String loginName;

	/** パスワード */
	private String loginPassword;

	/** 結果メッセージ */
	private String resultMessage;

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	public String getResultMessage() {
		return resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

}
