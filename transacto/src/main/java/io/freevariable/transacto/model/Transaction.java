package io.freevariable.transacto.model;


import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class Transaction {
    private String transactionId;
    private String accountId;
    private Integer amount;
    private LocalDateTime timestamp;
    private TransactionType type;

    public enum TransactionType {
        DEPOSIT,
        WITHDRAWAL
    }
}
