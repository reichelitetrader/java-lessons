package org.piotr.lesson7.school.schedule;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.piotr.lesson7.school.schedule.meeting.Appointment;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
@Setter
public class TeacherSchedule extends Schedule {
    private Map<DayOfWeek, List<Appointment>> meetings = new HashMap<>();

    public TeacherSchedule(@NonNull LocalDateTime validFrom, @NonNull LocalDateTime validTo, @NonNull LocalDateTime lastUpdate) {
        super(validFrom, validTo, lastUpdate);
    }
}
