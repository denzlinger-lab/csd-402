/*
Abram Denzlinger
February 15, 2026
Assignment 7.2

UseFans serves as a driver class to demonstrate the practical application
of the Fan class through collection management and state manipulation.
* * This class :
* 1. Utilizes an ArrayList to store and manage multiple
* Fan instances dynamically.
* 2. Retrieves, modifies, and updates objects within a
* list using reference variables.
* 3. Uses static helper methods (displayFans and displayFan)
* to provide both batch and individual formatted output of fan properties.
* 4. Shows fans at different speeds and states.
*/

import java.util.ArrayList;
import java.util.List;

public class UseFans {

    public static void main(String[] args) {
        // 1. Initialize the collection
        List<Fan> fanInventory = new ArrayList<>();

        // 2. Add a collection of Fan instances
        fanInventory.add(new Fan(Fan.SLOW, true, 10.0, "blue"));
        fanInventory.add(new Fan(Fan.MEDIUM, true, 12.0, "red"));
        fanInventory.add(new Fan(Fan.STOPPED, false, 8.5, "white"));

        System.out.println("=== INITIAL STATE OF ALL FANS ===");
        displayFans(fanInventory);

        // 3. Demonstrate functionality: Modify fans within the collection
        System.out.println("\n>>> UPDATING FAN STATES...");

        // Update the 1st fan (index 0)
        Fan firstFan = fanInventory.get(0);
        firstFan.setSpeed(Fan.FAST);
        firstFan.setColor("gold");

        // Update the 3rd fan (index 2) - Turn it ON
        Fan thirdFan = fanInventory.get(2);
        thirdFan.setOn(true);
        thirdFan.setSpeed(Fan.MEDIUM);

        // 4. Display specific updates using the single-instance method
        System.out.println("\n=== VERIFYING INDIVIDUAL UPDATES ===");
        System.out.print("Updated Fan #1: ");
        displayFan(firstFan);
        System.out.print("Updated Fan #3: ");
        displayFan(thirdFan);

        // 5. Final overview of the entire collection
        System.out.println("\n=== FINAL STATE OF ALL FANS ===");
        displayFans(fanInventory);
    }

    /**
     * Method to display a whole collection
     */
    public static void displayFans(List<Fan> fans) {
        System.out.printf("%-10s | %-8s | %-8s | %-6s\n", "COLOR", "STATUS", "SPEED", "RADIUS");
        System.out.println("--------------------------------------------------");
        for (Fan f : fans) {
            String status = f.isOn() ? "ON" : "OFF";
            System.out.printf("%-10s | %-8s | %-8d | %.1f\n",
                    f.getColor(), status, f.getSpeed(), f.getRadius());
        }
    }

    /**
     * Method to display a single Fan instance
     */
    public static void displayFan(Fan f) {
        String status = f.isOn() ? "ON" : "OFF";
        System.out.printf("[%s] Color: %s, Speed: %d, Radius: %.1f\n",
                status, f.getColor(), f.getSpeed(), f.getRadius());
    }
}