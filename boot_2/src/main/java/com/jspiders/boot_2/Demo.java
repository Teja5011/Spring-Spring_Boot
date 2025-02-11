package com.jspiders.boot_2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import lombok.Data;


@Data
@Component
public class Demo 
{
	@Value("1")
	private int id;
	@Value("tej")
	private String name;
	@Value("ravitejabandla5011@gmail.com")
	private String email;
	@Value("9542607687")
	private long phone;
}
