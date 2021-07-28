package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.dao.LoginUserInfoDao;
import com.example.demo.dto.LoginDto;
import com.example.demo.repository.UserInfoRepository;
import com.example.demo.utils.ZDUtils;

@Repository
public class LoginService {

	@Autowired
	UserInfoRepository userInfoRepository;
	
	@Autowired
	ZDUtils zdUtils;
	
	// 登録データをデータベースに挿入することs
	public boolean APInsert(LoginDto loginDto) {
		
		LoginUserInfoDao userInfo = new LoginUserInfoDao();
		// ユーザアカウント
		userInfo.setUserName(loginDto.getLoginName());
		// パスワード
		userInfo.setUserPassWord(loginDto.getLoginPassword());
		// 登録時間
		userInfo.setCreateTime(zdUtils.getSystemTime());
		// 更新時間
		userInfo.setUpdateTime(zdUtils.getSystemTime());
		userInfoRepository.save(userInfo);
		return true;
	}
}
