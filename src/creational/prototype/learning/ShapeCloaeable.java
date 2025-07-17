package creational.prototype.learning;

public class ShapeCloaeable implements Cloneable{
    private String type;
    private int size;
    private String color;

    public ShapeCloaeable(String type, int size, String color) {
        this.type = type;
        this.size = size;
        this.color = color;
    }
    public void draw() {
        System.out.println("Drawing a " + color + " " + type + " of size " + size);
    }

    @Override
    public ShapeCloaeable clone() {
        try {
            return (ShapeCloaeable) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("Cloning not supported", e);
        }
    }
}
