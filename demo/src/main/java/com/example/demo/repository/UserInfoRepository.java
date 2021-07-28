package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.dao.LoginUserInfo;

@Repository
public interface UserInfoRepository extends JpaRepository<LoginUserInfo, Long>{

}
