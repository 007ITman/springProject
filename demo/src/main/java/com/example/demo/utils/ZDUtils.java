package com.example.demo.utils;

import java.sql.Date;

public class ZDUtils {

	public Date getSystemTime() {
		
		return new java.sql.Date(System.currentTimeMillis());
	}
}
