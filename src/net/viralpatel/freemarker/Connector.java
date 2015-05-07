package net.viralpatel.freemarker;

import freemarker.template.DefaultObjectWrapper;

public class Connector extends DefaultObjectWrapper {
	public Connector(String name,String className){
		this.name=name;
		this.className = className;
	}
	private String name, className;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}
}
