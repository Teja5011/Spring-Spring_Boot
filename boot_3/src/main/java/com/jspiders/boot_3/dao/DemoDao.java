package com.jspiders.boot_3.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
@Repository
public interface DemoDao 
{
	void save();
}

@Component
class DemoDaoJDBCIMPL implements DemoDao
{

	@Override
	public void save() 
	{
		System.out.println("dao save : JDBC");	
	}
	
}

@Component
class DemoDaoHibernateIMPL implements DemoDao
{

	@Override
	public void save() 
	{
		System.out.println("dao save : Hibernate");	
	}
	
}

@Component
class DemoDaoJPAIMPL implements DemoDao
{

	@Override
	public void save() 
	{
		System.out.println("dao save : JPA");	
	}
	
}

