package org.piotr.lesson7.school.schedule.meeting;

import lombok.Getter;
import lombok.Setter;
import org.piotr.lesson7.school.user.Student;
import org.piotr.lesson7.school.Subject;
import org.piotr.lesson7.school.user.Teacher;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class Lesson extends Meeting {
    private Subject subject;
    private List<Teacher> teacherList = new ArrayList<>();
    private List<Student> studentList = new ArrayList<>();

    public Lesson(LocalDateTime dateTime, Duration duration, String location, Subject subject) {
        super(Type.LESSON, dateTime, duration, location);
        this.subject = subject;
    }
}
