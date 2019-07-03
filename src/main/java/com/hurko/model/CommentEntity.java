package com.hurko.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Setter
@Getter
@Accessors(chain = true)
@Table(name = "comment")
public class CommentEntity extends CreatableEntity {

    @Column(name = "content")
    private String content;

    @Column(name = "author_id")
    private Long authorId;

    @ManyToOne
    private LessonEntity lesson;
}
