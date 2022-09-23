package Server;

import java.util.Date;

public class Person {
    private String name;
    private String lastame;
    private String surname;
    private String sexo;
    private String state;
    private String birthday;

    public Person() {
    }

    public Person(String name, String lastame, String surname, String sexo, String state, String birthday) {
        this.name = name;
        this.lastame = lastame;
        this.surname = surname;
        this.sexo = sexo;
        this.state = state;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastame() {
        return lastame;
    }

    public void setLastame(String lastame) {
        this.lastame = lastame;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
