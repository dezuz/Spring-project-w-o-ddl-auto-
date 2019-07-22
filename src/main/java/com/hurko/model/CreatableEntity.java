package com.hurko.model;

import com.hurko.listener.CreatableEntityListener;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

@Setter
@Getter
@MappedSuperclass
@NoArgsConstructor
@EntityListeners(value = CreatableEntityListener.class)
public class CreatableEntity extends BaseEntity {

    @Column(name = "creation_date")
    private Long creationDate;
}
