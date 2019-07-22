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
public class Lesson {
    private Long id;
    private Long creationDate;
    private String name;
    private String content;
    private Long sectionId;
    private List<Comment> comments;
}
