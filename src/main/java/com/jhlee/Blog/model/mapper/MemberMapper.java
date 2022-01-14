package com.jhlee.Blog.model.mapper;

import com.jhlee.Blog.dto.MemberDto;
import com.jhlee.Blog.model.Member;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.WARN)
public interface MemberMapper {

    MemberMapper INSTANCE = Mappers.getMapper(MemberMapper.class);

    Member toEntity(MemberDto member);
    MemberDto toDto(Member member);
}
