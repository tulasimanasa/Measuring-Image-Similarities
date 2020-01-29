public class Fan {
static final int SLOW = 1; 
static final int MEDIUM = 1;
static final int FAST = 1;

int speed;
boolean isFanOnOff;
double radius;
String color;
  
public Fan(){
speed = 0;
isFanOnOff = false;
radius = 0.0;
color = "";
}
  
public String toString(){
if(isFanOnOff){ 
return this.getSpeed()+" "+this.getColor()+" "+this.getRadius();
}else{
return this.getColor()+" "+this.getRadius()+" "+" fan is off";
}
}
public int getSpeed() {
return speed;
}
public void setSpeed(int speed) {
this.speed = speed;
}
public boolean isFanOnOff() {
return isFanOnOff;
}
public void setFanOnOff(boolean isFanOnOff) {
this.isFanOnOff = isFanOnOff;
}
public double getRadius() {
return radius;
}
public void setRadius(double radius) {
this.radius = radius;
}
public String getColor() {
return color;
}
public void setColor(String color) {
this.color = color;
}

public static void main(String[] args) {
Fan fan1 = new Fan(); 
fan1.setSpeed(Fan.FAST);
fan1.setRadius(10);
fan1.setColor("Yellow");
fan1.setFanOnOff(true);
  
System.out.println(fan1.toString());
  
Fan fan2 = new Fan();
fan2.setSpeed(Fan.MEDIUM);
fan2.setRadius(5);
fan2.setColor("Blue");
fan2.setFanOnOff(false);
  
System.out.println(fan2.toString());
}
}