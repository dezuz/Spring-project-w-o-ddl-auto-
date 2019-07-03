package com.hurko.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Setter
@Getter
@Table(name = "course")
@Accessors(chain = true)
public class CourseEntity extends CreatableEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "cost")
    private Long cost;

    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
    private List<SectionEntity> sections = new ArrayList<>();
}
