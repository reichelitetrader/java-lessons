package org.piotr.lesson7.school.schedule.meeting;

import lombok.Getter;
import lombok.Setter;
import org.piotr.lesson7.school.user.Teacher;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Appointment extends Meeting {
    private List<Teacher> teacherList = new ArrayList<>();

    public Appointment(Type type, LocalDateTime dateTime, Duration duration, String location) {
        super(type, dateTime, duration, location);
    }
}
