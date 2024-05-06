package com.search.es.user.application;

import lombok.Getter;

@Getter
public class MemberRequestDto {

    private String name;
    private String description;

    private MemberRequestDto() {
    }

    public MemberRequestDto(String name, String description) {
        this.name = name;
        this.description = description;
    }
}
