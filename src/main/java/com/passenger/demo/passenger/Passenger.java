package com.passenger.demo.passenger;

public class Passenger {
    private String title;
    private String name;
    private Long ID;
    private Long phoneNumber;
    private Integer age;

    public Passenger() {
    }

    public Passenger(String title, String name, Long ID, Long phoneNumber, Integer age) {
        this.title = title;
        this.name = name;
        this.ID = ID;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "title='" + title + '\'' +
                ", name='" + name + '\'' +
                ", ID=" + ID +
                ", phoneNumber=" + phoneNumber +
                ", age=" + age +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
