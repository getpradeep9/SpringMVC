package com.up.uprr;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {

	public static void main(String[] args) throws IOException {
		
		File f=new File("E:/MavenExamples/Standalone/src/main/java/NewFile.xml");
		System.out.println(f.exists());
		
		File jsondataFile=new File("E:/MavenExamples/Standalone/src/main/java/jsondata.txt");
		InputStream is = new FileInputStream(jsondataFile);
		
		System.out.println(jsondataFile.exists());
		
		StringBuffer buffer = new StringBuffer();
	    byte[] b = new byte[4096];
	    for (int n; (n = is.read(b)) != -1;) {
	      buffer.append(new String(b, 0, n));
	    }
	    String jsonString = buffer.toString();
	    System.out.println(jsonString);
	    
	   
		
	}

}
