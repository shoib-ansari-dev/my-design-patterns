package creational.prototype.learning;

public class Main {
    public static void main(String[] args) {
        ShapeCloaeable originalShape = new ShapeCloaeable("Circle", 5, "Red");
        originalShape.draw();
        ShapeCloaeable copiedShape = originalShape.clone();
        copiedShape.draw();
    }
}
