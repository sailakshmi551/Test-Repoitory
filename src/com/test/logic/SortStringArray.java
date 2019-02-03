package com.test.logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class SortStringArray 
{
	public static void main(String[] args)
	{
		List<String> names = new ArrayList<String>();
		names.add("Sai Lakshmi");
		names.add("neha");
		names.add("karthik");
		names.add("Priya");
		names.add("Anurag");
		
		Collections.sort(names);
		
		//Print the sorted list
		System.out.println("List after the use of Collections.sort():\n"+names);
		//assertTrue(Ordering.natural().isOrdered(names));
	}
	
	
		
	}
	

