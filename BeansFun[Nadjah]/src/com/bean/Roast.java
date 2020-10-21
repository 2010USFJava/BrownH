package com.bean;

public class Roast {
  private String type;
  
  
  public Roast(){
		
		this.type = "medium";
	}
  
public Roast(String type) {
	super();
	this.type = type;
}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}
  
  
}
