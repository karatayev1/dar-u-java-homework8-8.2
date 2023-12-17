import java.util.Objects;

public class Student implements Cloneable {
    String name;
    String surname;
    String address;
    int id;

    @Override
    public String toString() {
        return "Name: " + this.name + "\n" +
                "Surname: " + this.surname + "\n" +
                "Address: " + this.address + "\n" +
                "ID: " + this.id + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(surname, student.surname) && Objects.equals(address, student.address) && id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, address, id);
    }

    @Override
    public Student clone() throws CloneNotSupportedException {
        return (Student) super.clone();
    }
}
