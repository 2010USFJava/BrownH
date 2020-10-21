package com.bean;

public class Coffee {
 
	private String grind;
	private boolean hot;
	private int size;
	private String beanType;
	Roast roastType;
	
	
	public Coffee() {
		this.grind = "medium";
		this.hot = true;
		this.size = 2;
		this.beanType = "arabica";
	}


	public Coffee(String grind, boolean hot, int size, String beanType) {
		super();
		this.grind = grind;
		this.hot = hot;
		this.size = size;
		this.beanType = beanType;
	}


	public String getGrind() {
		return grind;
	}


	public void setGrind(String grind) {
		this.grind = grind;
	}


	public boolean isHot() {
		return hot;
	}


	public void setHot(boolean hot) {
		this.hot = hot;
	}


	public int getSize() {
		return size;
	}


	public void setSize(int size) {
		this.size = size;
	}


	public String getBeanType() {
		return beanType;
	}


	public void setBeanType(String beanType) {
		this.beanType = beanType;
	}


	@Override
	public String toString() {
		return "Coffee [grind=" + grind + ", hot=" + hot + ", size=" + size + ", beanType=" + beanType + ", roastType="
				+ roastType + "]";
	}
	
	
}
