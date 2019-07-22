package com.hurko.model.dto;

import com.hurko.model.Role;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public class User {
    private Long id;
    private Long age;
    private String login;
    private String name;
    private Role role;
}
