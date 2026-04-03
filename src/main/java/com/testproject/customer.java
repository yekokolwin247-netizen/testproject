package com.testproject;

public class customer {
    public customer(String gender, String name, String address) {
        this.gender = gender;
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name, gender, address;
}
