package org.piotr.lesson7.school;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.piotr.lesson7.school.user.Student;
import org.piotr.lesson7.school.user.Teacher;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@RequiredArgsConstructor
public class Grade {
    enum Number {
        BEGINNER, ADVANCED, PROFICIENCY
    }
    enum Extension {
        ENGLISH, MATHEMATICS, PHYSICS
    }

    @NonNull private Number number;

    private List<Student> studentList = new ArrayList<>();
    private List<Teacher> educatorsList = new ArrayList<>();
    private List<Extension> extensionList = new ArrayList<>();

}
