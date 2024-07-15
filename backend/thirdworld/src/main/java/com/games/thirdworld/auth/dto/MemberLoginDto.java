package com.games.thirdworld.auth.dto;

import com.games.thirdworld.auth.entity.Member;
import lombok.Builder;
import lombok.Getter;

@Getter
public class MemberLoginDto {

    private String id;

    private String password;

    @Builder
    public Member toEntity() {
        return Member.builder()
                .id(id)
                .password(password)
                .build();
    }

}
