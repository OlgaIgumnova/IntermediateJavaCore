import java.util.ArrayList;
import java.util.Arrays;

public class App {

    public static void buttonClick() {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Николай", new ArrayList<>(Arrays.asList(4.0, 5.0, 4.0, 5.0, 5.0, 5.0)), "Информатика"));
        students.add(new Student("Антон", new ArrayList<>(Arrays.asList(5.0, 5.0, 5.0, 5.0, 5.0, 5.0 , 5.0)), "Информатика"));
        students.add(new Student("Надежда", new ArrayList<>(Arrays.asList(5.0, 5.0, 5.0, 5.0, 5.0)), "Математика"));
        students.add(new Student("Вероника", new ArrayList<>(Arrays.asList(4.0, 5.0, 5.0, 5.0, 4.0)), "Физика"));
        students.add(new Student("Линда", new ArrayList<>(Arrays.asList(5.0, 5.0, 5.0, 4.0, 5.0)), "Физика"));
        students.add(new Student("Елизавета", new ArrayList<>(Arrays.asList(4.0, 5.0, 5.0, 4.0, 5.0)), "Информатика"));
        students.add(new Student("Артем", new ArrayList<>(Arrays.asList(3.0, 3.0, 3.0, 4.0, 5.0)), "Информатика"));
        students.add(new Student("Анжелика", new ArrayList<>(Arrays.asList(4.0, 5.0, 5.0, 4.0, 5.0, 5.0)), "Информатика"));
        students.add(new Student("Ольга", new ArrayList<>(Arrays.asList(5.0, 5.0, 5.0, 4.0, 5.0)), "Информатика"));
        students.add(new Student("Вениамин", new ArrayList<>(Arrays.asList(5.0, 5.0, 5.0, 4.0, 5.0)), "Информатика"));

        FilterStudents.filterInformatics(students)
                .forEach(System.out::println);
    }
}