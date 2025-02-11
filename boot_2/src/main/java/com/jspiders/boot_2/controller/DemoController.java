package com.jspiders.boot_2.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jspiders.boot_2.Demo;

//@Controller
//@ResponseBody
@RestController
public class DemoController 
{
	
		
		@Autowired
		Demo d;
		
		//MAPPING PATH: http:localhost:8080/m1
		@RequestMapping("/m1")
		public void m1()
		{
			System.out.println("m1 method");
		}
		
		@RequestMapping("/m2")
		//MAPPING PATH: http:localhost:8080/m2
		public String m2()
		{
			return "m2 method";
		}
		
		@GetMapping("/  m3")
		@RequestMapping("/m3")
		public Demo m3()
		{
			return d;
		}
		
		
		@RequestMapping("/m4")
		public List<Demo> m4()
		{
			List<Demo> list=new ArrayList<Demo>();
			list.add(d);
			list.add(d);
			list.add(d);
			return list;
		}
		
	
	
}
