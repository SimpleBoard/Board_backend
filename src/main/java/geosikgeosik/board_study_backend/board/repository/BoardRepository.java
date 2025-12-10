package geosikgeosik.board_study_backend.board.repository;

//import board.dto.BoardListResponseDto;

import geosikgeosik.board_study_backend.board.domain.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface BoardRepository extends JpaRepository<Board, Long> {
    List<BoardListResponseDto> findAllByOrderByModifiedAtDesc();
}