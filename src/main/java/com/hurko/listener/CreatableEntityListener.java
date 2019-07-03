package com.hurko.listener;

import com.hurko.model.CreatableEntity;

import javax.persistence.PrePersist;
import java.util.Date;

public class CreatableEntityListener {

    @PrePersist
    public void prePersist(CreatableEntity entity) {
        entity.setCreationDate(new Date().getTime());
    }
}
