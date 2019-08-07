package transport;

public class Horse implements Vehicle, Animal {
    // fields

    private int fuel = 0;
    private String name;

    // default constructor
    public Horse() {

    }

    // constructor
    public Horse(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    // implement the interfaces
    @Override
    public void move() {
        fuel = fuel - 1;
    }

    @Override
    public void eat(int i) {
        fuel = fuel + i;
    }

    @Override
    public String speak() {
        return "Neigh";
    }

    @Override
    public String getPath() {
        return "Grass";
    }

    @Override
    public int getFuelLevel() {
        return fuel;
    }

    @Override
    public void addFuel(int i) {
        eat(i);
    }
}