package com.phoenix.planets;

public class Earth extends Planet {

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Earth moves around sun and moon");
	}

	@Override
	public void rotate() {
		// TODO Auto-generated method stub
		System.out.println("Earth rotates around its axis");
	}

	@Override
	public void revolve() {
		// TODO Auto-generated method stub
		System.out.println("Earth revolve around sun");
	}

	@Override
	public boolean supportsLife() {
		// TODO Auto-generated method stub
		return true;
	}

}
