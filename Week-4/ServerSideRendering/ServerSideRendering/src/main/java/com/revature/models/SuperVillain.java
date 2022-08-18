package com.revature.models;

public class SuperVillain {
	private String name;
	private String superPower;
	private int bounty;
	public SuperVillain(String name, String superPower, int bounty) {
		super();
		this.name = name;
		this.superPower = superPower;
		this.bounty = bounty;
	}
	
	public SuperVillain() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSuperPower() {
		return superPower;
	}

	public void setSuperPower(String superPower) {
		this.superPower = superPower;
	}

	public int getBounty() {
		return bounty;
	}

	public void setBounty(int bounty) {
		this.bounty = bounty;
	}
	
}
