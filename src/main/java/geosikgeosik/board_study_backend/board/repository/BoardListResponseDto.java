package geosikgeosik.board_study_backend.board.repository;

import geosikgeosik.board_study_backend.board.domain.Board;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Optional;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class BoardListResponseDto {
    private String title;

    private String username;

    private LocalDateTime createdAt;

    private LocalDateTime modifiedAt;

    // Entity -> dto
    public BoardListResponseDto(Board board) {
        this.title = board.getTitle();
        this.createdAt = board.getModifiedAt();
        this.modifiedAt = board.getCreatedAt();
    }

    public BoardListResponseDto(Optional<Board> board) {
        this.title = board.get().getTitle();
        this.createdAt = board.get().getModifiedAt();
        this.modifiedAt = board.get().getCreatedAt();
    }
}