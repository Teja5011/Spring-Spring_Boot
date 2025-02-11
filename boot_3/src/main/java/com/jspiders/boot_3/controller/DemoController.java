package com.jspiders.boot_3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.jspiders.boot_3.dao.DemoDao;

@Controller
public class DemoController 
{

	public static final String DemoDao = null;
	@Autowired
	public DemoDao dao;
}
