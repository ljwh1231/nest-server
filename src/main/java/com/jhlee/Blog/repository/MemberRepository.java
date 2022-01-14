package com.jhlee.Blog.repository;

import com.jhlee.Blog.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {

}
