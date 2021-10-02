package com.Archana;

import static org.junit.Assert.*;

import org.junit.Test;

public class JenkinsTest {

	@Test
	public void Addtest() {
		Jenkins mycal = new Jenkins();
		assertEquals(10,mycal.addNum(5,5));
	}
	
	@Test
	public void Subtest() {
		Jenkins mycal = new Jenkins();
		assertEquals(10,mycal.SubNum(10,5));
	}

}
