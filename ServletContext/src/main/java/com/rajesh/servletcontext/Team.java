package com.rajesh.servletcontext;

public class Team {
  private String teamName;
  private String trophies;
  private String player;
  public Team() {
	
	// TODO Auto-generated constructor stub
  }
  public Team(String teamName, String trophies, String player) {
	super();
	this.teamName = teamName;
	this.trophies = trophies;
	this.player = player;
  }
  public String getTeamName() {
	return teamName;
  }
  public void setTeamName(String teamName) {
	this.teamName = teamName;
  }
  public String getTrophies() {
	return trophies;
  }
  public void setTrophies(String trophies) {
	this.trophies = trophies;
  }
  public String getPlayer() {
	return player;
  }
  public void setPlayer(String player) {
	this.player = player;
  }
}
