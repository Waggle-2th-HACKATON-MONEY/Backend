package com.waggle.moneyti.global.gpt.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChatResultResponse {
    private String recommendHabit;
    private String recommendProduct;
}
