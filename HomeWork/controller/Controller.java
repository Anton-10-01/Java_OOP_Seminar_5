package Java_OOP_Seminar_5.HomeWork.controller;

import java.util.List;

import Java_OOP_Seminar_5.HomeWork.model.Teacher;
import Java_OOP_Seminar_5.HomeWork.model.Student;
import Java_OOP_Seminar_5.HomeWork.model.StudyGroup;
import Java_OOP_Seminar_5.HomeWork.service.StudyGroupService;

/**
 * Controller
 */
public class Controller {

    private StudyGroupService studyGroupService;

    public Controller() {
        studyGroupService = new StudyGroupService();
    }

    public StudyGroup createAndReturnEducationalGroup(Teacher teacher, List<Student> students) {
        return studyGroupService.createStudyGroup(teacher, students);
    }
}