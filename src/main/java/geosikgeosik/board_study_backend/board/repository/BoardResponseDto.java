package geosikgeosik.board_study_backend.board.repository;

import geosikgeosik.board_study_backend.board.domain.Board;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
public class BoardResponseDto {

    private String title;

    private String content;

    private LocalDateTime createdAt;

    private LocalDateTime modifiedAt;

    // board의 정보를 받아 boardResponseDto 생성
    public BoardResponseDto(Board board) {
        this.title = board.getTitle();
        this.content = board.getContent();
        this.createdAt = board.getModifiedAt();
        this.modifiedAt = board.getCreatedAt();
    }
}