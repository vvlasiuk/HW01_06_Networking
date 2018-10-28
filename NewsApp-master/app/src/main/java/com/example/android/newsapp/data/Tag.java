package com.example.android.newsapp.data;

public class Tag {

    private String firstName;
    private String lastName;

    public Tag(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
