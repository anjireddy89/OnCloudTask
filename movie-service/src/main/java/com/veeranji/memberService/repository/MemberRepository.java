package com.veeranji.memberService.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.veeranji.memberService.models.Member;

@Repository("memberRepository")
public interface MemberRepository extends MongoRepository<Member, String> {

}
