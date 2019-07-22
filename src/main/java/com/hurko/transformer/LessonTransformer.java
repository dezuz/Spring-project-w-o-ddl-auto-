package com.hurko.transformer;

import com.hurko.model.LessonEntity;
import com.hurko.model.dto.Lesson;
import org.springframework.stereotype.Component;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Component
public class LessonTransformer {

    public List<Lesson> buildLessons(List<LessonEntity> lessons) {
        return lessons.stream()
                .map(this::buildLesson)
                .collect(toList());
    }

    public Lesson buildLesson(LessonEntity lessonEntity) {
        return Lesson.builder()
                .id(lessonEntity.getId())
                .creationDate(lessonEntity.getCreationDate())
                .name(lessonEntity.getName())
                .content(lessonEntity.getContent())
                .sectionId(lessonEntity.getSection().getId())
                .comments(null)
                .build();
    }
}
