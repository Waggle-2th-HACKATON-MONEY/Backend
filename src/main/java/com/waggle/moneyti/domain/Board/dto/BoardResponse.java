package com.waggle.moneyti.domain.Board.dto;

import com.waggle.moneyti.domain.Board.Board;
import com.waggle.moneyti.domain.enums.MoneyTI;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


public class BoardResponse {

    @Builder
    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class BoardPost {
        private Long id;
        private LocalDateTime createdAt;
    }

    public static BoardPost toBoardPost(Long id) {
        return BoardPost.builder()
            .id(id)
            .createdAt(LocalDateTime.now())
            .build();
    }

    @Builder
    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class BoardList {
        private String content;
        private String moneyti;
    }

    public static BoardList toBoardList(Board board) {

        return BoardList.builder()
            .content(board.getContent())
            .moneyti(board.getMoneyTI().getMoneyTId())
            .build();
    }


    public static Board toEntity(BoardRequest request) {

        return Board.builder()
            .content(request.getContent())
            .moneyTI(MoneyTI.valueOf(request.getMoneyti()))
            .build();
    }
}
