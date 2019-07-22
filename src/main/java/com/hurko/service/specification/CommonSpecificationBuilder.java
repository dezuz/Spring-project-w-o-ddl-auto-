package com.hurko.service.specification;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.util.ObjectUtils;

public abstract class CommonSpecificationBuilder<T> {

    private final static String NAME_KEY = "name";

    public Specification<T> build(SpecificationCriteria criteria){
        return Specification.where(buildName(criteria.getName()));
    }

    protected Specification<T> buildName(String name){
        return ObjectUtils.isEmpty(name)
                ? null
                : (root, query, builder) -> builder.like(root.get(NAME_KEY), name + "%");
    }
}
