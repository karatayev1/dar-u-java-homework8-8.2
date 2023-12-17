import java.util.Objects;

public class Triangle implements Cloneable {
    int a, b, c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double square() {
        int p = this.a + this.b + this.c;
        return Math.sqrt(p / 2 * (p / 2 - a) * (p / 2 - b) * (p / 2 - c));
    }

    public double perimeter() {
        return this.a + this.b + this.c;
    }

    @Override
    public String toString() {
        return "Square: " + this.square() + "\n" +
                "Perimeter: " + this.perimeter() + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return a == triangle.a && b == triangle.b && c == triangle.c;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c);
    }

    @Override
    public Triangle clone() throws CloneNotSupportedException {
        return (Triangle) super.clone();
    }
}
