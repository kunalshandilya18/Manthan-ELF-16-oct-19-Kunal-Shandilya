package com.manthan.dao;

import java.sql.SQLException;

import com.manthan.beans.UserInfoBean;

public interface UserInfoDAO {
	
	public boolean register(String name,String password,int age,String gender) throws SQLException;
	public UserInfoBean login(String name,String Password) throws SQLException;
	public UserInfoBean authenticate(int empId, String empPassword);

	}



