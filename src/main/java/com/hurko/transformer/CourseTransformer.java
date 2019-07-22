package com.hurko.transformer;

import com.hurko.model.CourseEntity;
import com.hurko.model.SectionEntity;
import com.hurko.model.dto.Course;
import com.hurko.model.dto.Section;
import com.hurko.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

import static java.util.stream.Collectors.toList;

@Component
public class CourseTransformer {

    @Autowired
    private SectionTransformer sectionTransformer;

    public List<Course> buildCourses(List<CourseEntity> entities) {
        return entities.stream()
                       .map(this::buildCourse)
                       .collect(toList());
    }

    public Course buildCourse(CourseEntity courseEntity) {
        List<Section> sections = courseEntity.getSections() == null
                ? Collections.emptyList()
                : sectionTransformer.buildSections(courseEntity.getSections());
        return Course.builder()
                     .id(courseEntity.getId())
                     .cost(courseEntity.getCost())
                     .creationDate(courseEntity.getCreationDate())
                     .name(courseEntity.getName())
                     .sections(sections)
                     .build();
    }

    public CourseEntity buildCourseEntity(Course course) {
        List<SectionEntity> sections = course.getSections() == null
                ? Collections.emptyList()
                : sectionTransformer.buildSectionsEntities(course.getSections());
        return new CourseEntity()
                .setCost(course.getCost())
                .setName(course.getName())
                .setSections(sections);
    }
}
