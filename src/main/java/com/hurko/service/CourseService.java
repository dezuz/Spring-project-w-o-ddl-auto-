package com.hurko.service;

import com.hurko.model.CourseEntity;
import com.hurko.model.dto.SpecificationRequest;

import java.util.List;

public interface CourseService {

    List<CourseEntity> findAll();

    CourseEntity createCourse(CourseEntity course);

    CourseEntity findById(Long id);

    CourseEntity updateCourse(Long id, CourseEntity course);

    void deleteById(Long id);

    List<CourseEntity> findAll(SpecificationRequest request);
}
