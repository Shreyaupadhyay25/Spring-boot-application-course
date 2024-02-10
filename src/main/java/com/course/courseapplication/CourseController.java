package com.course.courseapplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/course")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @PostMapping("/create")
    public Course createCourse(@RequestBody Course course) {
        return courseService.createCourse(course);
    }

    @PutMapping("/update/{id}")
    public Course updateCourse(@PathVariable Long id, @RequestBody Course updatedCourse) {
        return courseService.updateCourse(id, updatedCourse);
    }

    @GetMapping("/get/{id}")
    public Course getCourseById(@PathVariable Long id, @RequestParam String role) {
        return courseService.getCourseById(id, role);
    }
}
