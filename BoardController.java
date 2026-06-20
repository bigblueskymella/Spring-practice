package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@__________
@RequiredArgsConstructor
@RequestMapping("/api/boards")
public class BoardController {

    private final BoardRepository boardRepository;

    // 글 등록
    @__________
    public Board createBoard(@RequestBody Board board) {
        return boardRepository.__________(board);
    }

    // 목록 조회
    @__________
    public List<Board> getAllBoards() {
        return boardRepository.__________();
    }
}
