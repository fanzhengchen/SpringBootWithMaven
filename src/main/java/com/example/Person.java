package com.example;

/**
 * Created by mark on 16-2-4.
 */
public class Person {
    private Integer age;
    private String gender;
    private String name;
    private String birthday;
    private Long id;

    public Person() {

    }

    public Person(Integer age, String gender, String name, String birthday) {
        this.age = age;
        this.gender = gender;
        this.name = name;
        this.birthday = birthday;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
