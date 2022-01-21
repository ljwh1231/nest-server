package com.jhlee.Blog.model;

import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.*;

@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Data
@Table(name = "MEMBER")
@Entity
public class Member implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", unique = true, nullable = false)
    private Long id;

    @Column(length = 20, nullable = false)
    private String grade;

    @Column(length = 20, nullable = false)
    private String name;

    @Column(length = 100, nullable = false)
    private String password;

    @Column(length = 100, nullable = false, unique = true)
    private String email;

    @Builder
    public Member(String grade, String name, String password, String email) {
        this.grade = grade;
        this.name = name;
        this.password = password;
        this.email = email;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        Set<GrantedAuthority> roles = new HashSet<>();
        for (String role : grade.split(",")) {
            roles.add(new SimpleGrantedAuthority(role));
        }
        return roles;
    }

    // Member의 username 반환
    @Override
    public String getUsername() {
        return email;
    }

    // Member의 password 반환
    @Override
    public String getPassword() {
        return password;
    }

    // TODO : 계정 만료 여부 반환(만료 여부 체크 로직 구현 필요)
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    // TODO : 계정 잠금 여부 반환(잠김 여부 체크 로직 구현 필요)
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    // TODO : 패스워드 만료 여부 반환(패스워드 만료 여부 체크 로직 구현 필요)
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    // TODO : 계정 사용 가능 여부 반환(사용 가능 여부 체크 로직 구현 필요)
    @Override
    public boolean isEnabled() {
        return true;
    }
}
