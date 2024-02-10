package com.course.courseapplication;

import java.util.List;

public class Course {
    private Long id;
    private String name;
    private String subject;
    private int chapters;
    private int numberOfClasses;
    private CourseType type;
    private LearnMode learnMode;
    private List<String> teachers; // Assuming multiple teachers for a course

    // Constructors
    public Course() {
        // Default constructor
    }

    public Course(Long id, String name, String subject, int chapters, int numberOfClasses, CourseType type,
            LearnMode learnMode, List<String> teachers) {
        this.id = id;
        this.name = name;
        this.subject = subject;
        this.chapters = chapters;
        this.numberOfClasses = numberOfClasses;
        this.type = type;
        this.learnMode = learnMode;
        this.teachers = teachers;
    }

    // Getters and setters for other fields
    // ...

    // Setter for id field
    public void setId(Long id) {
        this.id = id;
    }

    // Getter for id field
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public int getChapters() {
        return chapters;
    }

    public CourseType getType() {
        return type;
    }

    public void setType(CourseType type) {
        this.type = type;
    }

    public int getNumberOfClasses() {
        return numberOfClasses;
    }

    public void setNumberOfClasses(int numberOfClasses) {
        this.numberOfClasses = numberOfClasses;
    }

    public LearnMode getLearnMode() {
        return learnMode;
    }

    public void setLearnMode(LearnMode learnMode) {
        this.learnMode = learnMode;
    }

    public List<String> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<String> teachers) {
        this.teachers = teachers;
    }

}
