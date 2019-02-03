package com.test.logic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sorting_Array 
{
	
	    public static void main(String[] args) 
	    { 
	        // Create a list of strings 
	        List<String> al = new ArrayList<String>(); 
	        al.add("Geeks For Geeks"); 
	        al.add("Friends"); 
	        al.add("Dear"); 
	        al.add("Is"); 
	        al.add("Superb"); 
	  
	        /* Collections.sort method is sorting the 
	        elements of ArrayList in ascending order. */
	        Collections.sort(al); 
	  
	        // Let us print the sorted list 
	        System.out.println("List after the use of" + 
	                           " Collection.sort() :\n" + al); 
	    } 
	}

