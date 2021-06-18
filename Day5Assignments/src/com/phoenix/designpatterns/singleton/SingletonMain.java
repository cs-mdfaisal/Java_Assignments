package com.phoenix.designpatterns.singleton;

public class SingletonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Earth e=Earth.getInstance();
		e.createLife();
		System.out.println("*************\n");
		
		Sun s=Sun.getInstance();
		s.giveLight();
		System.out.println("*************\n");
		
		
		PrimeMinister pm=PrimeMinister.getInstance();
		pm.serveNation();
		System.out.println("*************\n");
		
		President p=President.getInstance();
		p.representNation();
		System.out.println("*************");
		
		
		
		}

}
