package com.ty;

public class Person
{
	private Mobile mobile;

	public Mobile getMobile() {
		return mobile;
	}

	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}
	
	public void use()
	{
		System.out.println("phone is ringing");
		mobile.ring();
	}

}
