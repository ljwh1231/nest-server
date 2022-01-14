package com.jhlee.Blog.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
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
