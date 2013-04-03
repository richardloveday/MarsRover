package com.loveday.domain;



public class Rover {
	
	private int x;
	private int y;
	public char baring;
	
	public Rover(int x, int y, char baring) {
		this.x = x ;
		this.y = y ;
		this.baring = baring;
	}
	
	

	public void command (String commands){
		for (int i = 0 ; i < commands.length(); i++)
			process(commands.charAt(i));
		System.out.println(x + " " + y + " " + baring);
		
	}
	
	public char getBaring() {
		return baring;
	}

	public void process(char c){
		switch(c){
		case 'L' : this.turnLeft(this.getBaring());
		break;
		case 'R' : this.turnRight(this.getBaring());
		break;
		case 'M' : this.move(this.getBaring());
		break;
		}
	}	
	public void turnLeft(char baring){
		switch (baring){
		case 'N' : this.setBaring('W');
		break;
		case 'E' : this.setBaring('N');
		break;
		case 'S' : this.setBaring('E');
		break;
		case 'W' : this.setBaring('S');
		break;
		}
	}	

	public void turnRight(char baring){
		switch (baring){
		case 'N' : this.setBaring('E');
		break;
		case 'E' : this.setBaring('S');
		break;
		case 'S' : this.setBaring('W');
		break;
		case 'W' : this.setBaring('N');
		break;
		}
	}
	
	public void move(char baring){
		switch (baring){
		case 'N' : this.y++;
		break;
		case 'E' : this.x++;
		break;
		case 'S' : this.y--;
		break;
		case 'W' : this.x--;
		}
	}
	

	public void setBaring(char baring) {
		this.baring = baring;
		
	}
	
	public static void main (String [] args){
		
		new Rover(1,2,'N').command("LMLMLMLMM");
		new Rover(3,3,'E').command("MMRMMRMRRM");
	}


}
