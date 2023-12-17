import java.util.Objects;

public class Average implements Cloneable {
    int x;
    int y;
    int z;

    public Average(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double returnAverage() {
        return (this.x + this.y + this.z) / 3;
    }

    @Override
    public String toString() {
        return "Average: " + this.returnAverage();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Average average = (Average) o;
        return x == average.x && y == average.y && z == average.z;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }

    @Override
    public Average clone() throws CloneNotSupportedException {
        return (Average) super.clone();
    }
}
