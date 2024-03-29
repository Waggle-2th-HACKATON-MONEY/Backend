package com.waggle.moneyti.domain.Board;

import com.waggle.moneyti.domain.MoneyTI.MoneyTI;
import com.waggle.moneyti.global.common.BaseTimeEntity;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class Board extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "moneyti_id")
    private MoneyTI moneyTI;
    
    private String content;
}
