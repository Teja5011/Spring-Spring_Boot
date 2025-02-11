package com.jspiders.boot_3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component   //create object in the container
public class CinemaHall
{
	@Autowired
	@Qualifier("devara")
		Movie movie;
}


