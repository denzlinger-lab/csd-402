/*
Abram Denzlinger
February 7, 2026
6.2 Assignment

This program uses a Fan class to manage attributes like
fan speeds, size, color, and whether it's on or off.
It uses no-argument default and parameterized constructors
for flexible initialization, and setter and getter methods
for all mutable fields. It also uses a toString() method that
adjusts the output based on whether the fan is currently on or
off.
 */

public class Fan {
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan() {
        this.speed = STOPPED;
        this.on = false;
        this.radius = 6.0;
        this.color = "white";
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    // Getters and Setters
    public int getSpeed() { return speed; }
    public void setSpeed(int speed) { this.speed = speed; }
    public boolean isOn() { return on; }
    public void setOn(boolean on) { this.on = on; }
    public double getRadius() { return radius; }
    public void setRadius(double radius) { this.radius = radius; }
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    @Override
    public String toString() {
        if (on) {
            // Using String.format to keep columns aligned
            return String.format("STATUS: ON  | SPEED: %d | COLOR: %-7s | RADIUS: %.1f",
                    speed, color, radius);
        } else {
            return String.format("STATUS: OFF | COLOR: %-7s | RADIUS: %.1f (fan is off)",
                    color, radius);
        }
    }

    public static void main(String[] args) {
        // Create instances
        Fan fan1 = new Fan();
        Fan fan2 = new Fan(FAST, true, 10.0, "yellow");

        // Display with headers
        System.out.println("================ INITIAL STATE ================");
        System.out.println("Fan 1: " + fan1.toString());
        System.out.println("Fan 2: " + fan2.toString());

        // Demonstrate functionality
        System.out.println("\n----------- UPDATING FAN 1 -----------");
        fan1.setSpeed(MEDIUM);
        fan1.setOn(true);
        fan1.setRadius(8.5);
        fan1.setColor("blue");

        System.out.println("Property Check (Manual Getters):");
        System.out.println(" > Color: " + fan1.getColor());
        System.out.println(" > Speed: " + fan1.getSpeed());

        System.out.println("\n================ FINAL STATE ================");
        System.out.println("Fan 1: " + fan1.toString());
        System.out.println("Fan 2: " + fan2.toString());
        System.out.println("=============================================");
    }
}