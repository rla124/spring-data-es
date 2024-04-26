package com.search.es.presentation;

import lombok.Getter;

@Getter
public class MemberRequest {

    private String name;
    private String description;

    private MemberRequest() {
    }

    public MemberRequest(String name, String description) {
        this.name = name;
        this.description = description;
    }

}
