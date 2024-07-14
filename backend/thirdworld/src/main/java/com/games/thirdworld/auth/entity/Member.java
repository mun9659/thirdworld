package com.games.thirdworld.auth.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.ToString;

import java.time.LocalDateTime;

@Entity
@Data
@ToString
public class Member {

    @Column(name = "memId")
    private Long mem_id;

    private String id;

    private String password;

    private LocalDateTime createDt;

    private LocalDateTime updateDt;

}
