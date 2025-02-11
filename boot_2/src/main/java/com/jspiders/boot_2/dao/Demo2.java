package com.jspiders.boot_2.dao;

import org.springframework.stereotype.Repository;

import lombok.Data;

@Data
@Repository
public class Demo2 
{
	private int id;
	private String name;
	private String email;
	private long phone;
}
