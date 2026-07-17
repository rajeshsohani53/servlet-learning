package com.rajesh.curdOperationTask;


public class Cartoon {
private String cname;
private String facCharacter;
private String channel;
public Cartoon() {
	super();
	// TODO Auto-generated constructor stub
}
public Cartoon(String cname, String facCharacter, String channel) {
	super();
	this.cname = cname;
	this.facCharacter = facCharacter;
	this.channel = channel;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public String getFacCharacter() {
	return facCharacter;
}
public void setFacCharacter(String facCharacter) {
	this.facCharacter = facCharacter;
}
public String getChannel() {
	return channel;
}
public void setChannel(String channel) {
	this.channel = channel;
}
}