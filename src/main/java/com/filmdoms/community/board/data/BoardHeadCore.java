package com.filmdoms.community.board.data;

import com.filmdoms.community.account.data.entity.Account;
import com.filmdoms.community.board.data.constant.PostStatus;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class BoardHeadCore extends  BaseTimeEntity {

    @Id
    @GeneratedValue
    private Long id;

    private String title;

    @JoinColumn(name = "account_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Account author;

    private int view = 0;

    @Enumerated(EnumType.STRING)
    private PostStatus status = PostStatus.ACTIVE;

    @JoinColumn(name = "movie_review_content_id")
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private BoardContent content;


    @Builder
    public BoardHeadCore(String title, Account author, int view, PostStatus status, BoardContent content) {

        this.title = title;
        this.author = author;
        this.status = status;
        this.content = content;
    }

    public BoardHeadCore() {

    }
}
