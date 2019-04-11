package demo;

import java.util.Scanner;

class Fan{
    private int speed;
    private String color;
    private double radius;
    private boolean on;

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public int getSpeed() {
        return speed;
    }

    public String getColor() {
        return color;
    }

    public double getRadius() {
        return radius;
    }

    public boolean getOn() {
        return on;
    }
    public Fan(){
        this.on = false;
    }
    public String toString(){
        if (on == true) {
            if (speed == 1) {
                return "speed " + "SLOW" +"\n"+
                        "color " + color +"\n"+
                        "radius " + radius;
            }
            if (speed == 2) {
                return "speed " + "MEDIUM" +"\n"+
                        "color " + color +"\n"+
                        "radius " + radius;
            }
            if (speed == 3) {
                return "speed " + "FAST" +"\n"+
                        "color " + color +"\n"+
                        "radius " + radius;
            }
        }
        return "fan is off"+"\n"+
                "color " + color +"\n"+
                "radius " + radius;
    }
}

public class demo{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fan fan = new Fan();
        fan.setSpeed(scanner.nextInt());
        fan.setColor(scanner.next());
        fan.setRadius(scanner.nextDouble());
        fan.setOn(scanner.nextBoolean());
        System.out.println(fan.toString());
    }
}