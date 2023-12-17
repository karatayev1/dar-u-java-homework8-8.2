import java.util.Objects;

public class Rectangle implements Cloneable {
    int a, b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public double returnArea() {
        return this.a * this.b;
    }

    @Override
    public String toString() {
        return "Area: " + this.returnArea();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return a == rectangle.a && b == rectangle.b;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }

    @Override
    public Rectangle clone() throws CloneNotSupportedException {
        return (Rectangle) super.clone();
    }
}
