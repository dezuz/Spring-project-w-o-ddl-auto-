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
@Table(name = "section")
@Accessors(chain = true)
public class SectionEntity extends CreatableEntity {

    @Column(name = "name")
    private String name;

    @ManyToOne
    private CourseEntity course;
}
