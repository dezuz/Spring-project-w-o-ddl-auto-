package com.hurko.model;

import com.fasterxml.jackson.databind.ser.Serializers;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
@Setter
@Getter
@NoArgsConstructor
@Table(name = "user")
@Accessors(chain = true)
public class UserEntity extends BaseEntity {

    @Column(name = "age")
    private Long age;

    @Column(name = "login")
    private String login;

    @Column(name = "name")
    private String name;

    @Column(name = "role")
    @Enumerated(EnumType.STRING)
    private Role role;
}
