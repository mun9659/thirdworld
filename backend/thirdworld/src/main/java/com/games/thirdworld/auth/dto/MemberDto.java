package com.games.thirdworld.auth.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.games.thirdworld.auth.entity.Member;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class MemberDto {

    private Long memId;

    private String id;

    @JsonIgnore
    private String password;

    private LocalDateTime createDt;

    private LocalDateTime updateDt;

    public static MemberDto of(Member member) {
        return MemberDto.builder()
                .memId(member.getMem_id())
                .id(member.getId())
                .createDt(member.getCreateDt())
                .updateDt(member.getUpdateDt())
                .build();
    }

}
