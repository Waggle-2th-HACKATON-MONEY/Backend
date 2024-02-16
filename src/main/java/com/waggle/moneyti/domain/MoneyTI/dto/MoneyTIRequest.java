package com.waggle.moneyti.domain.MoneyTI.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MoneyTIRequest {
    Integer[] request = new Integer[10];
}
