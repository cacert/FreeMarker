package net.viralpatel.freemarker;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

public class FTLHelloWorld {
	
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		try {
			
			Template template = cfg.getTemplate("src/helloworld.ftl");
			
			// Build the data-model
			Map<String, Object> data = new HashMap<String, Object>();
			data.put("message", "Hello World!");

			//List parsing 
			List<String> countries = new ArrayList<String>();
			countries.add("India");
			countries.add("United States");
			countries.add("Germany");
			countries.add("France");
			
			List<Connector> connectors = new ArrayList<Connector>();
			connectors.add(new Connector("conname", "connclassname"));
			connectors.add(new Connector("conname2", "connclassname2"));
			HashMap<String, String> users = new HashMap<String, String>();
			users.put("kasim", "sert");
			users.put("kasim2", "sert2");
			
			
			data.put("user", users);
			data.put("countries", countries);
			data.put("connectors", connectors);
			
			
			// Console output
			Writer out = new OutputStreamWriter(System.out);
			template.process(data, out);
			out.flush();

			// File output
			Writer file = new FileWriter (new File("C:\\FTL_helloworld.txt"));
			template.process(data, file);
			file.flush();
			file.close();
			
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (TemplateException e) {
			e.printStackTrace();
		}
	}
}
