package com.games.thirdworld.auth.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.games.thirdworld.auth.entity.Member;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class MemberDto {

    private Long id;

    private String memId;

    @JsonIgnore
    private String password;

    private LocalDateTime createDt;

    private LocalDateTime updateDt;

    public static MemberDto of(Member member) {
        return MemberDto.builder()
                .id(member.getId())
                .memId(member.getMemId())
                .createDt(member.getCreateDt())
                .updateDt(member.getUpdateDt())
                .build();
    }

}
