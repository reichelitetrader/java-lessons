package org.piotr.lesson7.school.user;

import lombok.Getter;
import lombok.Setter;
import org.piotr.lesson7.school.Language;
import org.piotr.lesson7.school.Subject;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Teacher extends User {

    public Teacher(String name, String surname, String username, String password) {
        super(name, surname, username, password);
    }

    private List<Subject> subjects = new ArrayList<>();
    private List<Language> Languages = new ArrayList<>();
}
