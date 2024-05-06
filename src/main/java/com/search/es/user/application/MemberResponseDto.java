package com.search.es.user.application;

import com.search.es.user.domain.Member;
import lombok.Getter;

@Getter
public class MemberResponseDto {

    private Long id;
    private String name;
    private String description;

    private MemberResponseDto() {
    }

    public MemberResponseDto(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public static MemberResponseDto from(Member member) {
        return new MemberResponseDto(member.getId(), member.getName(), member.getDescription());
    }

}
