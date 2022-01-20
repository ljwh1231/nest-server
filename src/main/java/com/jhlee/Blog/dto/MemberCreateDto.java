package com.jhlee.Blog.dto;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
@Builder
public class MemberCreateDto {

    private Long id;

    @NotBlank
    private String grade;

    @NotBlank
    private String name;

    @NotBlank
    private String password;

    @NotBlank
    private String email;
}
