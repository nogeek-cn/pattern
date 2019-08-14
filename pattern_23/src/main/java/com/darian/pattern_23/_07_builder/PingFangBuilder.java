package com.darian.pattern_23._07_builder;

public class PingFangBuilder implements HouseBuilder {
	House house = new House();

	public void makeFloor() {
		house.setFloor("平方-->地板");
	}

	public void makeHousetop() {
		house.setHousetop("平方-->房顶");
	}

	public void makeWall() {
		house.setWall("平方-->墙");
	}

	public House getHouse() {
		return house;
	}

}
