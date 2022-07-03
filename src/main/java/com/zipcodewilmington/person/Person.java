package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;

    private String gender;
    private String favColor;
    private String race;
    private String dateBirth;
    private Boolean single;

    public Person() {
        this.name = "";
        this.age = Integer.MAX_VALUE;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
    this.name = name;

    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return this.gender;
    }
    public void setFavColor(String favColor) {
        this.favColor= favColor;
    }

    public String getFavColor() {
        return this.favColor;
    }
    public void setRace(String race) {
        this.race = race;
    }

    public String getRace() {
        return this.race;
    }
    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }

    public String getDateBirth() {
        return this.dateBirth;
    }
    public void setSingle(Boolean single) {
        this.single = single;
    }

    public Boolean getSingle() {
        return this.single;
    }
}
