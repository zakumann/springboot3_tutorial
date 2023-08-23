package me.shinsunyoung.springbootdeveloper.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity //Set entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Article {

    @Id // Set id filed as default
    @GeneratedValue(strategy = GenerationType.IDENTITY) // +1
    @Column(name = "id", updatable = false)
    private long id;

    @Column(name = "title", nullable = false)// mapping with not null as 'title'
    private String title;

    @Column(name = "content", nullable = false)
    private String content;

    @Builder // Crete object as builder pattern
    public Article(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
