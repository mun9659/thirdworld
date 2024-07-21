package com.games.thirdworld.auth.dto;

import com.games.thirdworld.auth.entity.Member;
import lombok.Builder;
import lombok.Getter;

@Getter
public class MemberLoginDto {

    private String memId;

    private String password;

    @Builder
    public Member toEntity() {
        return Member.builder()
                .memId(memId)
                .password(password)
                .build();
    }

}
