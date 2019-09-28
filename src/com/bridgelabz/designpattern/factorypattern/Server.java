package com.bridgelabz.designpattern.factorypattern;

public class Server extends Computer {

	  private String ram;
	  private String hdd;
	  private String cpu;
	
	 public Server(String ram,String hdd,String cpu) {
		  this.cpu=cpu;
		  this.hdd=hdd;
		  this.ram=ram;
		
	}
	  
	@Override
	public String getRAM() {
		// TODO Auto-generated method stub
		return this.ram;
	}

	@Override
	public String getHDD() {
		// TODO Auto-generated method stub
		return this.hdd;
	}

	@Override
	public String getCPU() {
		// TODO Auto-generated method stub
		return this.cpu;
	}
}
