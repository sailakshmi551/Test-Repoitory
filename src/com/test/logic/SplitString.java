package com.test.logic;

public class SplitString 
{
	public static void main(String[] args) 
	{
//		String str = "testfile.jpeg";
//		String extension = str.substring(str.lastIndexOf(".") + 1);
//		System.out.println("Extension is:"+extension);
		
		String ele = "(4)";
		String subString = ele.substring(1, ele.length()-1);
		System.out.println(subString);
		
		String name = "Displaying 4 assets";
		boolean validateassets = name.contains(subString);
		System.out.println("Validating assets::"+validateassets);
		
				
		
	}
}
