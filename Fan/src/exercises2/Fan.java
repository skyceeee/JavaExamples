package exercises2;

public class Fan {
	/*UML DÝAGRAM
	 * -SLOW:int
	 * -MEDÝUM:int
	 * -FAST:int
	 * -speed:int
	 * -on:boolean
	 * -radius:double
	 * +color:String
	 * +Fan():
	 * +toString():String
	 */
	public static final int SLOW=1;
	public static final int MEDÝUM=2; //NE YAPTIK ANLAMADIM!!!
	public static final int FAST=3;
	private int speed;
	private boolean on;
	private double radius;
    private String color;
    
    public Fan(){
    	speed=SLOW;
    	on=true;
    	radius=4;
    	color="blue";
    	}
    public int getSpeed(){
    	return speed;
    	
    }
    public void setSpeed(int speed) {
    	this.speed=speed;
    }
    public boolean isOn() {
    	return on;
    	
    }
    public void setOn(boolean on) {
    	this.on=on;
    }
    public double getRadius() {
    	return radius;
    }
    public void setRadius(double radius) {
    	this.radius=radius;
    }
    public String getColor() {
    	return color;
    }
    public void setColor(String color) {
    	this.color=color;
    }
   
    public String toString() {
    
    	if(on) {
    		return speed + "," + color+"," + radius;
    	}else {
    		return color + "," + radius + "," + "FAN ÝS OFF.";
    	}
    	
    	
    	
    }
	

}
