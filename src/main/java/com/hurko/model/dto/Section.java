package com.hurko.model.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

@Getter
@Setter
@Builder
@Accessors(chain = true)
public class Section {
    private Long id;
    private Long creationDate;
    private String name;
    private Long courseId;
    private List<Lesson> lessons;
}
