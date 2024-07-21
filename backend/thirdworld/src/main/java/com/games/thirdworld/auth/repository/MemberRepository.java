package com.games.thirdworld.auth.repository;


import com.games.thirdworld.auth.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {

    Optional<Member> findByMemIdAndPassword(String memId, String password);

}
