package com.prgrms.himin.member.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {

	boolean existsMemberByLoginIdAndPassword(String loginId, String password);
}
