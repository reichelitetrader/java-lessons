package org.piotr.lesson7.school.user;

import lombok.Getter;
import lombok.Setter;
import org.piotr.lesson7.school.Mark;
import org.piotr.lesson7.school.schedule.StudentSchedule;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Student extends User {

    private List<Mark> marks = new ArrayList<>();
    private List<StudentSchedule> schedules = new ArrayList<>();

    public Student(String name, String surname, String username, String password) {
        super(name, surname, username, password);
    }

}
