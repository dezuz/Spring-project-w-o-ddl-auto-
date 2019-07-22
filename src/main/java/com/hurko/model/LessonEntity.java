package com.hurko.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
@Table(name = "lesson")
@Accessors(chain = true)
public class LessonEntity extends CreatableEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "content")
    private String content;

    @ManyToOne
    @JoinColumn(name = "section_id")
    private SectionEntity section;

    @OneToMany(mappedBy = "lesson", cascade = CascadeType.ALL)
    private List<CommentEntity> comments = new ArrayList<>();
}
