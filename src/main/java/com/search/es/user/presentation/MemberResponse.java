package com.search.es.user.presentation;

import com.search.es.user.application.MemberResponseDto;
import lombok.Getter;

@Getter
public class MemberResponse {

    private Long id;
    private String name;
    private String description;

    private MemberResponse() {
    }

    public MemberResponse(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public static MemberResponse from(MemberResponseDto memberResponseDto) {
        return new MemberResponse(
                memberResponseDto.getId(),
                memberResponseDto.getName(),
                memberResponseDto.getDescription()
        );
    }
}
