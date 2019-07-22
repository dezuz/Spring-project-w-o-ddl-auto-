package com.hurko.model.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public class Comment {
    private Long id;
    private Long creationDate;
    private String content;
    private Long authorId;
    private Long lessonId;
}
