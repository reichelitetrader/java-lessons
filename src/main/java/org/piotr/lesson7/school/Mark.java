package org.piotr.lesson7.school;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.piotr.lesson7.school.user.Student;
import org.piotr.lesson7.school.user.Teacher;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
public class Mark {

    @Getter
    @AllArgsConstructor
    enum Value {
        ONE(1), ONE_PLUS(1.5), TWO(2), TWO_PLUS(2.5);

        private final double value;
    }

    private Value markValue;
    private Subject subject;
    private Teacher teacher;
    private Student student;
    private LocalDateTime dateTime;
}
