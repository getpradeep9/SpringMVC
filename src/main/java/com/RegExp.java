package com;

public class RegExp {

	public static void main(String[] args) {

		//String pattern = "\\s+";
		
		String pattern = "<root\\s+xmlns=\"http://localhost\"></root>";
		
		String req="<root xmlns=\"http://localhost\"><fn>pradeep</fn><ln>padala</ln></root>";
		
		System.out.println(req.matches(pattern));
		
		String[] strs=req.split(pattern);
		
		for (String string : strs) {
			System.out.println(string);
		}

	}

}
