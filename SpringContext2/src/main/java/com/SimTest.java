package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.model.Jio;
import com.model.Sim;


@Component("test")
//@Scope("prototype")
public class SimTest {
	
	
	@Autowired
	Sim sim;	
	
	@Qualifier("jio")
	@Autowired
	Sim sim2;
	public void test()
	{
		sim.call();
		sim2.call();
	}

}
