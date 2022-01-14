package com.jhlee.Blog.model;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "BOARD")
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "post_id", unique = true, nullable = false)
    private Long id;

    @ManyToOne(cascade = CascadeType.MERGE, targetEntity = Member.class)
    @JoinColumn(name = "user_id", updatable = false)
    private Member member;

    @Column(length = 20, nullable = false)
    private String category;

    @Column(length = 100, nullable = false)
    private String title;

    @Column(columnDefinition = "LONGTEXT")
    private String contents;

    @Column
    private Integer hits;

    @Column(name = "regi_date")
    @CreationTimestamp
    private LocalDateTime regiDate;

    @Column(name = "modi_date")
    @UpdateTimestamp
    private LocalDateTime modiDate;

    @Builder
    public Board(Member member, String category, String title, String contents, Integer hits, LocalDateTime regiDate, LocalDateTime modiDate) {
        this.member = member;
        this.category = category;
        this.title = title;
        this.contents = contents;
        this.hits = hits;
        this.regiDate = regiDate;
        this.modiDate = modiDate;
    }
}
