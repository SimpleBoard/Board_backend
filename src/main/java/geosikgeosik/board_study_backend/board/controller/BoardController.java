package geosikgeosik.board_study_backend.board.controller;

//import board.dto.BoardListResponseDto;
//import board.dto.BoardRequestDto;
//import board.dto.BoardResponseDto;
import geosikgeosik.board_study_backend.board.dto.BoardRequestDto;
import geosikgeosik.board_study_backend.board.repository.BoardListResponseDto;
import geosikgeosik.board_study_backend.board.repository.BoardResponseDto;
import geosikgeosik.board_study_backend.board.service.BoardService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class BoardController {
    private final BoardService boardService;

    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    // 글 등록
    @PostMapping("/board")
    public BoardResponseDto createBoard(@RequestBody BoardRequestDto requestDto){
        BoardResponseDto board = boardService.createBoard(requestDto);
        return board;
    }

    // 전체 목록 조회
    @GetMapping("/boards")
    public List<BoardListResponseDto> getAllBoards() {
        return boardService.findAllBoard();
    }

    // 글 하나 조회
     @GetMapping("/board/{id}")
     public BoardResponseDto getBoard(@PathVariable Long id) {
         return boardService.getBoard(id);
     }

    // 글 수정
    @PutMapping("/board/{id}")
    public Long updateBoard(@PathVariable Long id, @RequestBody BoardRequestDto requestDto) {
        return boardService.updateBoard(id,requestDto);
    }

    // 글 삭제
    @DeleteMapping("/board/{id}")
    public Long deleteBoard(@PathVariable Long id) {
        return  boardService.deleteBoard(id);
    }
}
