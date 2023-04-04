package com.filmdoms.community.article.data.dto.response.mainpage;

import com.filmdoms.community.account.data.dto.response.SimpleAccountResponseDto;
import com.filmdoms.community.article.data.entity.extra.Critic;
import com.filmdoms.community.file.data.dto.response.FileResponseDto;
import lombok.Getter;

import java.time.LocalDate;

/**
 * 메인 페이지의 비평 카테고리, recent 게시글 응답 DTO
 */
@Getter
public class CriticMainPageResponseDto extends ParentMainPageResponseDto {
    private FileResponseDto mainImage;
    private SimpleAccountResponseDto author;
    private String contentPreview;
    private LocalDate dateCreated;

    private CriticMainPageResponseDto(Critic critic) {
        super(critic.getArticle());
        this.mainImage = FileResponseDto.from(critic.getMainImage());
        this.author = SimpleAccountResponseDto.from(critic.getArticle().getAuthor());
        this.contentPreview = critic.getArticle().getContent().getContent();
        this.dateCreated = critic.getArticle().getDateCreated().toLocalDate();
    }

    public static CriticMainPageResponseDto from(Critic critic) {
        return new CriticMainPageResponseDto(critic);
    }
}
