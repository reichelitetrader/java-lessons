package org.piotr.lesson7;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class PhoneNumber {

    public static final String POLAND_PREFIX = "+48";   // zmienna utworzona bedzie tylko raz

    private String value;                               // zmienna tworzona z kazdym obiektem klasy PhoneNumber

    public String getPolishNumber() {
        return POLAND_PREFIX + value;
    }
}
