package com.jspiders.FileHandling;

import java.io.File;
import java.io.IOException;

public class CreateFile 
{
    public static void main(String[] args) {
		File ref=new File("c:/FILEIO/Demo.txt");
		boolean flag=ref.exists();
		if(flag==false)
		{
			try {
				ref.createNewFile();
				System.out.println("File created");
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("File already exist");
		}
	}
}
