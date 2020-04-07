package com.shahensha.entity;

import org.springframework.context.annotation.Configuration;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Configuration
//@Data
//@Setter
//@Getter
//@AllArgsConstructor
//@ToString
public class DBdetails {
	
	private String DriverClass;
	private String url;
	private String UserName;
	private String Password;
	
	
	DBdetails(){
		super();
	}


	public String getDriverClass() {
		return DriverClass;
	}


	public void setDriverClass(String driverClass) {
		DriverClass = driverClass;
	}


	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	public String getUserName() {
		return UserName;
	}


	public void setUserName(String userName) {
		UserName = userName;
	}


	public String getPassword() {
		return Password;
	}


	public void setPassword(String password) {
		Password = password;
	}


	public DBdetails(String driverClass, String url, String userName, String password) {
		super();
		this.DriverClass = driverClass;
		this.url = url;
		this.UserName = userName;
		this.Password = password;
	}

}
