package com.games.thirdworld.auth.service;

import com.games.thirdworld.auth.dto.MemberDto;
import com.games.thirdworld.auth.dto.MemberJoinDto;
import com.games.thirdworld.auth.dto.MemberLoginDto;
import com.games.thirdworld.auth.entity.Member;
import com.games.thirdworld.auth.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public MemberDto createMember(MemberJoinDto memberJoinDto) {

        Member member = Member.builder()
                .id(memberJoinDto.getId())
                .password(memberJoinDto.getPassword())
                .build();

        memberRepository.save(member);

        return MemberDto.of(member);
    }

    public MemberDto loginMember(MemberLoginDto memberLoginDto) {

        Member member = memberRepository.findByIdAndPassword(memberLoginDto.toEntity()).orElseThrow();

        return MemberDto.of(member);
    }

}
