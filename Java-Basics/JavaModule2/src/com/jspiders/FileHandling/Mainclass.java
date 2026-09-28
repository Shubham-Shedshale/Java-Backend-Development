package com.jspiders.FileHandling;

import java.io.File;

public class Mainclass 
{
    public static void main(String[] args) {
		File ref=new File("c:/FILEIO");
		boolean flag=ref.exists();
		if(flag==false)
		{
			ref.mkdir();
			System.out.println("Folder Created");
		}
		else
		{
			System.out.println("Folder Already Existed");
		}
	}
}
