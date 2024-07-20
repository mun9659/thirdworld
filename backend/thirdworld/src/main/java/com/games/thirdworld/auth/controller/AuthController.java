package com.games.thirdworld.auth.controller;

import com.games.thirdworld.auth.dto.MemberDto;
import com.games.thirdworld.auth.dto.MemberJoinDto;
import com.games.thirdworld.auth.dto.MemberLoginDto;
import com.games.thirdworld.auth.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/auth")
public class AuthController {

    private final MemberService memberService;

    @PostMapping("/join")
    public ResponseEntity<MemberDto> join(@RequestBody MemberJoinDto memberJoinDto) {

        MemberDto memberDto = memberService.createMember(memberJoinDto);

        return ResponseEntity.ok(memberDto);
    }

    @PostMapping("/login")
    public ResponseEntity<MemberDto> login(@RequestBody MemberLoginDto memberLoginDto) {

        MemberDto memberDto = memberService.loginMember(memberLoginDto);

        return ResponseEntity.ok(memberDto);
    }

}
