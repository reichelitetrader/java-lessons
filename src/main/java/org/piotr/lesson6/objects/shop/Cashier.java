package org.piotr.lesson6.objects.shop;

public class Cashier {
    private String id;
    private String name;
    private String surname;

    public Cashier(String id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
    @Override
    public String toString() {
        return "Cashier{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
