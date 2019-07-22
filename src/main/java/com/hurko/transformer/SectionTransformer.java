package com.hurko.transformer;

import com.hurko.model.SectionEntity;
import com.hurko.model.dto.Lesson;
import com.hurko.model.dto.Section;
import com.hurko.service.CourseService;
import com.hurko.service.SectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

import static java.util.stream.Collectors.toList;

@Component
public class SectionTransformer {

    @Autowired
    private CourseService courseService;

    @Autowired
    private LessonTransformer lessonTransformer;

    public List<Section> buildSections(List<SectionEntity> sections) {
        return sections.stream()
                       .map(this::buildSection)
                       .collect(toList());
    }

    private Section buildSection(SectionEntity sectionEntity) {
        List<Lesson> lessons = sectionEntity.getLessons() == null
                ? Collections.emptyList()
                : lessonTransformer.buildLessons(sectionEntity.getLessons());
        return Section.builder()
                      .id(sectionEntity.getId())
                      .creationDate(sectionEntity.getCreationDate())
                      .name(sectionEntity.getName())
                      .courseId(sectionEntity.getCourse().getId())
                      .lessons(lessons)
                      .build();
    }

    public List<SectionEntity> buildSectionsEntities(List<Section> sections) {
        return sections.stream()
                .map(this::buildSectionEntity)
                .collect(toList());

    }

    private SectionEntity buildSectionEntity(Section section) {
        return new SectionEntity()
                .setName(section.getName())
                .setCourse(courseService.findById(section.getCourseId()));
    }
}
