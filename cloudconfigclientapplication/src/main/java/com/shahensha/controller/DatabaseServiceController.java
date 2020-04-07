package com.shahensha.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.shahensha.entity.DBdetails;
import com.shahensha.utility.DataSourceUtil;

@RestController
@RequestMapping(value="home")
public class DatabaseServiceController {

	@Autowired
	private DataSourceUtil dataSource;
	
	@RequestMapping(method=RequestMethod.GET,value="data")
	public DBdetails getDBDetails() {
		return new DBdetails(dataSource.getDriverclass(), dataSource.getUrl(), dataSource.getUsername(), dataSource.getPassword());
	}
	
}
