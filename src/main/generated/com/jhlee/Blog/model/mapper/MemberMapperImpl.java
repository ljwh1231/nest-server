package com.jhlee.Blog.model.mapper;

import com.jhlee.Blog.dto.MemberDto;
import com.jhlee.Blog.model.Member;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-12-28T19:13:09+0900",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 11.0.12 (Oracle Corporation)"
)
@Component
public class MemberMapperImpl implements MemberMapper {

    @Override
    public Member toEntity(MemberDto member) {
        if ( member == null ) {
            return null;
        }

        Member member1 = new Member();

        member1.setId( member.getId() );
        member1.setGrade( member.getGrade() );
        member1.setName( member.getName() );
        member1.setPassword( member.getPassword() );
        member1.setEmail( member.getEmail() );

        return member1;
    }

    @Override
    public MemberDto toDto(Member member) {
        if ( member == null ) {
            return null;
        }

        MemberDto memberDto = new MemberDto();

        memberDto.setId( member.getId() );
        memberDto.setGrade( member.getGrade() );
        memberDto.setName( member.getName() );
        memberDto.setPassword( member.getPassword() );
        memberDto.setEmail( member.getEmail() );

        return memberDto;
    }
}
