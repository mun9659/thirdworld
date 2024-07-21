package com.games.thirdworld.auth.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Entity
@Getter
@EntityListeners(AuditingEntityListener.class)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@DynamicInsert
public class Member {

    @Id
    @GeneratedValue
    @Column(name = "memberId")
    private Long id;

    private String memId;

    private String password;

    private LocalDateTime createDt;

    private LocalDateTime updateDt;

    @Builder
    public Member(Long id, String memId, String password) {
        this.id = id;
        this.memId = memId;
        this.password = password;
    }
}
