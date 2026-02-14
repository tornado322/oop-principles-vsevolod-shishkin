import com.figures.Circle;
import com.figures.Rectangle;
import com.figures.Shape;
import com.figures.Vector2;
import com.university.Aspirant;
import com.university.Student;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------------------");
        doStudentLogic();
        System.out.println("-------------------");
        doShapesLogic();
    }

    static void doStudentLogic() {
        Student[] students = new Student[4];

        students[0] = new Student("Иван", "Иванов", "33", 5);
        students[1] = new Student("Петя", "Петров", "12", 4.7);
        students[2] = new Aspirant("Евгений", "Евгеньев", "22", 3.7, "Работа по органической химии");
        students[3] = new Aspirant("Антон", "Антонов", "40", 5, "Статья в журнал");

        System.out.println(students[0].getScholarship());
        System.out.println(students[1].getScholarship());
        System.out.println(students[2].getScholarship());
        System.out.println(students[3].getScholarship());
    }

    static void doShapesLogic() {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Rectangle(new Vector2(12, 10), new Vector2(15, 15), "#b6a89a");
        shapes[1] = new Circle(new Vector2(59, 59), 5, "#cfb53b");
        shapes[2] = new Rectangle(new Vector2(88, 80), new Vector2(90, 83), "#e6e6fa");
        shapes[3] = new Circle(new Vector2(1, 9), 7, "#e6e0da");

        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
