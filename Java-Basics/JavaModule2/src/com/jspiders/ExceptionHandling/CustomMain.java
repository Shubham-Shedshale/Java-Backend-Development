package com.jspiders.ExceptionHandling;

class InvalidPhoneNumberException extends Exception
{
	InvalidPhoneNumberException()
	{
		
	}
	InvalidPhoneNumberException(String msg)
	{
		super(msg);
	}
}

class CheckPhoneNumber
{
	static void check(String phone) throws InvalidPhoneNumberException
	{
		if(phone.length()!=10)
		{
			throw new InvalidPhoneNumberException("Invalid Phone Number");
		}
	}
}

public class CustomMain 
{
    public static void main(String[] args) {
		try
		{
			//CheckPhoneNumber.check("87445433");
			CheckPhoneNumber.check("8744543333");
			CheckPhoneNumber.check("87445433");


		}
		catch(InvalidPhoneNumberException e)
		{
			e.printStackTrace();
		}
	}
}
