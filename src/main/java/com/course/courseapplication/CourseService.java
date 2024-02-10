package com.course.courseapplication;

import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

@Service
public class CourseService {
    private Map<Long, Course> courses = new HashMap<>();
    private Long courseIdCounter = 0L;

    public Course createCourse(Course course) {
        course.setId(++courseIdCounter);
        courses.put(course.getId(), course);
        return course;
    }

    public Course updateCourse(Long id, Course updatedCourse) {
        if (courses.containsKey(id)) {
            updatedCourse.setId(id);
            courses.put(id, updatedCourse);
            return updatedCourse;
        }
        return null;
    }

    public Course getCourseById(Long id, String role) {
        Course course = courses.get(id);
        if (course != null) {
            if (role.equals("student")) {
                // Provide simplified details for students
                return new Course(course.getId(), course.getName(), course.getSubject(), course.getChapters(), 0, null,
                        null, null);
            } else {
                // Provide full details for course developer/content developer
                return course;
            }
        }
        return null;
    }
}
