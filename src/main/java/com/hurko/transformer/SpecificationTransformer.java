package com.hurko.transformer;

import com.hurko.model.dto.SpecificationRequest;
import com.hurko.service.specification.SpecificationCriteria;
import org.springframework.stereotype.Component;

@Component
public class SpecificationTransformer {

    public static SpecificationCriteria buildCriteria(SpecificationRequest request) {
        return SpecificationCriteria.builder()
                                    .name(request.getName())
                                    .build();
    }

}
