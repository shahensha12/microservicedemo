package com.shahensha.testdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@PropertySource(value="com/shahensha/config/db.properties")
public class MyController {
	@Autowired
	private Environment envi;
	@RequestMapping(method=RequestMethod.GET,value="hi")
	public String dispmsg() {
		System.out.println(envi.getProperty("db.driverclass"));
		return "Cool you will learn.";
	}
}
