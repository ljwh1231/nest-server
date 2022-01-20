package com.jhlee.Blog.service;

import com.jhlee.Blog.dto.MemberCreateDto;
import com.jhlee.Blog.model.Member;
import com.jhlee.Blog.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService implements UserDetailsService {
    private final MemberRepository memberRepository;

    @Override
    public Member loadUserByUsername(String email) throws UsernameNotFoundException {
        return memberRepository.findByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException(email));
    }

    public Long save(MemberCreateDto memberCreateDto) {

        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        memberCreateDto.setPassword(encoder.encode(memberCreateDto.getPassword()));

        return memberRepository.save(Member.builder()
                .email(memberCreateDto.getEmail())
                .grade(memberCreateDto.getGrade())
                .password(memberCreateDto.getPassword())
                .build()).getId();
    }
}
