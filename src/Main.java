// Homework 8, 8.2
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        // Task 1
        Student student1 = new Student();
        student1.name = "Алиса";
        student1.surname = "Смит";
        student1.address = "Коктем-2";
        student1.id = 24;
        System.out.println(student1);

        Student student2 = new Student();
        student2.name = "Азамат";
        student2.surname = "Каратаев";
        student2.address = "Абая 9";
        student2.id = 66;
        System.out.println(student2);

        Student student3 = new Student();
        student3.name = "Кристина";
        student3.surname = "Орлова";
        student3.address = "Жандосова 58";
        student3.id = 45;
        Student student4 = student1.clone();
        System.out.println(student3);
        System.out.println(student1.equals(student3));
        System.out.println(student1.hashCode() == student3.hashCode());
        System.out.println(student4.toString());
        System.out.println("..........");

        // Task 2
        Triangle triangle = new Triangle(3, 4, 5);
        Triangle triangle2 = new Triangle(3, 4, 5);
        Triangle triangle3 = triangle.clone();
        System.out.println("Площадь треугольника: " + triangle.square());
        System.out.println("Периметр треугольника: " + triangle.perimeter());
        System.out.println(triangle.toString());
        System.out.println(triangle.equals(triangle2));
        System.out.println(triangle.hashCode() == triangle2.hashCode());
        System.out.println(triangle3.toString());
        System.out.println("..........");

        // Task 3
        Rectangle rectangle1 = new Rectangle(5, 9);
        System.out.println(rectangle1.returnArea());
        Rectangle rectangle2 = new Rectangle(10, 14);
        Rectangle rectangle3 = rectangle2.clone();
        System.out.println(rectangle2.returnArea());
        System.out.println(rectangle2.toString());
        System.out.println(rectangle1.equals(rectangle2));
        System.out.println(rectangle1.hashCode() == rectangle2.hashCode());
        System.out.println(rectangle3.toString());
        System.out.println("..........");

        // Task 4
        Average average = new Average(5, 10, 15);
        Average average1 = new Average(5, 10, 15);
        Average average3 = average1.clone();
        System.out.println("Среднее значение трех чисел: " + average.returnAverage());
        System.out.println(average.toString());
        System.out.println(average.equals(average1));
        System.out.println(average.hashCode() == average1.hashCode());
        System.out.println(average3.toString());
        System.out.println("..........");

        // Task 5
        Movie movie1 = new Movie("Фокус", "RatPac-Dune Entertainment", "R");
        Movie movie2 = new Movie("Главный герой", "20th Century Studios");
        Movie movie3 = new Movie("Фокус", "RatPac-Dune Entertainment", "R");
        Movie movie4 = movie2.clone();
        System.out.println(movie1);
        System.out.println(movie2);
        System.out.println(movie1.equals(movie3));
        System.out.println(movie1.hashCode() == movie3.hashCode());
        System.out.println(movie4.toString());
        System.out.println("..........");
    }
}