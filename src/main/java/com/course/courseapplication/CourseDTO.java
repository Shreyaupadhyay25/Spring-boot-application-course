package com.course.courseapplication;

// CourseDTO.java
public class CourseDTO {
    private Long id;
    private String name;
    private String subject;
    private int chapters;

    // Constructors, getters, and setters

    // Constructor
    public CourseDTO(Long id, String name, String subject, int chapters) {
        this.id = id;
        this.name = name;
        this.subject = subject;
        this.chapters = chapters;
    }

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

    // Getters and setters (omitted for brevity)
}
