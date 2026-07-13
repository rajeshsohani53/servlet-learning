package com.rajesh.menu;

public class Menu {
  private String item; 
  private String price; 
  private String  desc;
  public Menu() {
	//super();
	// TODO Auto-generated constructor stub
  }
  private Menu(String item, String price, String desc) {
	super();
	this.item = item;
	this.price = price;
	this.desc = desc;
  }
  public String getItem() {
	return item;
  }
  public void setItem(String item) {
	this.item = item;
  }
  public String getPrice() {
	return price;
  }
  public void setPrice(String price) {
	this.price = price;
  }
  public String getDesc() {
	return desc;
  }
  public void setDesc(String desc) {
	this.desc = desc;
  }
  @Override
  public String toString() {
	return "Menu [item=" + item + ", price=" + price + ", desc=" + desc + "]";
  }
  
  
  
  
}
