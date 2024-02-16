package com.waggle.moneyti.domain.MoneyTI.dto;

import com.waggle.moneyti.global.gpt.dto.ChatResultResponse;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "게시글 작성 결과 DTO")
public class MoneyTIResponse {
    private String moneyTI;

    private ChatResultResponse recommendData;
}
