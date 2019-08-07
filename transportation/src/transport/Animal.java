// With interfaces, the  original developer decides "what" the object can do, the later developer decides "how" the object does it

package transport;

public interface Animal {
    void move();

    void eat(int i);

    String speak();
}
