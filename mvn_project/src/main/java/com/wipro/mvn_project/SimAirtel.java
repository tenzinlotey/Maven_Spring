package com.wipro.mvn_project;

import org.springframework.stereotype.Component;

@Component("airtel")
public class SimAirtel {
	public SimAirtel()
	{
		System.out.println("SimAirtel created....");
	}
	public void call(long phoneNo) {
		System.out.println("Making a call:"+phoneNo);
	}
	
	public void sendMessage(long phoneNo, String msg) {
		System.out.println("Sending msg:"+msg+"To phone number:"+phoneNo);
	}
}
