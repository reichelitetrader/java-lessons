package org.piotr.lesson7.school;

import lombok.Getter;
import lombok.Setter;
import org.piotr.lesson7.school.user.Student;
import org.piotr.lesson7.school.user.Teacher;
import org.piotr.lesson7.school.user.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Getter
@Setter
public class School {
    private List<Teacher> teacherList = new ArrayList<>();
    private List<Student> studentList = new ArrayList<>();

    public boolean isUsernameTaken(String username) {
        List<User> users = getUsers();
        // return users.stream().anyMatch(user -> user.getUsername().equals(username));

        for (User user : users) {  // po uzytkownika petla
            if (user.getUsername().equals(username)) {
                return true;
            }
        }

        return false;
    }

    public boolean isUsernameAndPasswordCorrect(String username, String password) {
        List<User> users = getUsers();

        for (User user : users) {
            if(user.getUsername().equals(username)&&(user.getPassword().equals(password))){
                return true;
            }
        }

        return false;
    }

    private List<User> getUsers() {
        return Stream.concat(teacherList.stream(), studentList.stream()).collect(Collectors.toList());
    }

    public User getUserByUsername(String username) {
        List<User> users = getUsers();

        for (User user : users) {
            if(user.getUsername().equals(username)) {
                return user;
            }
        }

        return null;
    }
}
