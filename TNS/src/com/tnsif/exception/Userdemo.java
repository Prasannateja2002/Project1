package com.tnsif.exception;

public class Userdemo {

	public static void main(String[] args) {
		try {
			Userdefined.validate();
		} catch (Age e) {
			// TODO Auto-generated catch block
			System.out.println("exception caught"+e.getMessage());
		}
	}

}
