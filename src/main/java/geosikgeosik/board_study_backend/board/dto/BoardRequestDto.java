package geosikgeosik.board_study_backend.board.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
@Setter
public class BoardRequestDto {

    private String title;

    private String content;
}