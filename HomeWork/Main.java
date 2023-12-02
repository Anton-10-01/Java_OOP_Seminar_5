package Java_OOP_Seminar_5.HomeWork;

import java.util.Arrays;
import java.util.List;

import Java_OOP_Seminar_5.HomeWork.controller.Controller;
import Java_OOP_Seminar_5.HomeWork.model.Student;
import Java_OOP_Seminar_5.HomeWork.model.StudyGroup;
import Java_OOP_Seminar_5.HomeWork.model.Teacher;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Teacher teacher = new Teacher(1, "Anton Razzjivin");
        List<Student> students = Arrays.asList(
            new Student(1, "Student 1"),
            new Student(2, "Student 2"),
            new Student(3, "Student 3")
        );

        Controller controller = new Controller();
        StudyGroup group = controller.createAndReturnEducationalGroup(teacher, students);

        System.out.println("Учебная группа с преподавателем " + group.getTeacher().getName() + " и " +
                group.getStudents().size() + " студентами создана.");
    }
}