package org.piotr.lesson7.school.schedule;

import lombok.NonNull;

import java.time.LocalDateTime;

public class StudentSchedule extends Schedule {

    public StudentSchedule(@NonNull LocalDateTime validFrom, @NonNull LocalDateTime validTo, @NonNull LocalDateTime lastUpdate) {
        super(validFrom, validTo, lastUpdate);
    }
}
