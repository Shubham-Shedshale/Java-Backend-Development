

package com.jspiders.FileHandling;

import java.io.File;
import java.io.IOException;

public class DeleteFileMain 
{
    public static void main(String[] args) {
		File ref=new File("c:/FILEIO/Demo.txt");
		boolean flag=ref.exists();
		if(flag==true)
		{
				ref.delete()
				System.out.println("File Deleted");
		}
			
		else
		{
			System.out.println("File/folder not found");
		}
	}
}