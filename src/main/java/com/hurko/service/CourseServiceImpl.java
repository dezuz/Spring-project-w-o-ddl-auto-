package com.hurko.service;

import com.hurko.model.CourseEntity;
import com.hurko.model.SectionEntity;
import com.hurko.model.dto.SpecificationRequest;
import com.hurko.repository.CourseRepository;
import com.hurko.service.specification.CourseSpecificationFactory;
import com.hurko.service.specification.SpecificationCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

import static com.hurko.transformer.SpecificationTransformer.buildCriteria;

@Service
public class CourseServiceImpl implements CourseService{

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private CourseSpecificationFactory specificationFactory;

    @Override
    public List<CourseEntity> findAll() {
        return courseRepository.findAll();
    }

    @Override
    public CourseEntity createCourse(CourseEntity course) {
        return courseRepository.save(course);
    }

    @Override
    public CourseEntity findById(Long id) {
        return courseRepository.findById(id).orElseThrow(NullPointerException::new);
    }

    @Override
    public CourseEntity updateCourse(Long id, CourseEntity course) {
        CourseEntity returnedEntity = courseRepository.findById(id).orElseThrow(NullPointerException::new);
        return courseRepository.save(mergeCourseEntities(returnedEntity, course));
    }

    @Override
    public void deleteById(Long id) {
        courseRepository.deleteById(id);
    }

    @Override
    public List<CourseEntity> findAll(SpecificationRequest request) {
        SpecificationCriteria specificationCriteria = buildCriteria(request);

        Specification<CourseEntity> specification = specificationFactory.build(specificationCriteria);

        return courseRepository.findAll(specification);
    }

    private CourseEntity mergeCourseEntities(CourseEntity resultEntity, CourseEntity templateEntity) {
        List<SectionEntity> sections = templateEntity.getSections() == null
                ? Collections.emptyList()
                : templateEntity.getSections();
        return resultEntity
                .setName(templateEntity.getName())
                .setCost(templateEntity.getCost())
                .setSections(sections);
    }
}
