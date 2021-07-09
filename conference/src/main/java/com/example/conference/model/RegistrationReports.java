package com.example.conference.model;

public class RegistrationReports {

    private String name;
    private String course;
    private String courseDescription;

    public RegistrationReports(String name, String course, String courseDescription) {
        this.name = name;
        this.course = course;
        this.courseDescription = courseDescription;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }
}
