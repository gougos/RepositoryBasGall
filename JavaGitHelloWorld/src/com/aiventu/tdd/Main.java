package com.aiventu.tdd;

public class Main {

	public static void main(String[] args) {
		SMSModule smsModule = new SMSModule();
		// test1
		if (!smsModule.getVersion().equals("1.0")) {
			System.out.println("diff : 1.0 --> " + smsModule.getVersion());
		}
		// test2
		try {
			smsModule.send(" ");
		} catch (IllegalArgumentException e) {
			System.out.println("Ok");
			return ;
		} catch (Exception e) {
			System.out.println("Wrong Exception");
		}
		System.out.println("sms Module don't throw the exception");
		System.out.println("ooo");
	}

}
