package com.propertiesfilereader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;



public class prop {
	
		 public static Properties p;
		public static  File f;
		 public static Reader obj;
		 
		public static void loaddata() throws IOException{
			 p= new Properties();
			  f = new File("C:\\Ayushi Revise\\proj\\src\\main\\java\\com\\propertiesfilereader\\regdata.properties");
			 obj = new FileReader(f);
			 p.load(obj);
		}

}
