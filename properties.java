package external.main.resources;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;


public class properties {
	
	 public static void main(String[] args) throws IOException{
		 
		 Properties properties = new Properties();
		 properties.setProperty("Assignment", "Phone directory");
		 
		 FileWriter writer = new FileWriter("conf.properties");
		 
		 properties.store(writer, "/Users/user/Desktop/writer.txt");
	     writer.close();
	 }

	 
}
