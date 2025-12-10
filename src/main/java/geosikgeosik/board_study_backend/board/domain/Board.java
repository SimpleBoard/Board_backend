package geosikgeosik.board_study_backend.board.domain;

//import board.dto.BoardRequestDto;
//import board.dto.Timestamped;
import geosikgeosik.board_study_backend.board.dto.BoardRequestDto;
import geosikgeosik.board_study_backend.global.common.Timestamped;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "board")
public class Board extends Timestamped {
    // 글 고유 아이디
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    // 글 제목
    @Column(nullable = false)
    private String title;

    // 글 내용
    @Column(nullable = false)
    private String content;

    // requestDto 정보를 가져와서 entity 만들 때 사용
    public Board(BoardRequestDto requestDto) {
        this.title = requestDto.getTitle();
        this.content = requestDto.getContent();
    }

    // 업데이트 메소드
    public void update(BoardRequestDto requestDto) {
        this.title = requestDto.getTitle();
        this.content = requestDto.getContent();
    }
}