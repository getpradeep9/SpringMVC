/*package com.up.uprr;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLStreamReader;

import org.codehaus.jettison.json.JSONObject;
import org.codehaus.jettison.mapped.Configuration;
import org.codehaus.jettison.mapped.MappedNamespaceConvention;
import org.codehaus.jettison.mapped.MappedXMLStreamReader;

import com.up.Root;

public class Tl9 {

	*//**
	 * @param args
	 * @throws FileNotFoundException 
	 *//*
	public static void main(String[] args) throws Exception  {

		File jsonFile=new File("E:/MavenExamples/Standalone/src/main/java/jsondata.txt");
		InputStream is = new FileInputStream(jsonFile);
		OutputStream output = System.out;
		
		StringBuffer buffer = new StringBuffer();
	    byte[] b = new byte[4096];
	    for (int n; (n = is.read(b)) != -1;) {
	      buffer.append(new String(b, 0, n));
	    }
	    String jsonString = buffer.toString();
	    System.out.println(jsonString);
		
		JAXBContext jc = JAXBContext.newInstance(Root.class);
		 
        JSONObject obj = new JSONObject(jsonString);
        Configuration config = new Configuration();
        MappedNamespaceConvention con = new MappedNamespaceConvention(config);
        XMLStreamReader xmlStreamReader = new MappedXMLStreamReader(obj, con);
 
        Unmarshaller unmarshaller = jc.createUnmarshaller();
        Root root = (Root) unmarshaller.unmarshal(xmlStreamReader);
 
        Marshaller marshaller = jc.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(root, System.out);

	}

}
*/