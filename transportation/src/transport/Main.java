package transport;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Horse seabiscuit = new Horse("Seabiscuit");
        Horse affirmed = new Horse("Affirmed");
        Horse joe = new Horse("Joe");

        seabiscuit.eat(10);
        affirmed.eat(25);
        seabiscuit.move();
        seabiscuit.move();
        seabiscuit.move();

        System.out.println("Seabiscuit's fuel level " + seabiscuit.getFuelLevel());
        System.out.println();

        System.out.println("*** From Abstract Classes ***");
        HorseFromVehicle secretariat = new HorseFromVehicle("Secretariat", 10);
        secretariat.addFuel(10);
        System.out.println("Secretariat has " + secretariat.getFuelLevel() + " amount of fuel");
        HorseFromVehicle trigger = new HorseFromVehicle("Trigger", 10);
        HorseFromVehicle seattleSlew = new HorseFromVehicle("Seattle Slew", 10);
        HorseFromVehicle americanPharoah = new HorseFromVehicle("American Pharoah", 10);
        HorseFromVehicle eclipse = new HorseFromVehicle("Eclipse");
    }
}