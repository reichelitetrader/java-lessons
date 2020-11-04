package org.piotr.lesson7.school.schedule.meeting;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.Duration;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
public abstract class Meeting {
    enum Type {
        LESSON , ORGANIZATIONAL , DIDACTIC
    }

    private Type type;
    private LocalDateTime dateTime;
    private Duration duration;
    private String location;
}
