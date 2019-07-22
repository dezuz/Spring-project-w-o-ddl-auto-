package com.hurko.controller;

import com.hurko.model.dto.Course;
import com.hurko.model.dto.SpecificationRequest;
import com.hurko.service.CourseService;
import com.hurko.transformer.CourseTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/course")
public class CourseController {

    @Autowired
    private CourseTransformer courseTransformer;

    @Autowired
    private CourseService courseService;

    @GetMapping
    public List<Course> findAll() {
        return courseTransformer.buildCourses(courseService.findAll());
    }

    @PostMapping("/search")
    public List<Course> findAllBySpecification(@RequestBody SpecificationRequest request) {
        return courseTransformer.buildCourses(courseService.findAll(request));

    }

    @PostMapping
    public void create(@RequestBody Course course) {
        courseService.createCourse(courseTransformer.buildCourseEntity(course));
    }

    @GetMapping(path = "/{id}")
    public Course findById(@PathVariable("id") Long id) {
        return courseTransformer.buildCourse(courseService.findById(id));
    }

    @PutMapping(path = "/{id}")
    public void update(@PathVariable("id") Long id, @RequestBody Course course) {
        courseService.updateCourse(id, courseTransformer.buildCourseEntity(course));
    }

    @DeleteMapping(path = "/{id}")
    public void delete(@PathVariable("id") Long id) {
        courseService.deleteById(id);
    }
}
