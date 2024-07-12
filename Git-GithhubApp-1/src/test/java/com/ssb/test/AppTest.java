package com.ssb.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.ssb.service.Arithmetic;

public class AppTest 
{
	@Test
	public void testWithPositive() {
		Arithmetic ar=new Arithmetic();
		int expected=-40;
		int actual=ar.sum(20, 20);
		assertEquals(expected, actual);
	}
}
