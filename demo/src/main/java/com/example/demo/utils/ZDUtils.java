package com.example.demo.utils;

import java.sql.Date;

import org.springframework.stereotype.Repository;

@Repository
public class ZDUtils {

	public Date getSystemTime() {
		
		return new java.sql.Date(System.currentTimeMillis());
	}
}
