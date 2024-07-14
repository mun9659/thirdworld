package com.games.thirdworld.auth.controller;

import com.games.thirdworld.auth.dto.MemberJoinDto;
import com.games.thirdworld.auth.entity.Member;
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

    @PostMapping("/join")
    public ResponseEntity<Member> join(@RequestBody MemberJoinDto memberJoinDto) {
        return ResponseEntity.ok(null);
    }

    @PostMapping("/login")
    public ResponseEntity<Member> login(@RequestBody MemberJoinDto memberJoinDto) {
        return ResponseEntity.ok(null);
    }

}
