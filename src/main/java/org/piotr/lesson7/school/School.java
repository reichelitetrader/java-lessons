package org.piotr.lesson7.school;

import lombok.Getter;
import lombok.Setter;
import org.piotr.lesson7.school.user.Student;
import org.piotr.lesson7.school.user.Teacher;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class School {
    private List<Teacher> teacherList = new ArrayList<>();
    private List<Student> studentList = new ArrayList<>();

}
