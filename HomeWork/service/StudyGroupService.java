package Java_OOP_Seminar_5.HomeWork.service;

import java.util.List;

import Java_OOP_Seminar_5.HomeWork.model.Teacher;
import Java_OOP_Seminar_5.HomeWork.model.Student;
import Java_OOP_Seminar_5.HomeWork.model.StudyGroup;

/**
 * StudyGroupService
 */
public class StudyGroupService {

    public StudyGroup createStudyGroup(Teacher teacher, List<Student> students){
        return new StudyGroup(teacher, students);
    }
}