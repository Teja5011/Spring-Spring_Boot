package com.jspiders.boot_3;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


public interface Movie 
{
	void showTime();
}

@Primary
@Component
class Devara implements Movie
{
	@Override
	
	public void showTime()
	{
		System.out.println("devara movie: first show");
	}
}

@Primary  //provide priorty over o/p
@Component
class Gorintaku implements Movie
{
	@Override
	public void showTime()
	{
		System.out.println("gorintaku movie: eveng show");
	}
}

@Component
class GameChanger implements Movie
{
	@Override
	public void showTime()
	{
		System.out.println("Game changer: noon show");
	}
}


