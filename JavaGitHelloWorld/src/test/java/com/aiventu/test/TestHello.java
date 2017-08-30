package com.aiventu.test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

public class TestHello {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() {
		String test = "hello";
		System.out.println("hello");
		assertEquals(test, "hello");
	}

}
