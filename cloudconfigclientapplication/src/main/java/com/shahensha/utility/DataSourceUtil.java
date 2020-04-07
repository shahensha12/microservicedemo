package com.shahensha.utility;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Configuration
@ConfigurationProperties(prefix="db")
//@Data
//@Setter
//@Getter
//@AllArgsConstructor
//@ToString
public class DataSourceUtil {
	private String driverclass;
	private String url;
	private String username;
	private String password;
	
	DataSourceUtil(){
		super();
	}

	public String getDriverclass() {
		return driverclass;
	}

	public void setDriverclass(String driverclass) {
		this.driverclass = driverclass;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "DataSourceUtil [driverclass=" + driverclass + ", url=" + url + ", username=" + username + ", password="
				+ password + "]";
	}

	public DataSourceUtil(String driverclass, String url, String username, String password) {
		super();
		this.driverclass = driverclass;
		this.url = url;
		this.username = username;
		this.password = password;
	}
	
}
