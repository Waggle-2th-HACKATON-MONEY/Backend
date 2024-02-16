package com.waggle.moneyti.domain.Board.controller;

import com.waggle.moneyti.domain.Board.dto.BoardRequest;
import com.waggle.moneyti.domain.Board.dto.BoardResponse.BoardList;
import com.waggle.moneyti.domain.Board.dto.BoardResponse.BoardPost;
import com.waggle.moneyti.domain.Board.service.BoardService;
import com.waggle.moneyti.global.response.ApiResponse;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;

    @GetMapping("/boards")
    @Parameters({
        @Parameter(name = "moneyTI", description = "MoneyTI, Request Param 입니다.!"),
        @Parameter(name = "page", description = "리뷰의 페이지 번호, query string 입니다.!")
    })
    public ApiResponse<List<BoardList>> getBoardList(@RequestParam(name = "page") Integer page,
        @RequestParam(name = "moneyTI") String moneyTI) {
        return ApiResponse.onSuccess(boardService.getBoardList(page, moneyTI));
    }

    @PostMapping
    public ApiResponse<BoardPost> postBoard(@RequestBody BoardRequest request) {
        return ApiResponse.onSuccess(boardService.postBoard(request));
    }
}
