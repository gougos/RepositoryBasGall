package com.aiventu;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

//C'est a dire declencher les tests unitaires avec des params
@RunWith(Parameterized.class)
public class TestSendParametrized {

	SMSModule sm = new SMSModule();

	public TestSendParametrized(String message) {
		this.message = message;
		System.out.println("Objet 2 creer");
		System.out.println(" Obj 3  créér");
		System.out.println(" Obj 4  créér");
	}

	String message;
    
	
	@Test
	public void test() { }

	@SuppressWarnings("rawtypes")
	@Parameters
	public static List data() {
		Object[][] data = {{"52 418 766"},{"22 283 428"},{""} };
		return Arrays.asList(data);
	}
//	@Ignore@Parameters
//	public static List datal() {
//		Object[][] data = {{"52 418 766","8446","0"},{"22 283 428"},{"775555"} };
//		return Arrays.asList(data);
//	}
	/*
	 * Dans ce cas on declare plusieurs attributs , message-Caractére-result
	 */
	/*
	 * Dans ce cas il y a une erreur car le test n'est pas un expect de IllegalArgument Eception
	 */

}
