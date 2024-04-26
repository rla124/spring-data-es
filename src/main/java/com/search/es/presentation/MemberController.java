package com.search.es.presentation;

import com.search.es.application.MemberRequestDto;
import com.search.es.application.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("/api")
@RestController
public class MemberController {

    private final MemberService memberService;

    @PostMapping("/users")
    public ResponseEntity<Void> save(@RequestBody MemberRequest memberRequest) {
        MemberRequestDto memberRequestDto = new MemberRequestDto(
                memberRequest.getName(),
                memberRequest.getDescription()
        );

        return null;
    }
}
