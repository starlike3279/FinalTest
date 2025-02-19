package com.example.test3.article;

import com.example.test3.user.SiteUser;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 200)
    private String title;

    @Column(columnDefinition = "Text")
    private String content;

    private LocalDateTime createDate;

    @ManyToOne
    private SiteUser author;

    private LocalDateTime modifyDate;

}