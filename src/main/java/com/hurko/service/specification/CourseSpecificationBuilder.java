package com.hurko.service.specification;

import org.springframework.data.jpa.domain.Specification;

public class CourseSpecificationBuilder<R> extends CommonSpecificationBuilder<R> {

    @Override
    public Specification<R> build(SpecificationCriteria criteria) {
        return Specification.where(super.build(criteria));
    }
}
